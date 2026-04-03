package assignment_7;
import java.sql.*;
import java.util.*;
public class a7q6 {
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
			System.out.print("Enter Roll No to update: ");
			int roll = sc.nextInt();
			System.out.print("Enter New CGPA: ");
			float newCgpa = sc.nextFloat();
			String sql = "UPDATE studnew SET cgpa = ? WHERE roll_no = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setFloat(1, newCgpa);
			pstmt.setInt(2, roll);
			int i = pstmt.executeUpdate();
			System.out.println("Updated Successfully");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
