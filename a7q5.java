package assignment_7;
import java.sql.*;
public class a7q5 {
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
			String sql = "SELECT * FROM studnew";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
			    System.out.println(rs.getInt("roll_no") + 
			                       rs.getString("name") + 
			                       rs.getString("department") + 
			                       rs.getFloat("cgpa"));
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
