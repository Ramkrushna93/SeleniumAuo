package JdbcConnectionsOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectionsOperations {
	
	public static void main(String[] args) throws SQLException {
		
		//Creating a connections
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		
		//Creating Statement
		Statement stmt=con.createStatement();
		
		String s="INSERT INTO STUDENT VALUES(110,'SMITH')";
		
		String s1="UPDATE STUDENT SET SNAME='RAJU' WHERE SNO=110";
		
		//Execuiting Statement
		stmt.execute(s1);
		
		//Connections Closed
		con.close();
		
		System.out.println("The query is execuited.......");
		
	}

}
