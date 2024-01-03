package JDBC;

import java.sql.*;

public class JDBCMySQL //implement basic operations of mysql through java
{
	 static final String DB_URL = "jdbc:mysql://localhost:3306/iss_practice";
	 static final String USER = "root";
	 static final String PASS = "Maanu1107%";
	
	 public static void main(String args[]) 
	{
		 try 
		 {
			 //creating connection
			 Connection connection=DriverManager.getConnection(DB_URL,USER,PASS);
			 
			 //creating a statement through which execution would be done
			 Statement statement=connection.createStatement();
			 
			 //implementing the basic CRUD operations in the already created table 
			 //employees table created in mysql 
			 
			 //create 
			 String createQuery="insert into employees(NAME, AGE, ADDRESS, OFFICE_LOCATION, EXPERIENCE) values(\"Andrew Kim\",20, \"234 Cider Lane\", \"New York\", 1);";
			 
			 statement.execute(createQuery);
			 
			 System.out.println("New entry successfully added");
			 
			 //read 
			 String readQuery="select * from employees;";
			 
			 ResultSet result=statement.executeQuery(readQuery);
			 
			 while(result.next()){
		            //Display values
		            System.out.print("ID: " + result.getInt("ID"));
		            System.out.print(", NAME: " + result.getString("NAME"));
		            System.out.print(", AGE: " + result.getInt("AGE"));
		            System.out.println(", ADDRESS: " + result.getString("ADDRESS"));
		            System.out.println(", OFFICE LOCATION: " + result.getString("OFFICE_LOCATION"));
		            System.out.println(", EXPERIENCE: " + result.getInt("EXPERIENCE"));
		         }
			 
			 //update
			 String updateQuery="update employees set OFFICE_LOCATION=\"TAMPA\" where ID=1;";
			 
			 statement.execute(updateQuery);
			 
			 System.out.println("ID 1 entry updated succcessfully");
			 
			 result=statement.executeQuery(readQuery);
			 
			 while(result.next()){
		            //Display values
		            System.out.print("ID: " + result.getInt("ID"));
		            System.out.print(", NAME: " + result.getString("NAME"));
		            System.out.print(", AGE: " + result.getInt("AGE"));
		            System.out.println(", ADDRESS: " + result.getString("ADDRESS"));
		            System.out.println(", OFFICE LOCATION: " + result.getString("OFFICE_LOCATION"));
		            System.out.println(", EXPERIENCE: " + result.getInt("EXPERIENCE"));
		         }
			 
			 //delete
			 String deleteQuery="delete from employees where ID=5;";
			 
			 statement.execute(deleteQuery);
			 
			 result=statement.executeQuery(readQuery);
			 
			 while(result.next()){
		            //Display values
		            System.out.print("ID: " + result.getInt("ID"));
		            System.out.print(", NAME: " + result.getString("NAME"));
		            System.out.print(", AGE: " + result.getInt("AGE"));
		            System.out.println(", ADDRESS: " + result.getString("ADDRESS"));
		            System.out.println(", OFFICE LOCATION: " + result.getString("OFFICE_LOCATION"));
		            System.out.println(", EXPERIENCE: " + result.getInt("EXPERIENCE"));
		         }
			 
		 }
		 
		 catch(Exception e)
		 {
			 System.out.println(e+"\tException occured");
		 }
		
	}
}
