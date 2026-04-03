package assignment_7;
import java.sql.*;
import java.util.*;
public class a7q4 {
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
			Scanner sc = new Scanner(System.in);
			String sql = "INSERT INTO studnew VALUES (?, ?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			System.out.print("Enter Roll No, Name, Age, Dept, CGPA: ");
			pstmt.setInt(1, sc.nextInt());
			pstmt.setString(2, sc.next());
			pstmt.setInt(3, sc.nextInt());
			pstmt.setString(4, sc.next());
			pstmt.setFloat(5, sc.nextFloat());
			int rows = pstmt.executeUpdate();
			System.out.println(rows + " record(s) inserted.");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}

