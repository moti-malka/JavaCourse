package SqlPachage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnecToSql {
	public static void main(String[] args) {

	
		
		try 
		{
			String url = "jdbc:mysql://localhost/northwind?user=root&password=Aa0505758244" + "&useSSL=false";

			Connection conn = DriverManager.getConnection(url);
			PreparedStatement statement = conn.prepareStatement("select * from employees");
			ResultSet results = statement.executeQuery();
			results.next();
			String FirstName = results.getString("firstname");
			System.out.println(FirstName);
			
			/*
			while (results.next()) {
				String FirstName = results.getString("firstname");
				String Address = results.getString("Address");
				String HomePhone = results.getString("HomePhone");
				String City = results.getString("City");
				Emploeey Emploeey = new Emploeey(FirstName, Address, HomePhone, City);
				//System.out.println('\n' + Emploeey.toString());
				
			}
*/
		} 
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
