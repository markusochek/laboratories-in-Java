package application;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import auntification.Auntification;
// import sessions.Sessions;

public class Application {
	
	public String authorization(String params[]) throws NoSuchAlgorithmException, SQLException {
        if (params[0] != null && params[1] != null) {
            return Auntification.authorization(params[0], params[1]);
        }
		return null;
    }
}
