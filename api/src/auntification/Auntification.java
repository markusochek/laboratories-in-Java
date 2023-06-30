package auntification;

import db.DB;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class Auntification {
	
	private static DB db = new DB();
	
	public static String md5(String hash) throws NoSuchAlgorithmException {
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		byte[] bytes = md5.digest(hash.getBytes());
        StringBuilder builder = new StringBuilder();
        for (byte element : bytes) {
        	builder.append(String.format("%02X", element));
        }
        hash = builder.toString();
		return hash;
	}
	
    public static String authorization(String login, String password) throws SQLException, NoSuchAlgorithmException {

        ResultSet response = db.getUsersIdPass(login);
        String user = response.getString(1);
        if (user != null) {
            String hash = login + password;
            
	        hash = md5(hash);
	        hash = md5(hash);
	        
			if (user + password == hash) {
			    String token = UUID.fromString(hash).toString();
			    token = md5(token);
			
			    if(db.updateUsersToken(user, token)) 
			        return token;
			}
        }
        return "";
    }
}