package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	
    private static final String url = "jdbc:mysql://localhost:3306/alcohol_shock";
    private static final String user = "root";
    private static final String password = "";

    private Connection connection;
    private Statement statement;
    
    private static String wrap(String word) {
    	word = "'" + word + "'";
		return word;
	}
    
//    private static String wrap(int number) {
//    	Integer numberInt = number;
//    	String word = "'" + numberInt.toString() + "'";
//		return word;
//	}
    
    public boolean isToken(String token) throws SQLException {
    	String query = "SELECT `id` FROM `users`"
    			+ " WHERE `token` = " + DB.wrap(token);
    	return isExecuteQuery(query);
    }
    
    public boolean updateUsersToken(String user, String token) throws SQLException {
    	String query = "UPDATE `users` SET `token` =" + DB.wrap(token)
    			+ " WHERE `id` = " + DB.wrap(user) + "'.id'";
        return executeUpdate(query);
    }
    
    public boolean insertUsers(String login, String hash, String name) throws SQLException {
    	PreparedStatement preparedStatement = null;
    	preparedStatement = connection.prepareStatement("INSERT INTO `users` (login, pass, name, token)"
    			+ " VALUES (?, ?, ?, ?)");
    	
    	preparedStatement.setString(1, login);
    	preparedStatement.setString(2, hash);
    	preparedStatement.setString(3, name);
    	preparedStatement.setString(4, "");
        return executeUpdate(preparedStatement);
    }
    
    public ResultSet getUsersIdPass(String login) throws SQLException {
    	String query = "SELECT `id`, `pass` FROM `users` WHERE `login` = " + DB.wrap(login);
    	return executeQuery(query);
    }

	public ResultSet getUsersId(String login) throws SQLException {
    	String query = "SELECT `id` FROM `users` WHERE `login` = " + DB.wrap(login);
    	return executeQuery(query);
    }
    
    
    
    public ResultSet executeQuery(String query) throws SQLException {
    	return statement.executeQuery(query);
    }
    
    public boolean isExecuteQuery(String query) throws SQLException {
    	if(statement.executeQuery(query) != null) {
    		return true;
    	}
    	return false;
    }
    
    public boolean executeUpdate(String query) throws SQLException {
    	if(statement.executeUpdate(query) != 0) {
            return true;
        }
        return false;
    }
    
    public boolean executeUpdate(PreparedStatement preparedStatement) throws SQLException {
    	if(preparedStatement.executeUpdate() != 0) {
            return true;
        }
        return false;
    }
    
    public DB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            
        } catch (SQLException exception) {
            exception.printStackTrace();
            
        } catch (ClassNotFoundException exception) {
            System.out.println("Where is your MySQL JDBC Driver?");
            exception.printStackTrace();
            return;
        }
        
        
//   	 while (resultSet.next()) {
//      int id = resultSet.getInt(1);
//      String name = resultSet.getString(2);
//      System.out.printf("id: %d, name: %s %n", id, name);
//   	}

    }
    
    public void finalize() throws Throwable{
             try {
                 connection.close();
             } catch (SQLException exception) {
                 System.out.println("connection is not closed");
                 exception.printStackTrace();
             }
             try {
                 statement.close();
             } catch (SQLException exception) {
                 System.out.println("statement is not closed");
                 exception.printStackTrace();
             }
    }
}

