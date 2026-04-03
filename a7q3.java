package assignment_7;
import java.sql.*;
public class a7q3 {
	public static void main(String args[]) {
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
			String sql = "INSERT INTO studnew VALUES (?, ?, ?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, 26);
			stmt.setString(2, "ram");
			stmt.setInt(3, 20);
			stmt.setString(4, "CSE");
			stmt.setDouble(5, 9.12);
			stmt.executeUpdate();
			
			stmt.setInt(1, 25);
			stmt.setString(2, "laxman");
			stmt.setInt(3, 21);
			stmt.setString(4, "CSE");
			stmt.setDouble(5, 10.0);
			stmt.executeUpdate();
			System.out.println("Hardcoded data inserted!");
		}
		catch (Exception e) {
			System.out.print(e);
		}
	}

}
