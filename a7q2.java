package assignment_7;
import java.sql.*;
public class a7q2 {

	public static void main(String[] args) {
		try {
			String driver = "org.postgresql.Driver";
			String url = "jdbc:postgresql://192.168.1.17/cse_db24";
			String username = "24bcsa28";
			String password = "24bcsa28";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			if(con != null) {
				System.out.println("connection successful");
			}
			Statement stmt = con.createStatement();
            String createQuery = "CREATE TABLE studnew (" +
                    "roll_no INT PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "age INT, " +
                    "department VARCHAR(30), " +
                    "cgpa NUMERIC(4,2))";

            stmt.executeUpdate(createQuery);
            System.out.println("Table is created");
		}
		catch (Exception e) {
			System.out.print(e);
		}
	
	}

}
