package SqlPachage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sql {
	
	private String url;
	private Connection conn;
	
	public Sql(String username, String pass) {
		try 
		{
		this.url =  "jdbc:mysql://localhost/northwind?user=" + username + "&password=" + pass + "&useSSL=false";
		this.conn = DriverManager.getConnection(url);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	public String name(String SqlCommand) {
		PreparedStatement statement;
		try {
			statement = conn.prepareStatement(SqlCommand);
			ResultSet results = statement.executeQuery();
			results.next();
			String FirstName = results.getString("firstname");
			System.out.println(FirstName);
			return FirstName;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	
	

}
