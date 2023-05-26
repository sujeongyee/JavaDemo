package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DemoUpdate01 {
	
	public static void main(String[] args) {
		
		// 부서아이디, 부서이름을 입력받아서, 해당 부서의 이름을 변경하는 update구문
		//UPDATE DEPTS
		//SET DEPARTMENT_NAME = ?
		//WHERE DEPARTMENT_ID = ?;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR";
		String upw = "HR";
		String sql = "UPDATE DEPTS\r\n"
				+ "SET DEPARTMENT_NAME = ?\r\n"
				+ "WHERE DEPARTMENT_ID = ?";
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("이름을 이걸로 변경할게요!");
		String name = scan.next();
		System.out.println("변경할 부서 아이디");
		int id = scan.nextInt();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		try {
			//1.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. conn
			conn = DriverManager.getConnection(url, uid, upw);
			//3. pstmt
			pstmt = conn.prepareStatement(sql);			
			pstmt.setString(1,name);
			pstmt.setInt(2,id);
			
			//4.sql실행
			int result = pstmt.executeUpdate();
			System.out.println("성공실패?:"  +result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
