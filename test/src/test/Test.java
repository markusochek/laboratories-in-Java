package test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class Test {
	
	 public static void main(){

         System.out.print("À");}

   public static void main(String                             args){

         System.out.print("Á"); }
	
	public static String md5(String hash) throws NoSuchAlgorithmException {
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		byte[] bytes = md5.digest(hash.getBytes());
        StringBuilder builder = new StringBuilder();
        for (byte element : bytes) {
        	builder.append(String.format("%02X", element));
        }
        return builder.toString();
        
	}

	public static void main(String[] args) throws NoSuchAlgorithmException {
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		String login = "markus";
		String password = "markus";
		String hash = login + password;
        byte[] bytes = md5.digest(hash.getBytes());
        StringBuilder builder = new StringBuilder();
        for (byte b : bytes) {
        	builder.append(String.format("%02X", b));
        }
        System.out.println(builder);
        
        String hash1 = "DB09E1A43233504C0A47C403D4E23CF4";
        String token = UUID.randomUUID().toString();
    	System.out.println(token);
        token = md5(token);
        System.out.println(token);
        
	}
	
	
	

}
