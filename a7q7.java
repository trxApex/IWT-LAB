package assignment_7;
import java.sql.*;
import java.util.*;
public class a7q7 {
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
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Roll No to delete: ");
			int roll = sc.nextInt();
			String sql = "DELETE from studnew WHERE roll_no = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, roll);
			int i = pstmt.executeUpdate();
			System.out.println("Deleted Successfully");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
