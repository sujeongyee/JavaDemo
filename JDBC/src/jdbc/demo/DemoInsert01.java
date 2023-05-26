package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DemoInsert01 {
	
	public static void main(String[] args) {
		
		//입력될 값은 콘솔로 입력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("부서이름>");
		String name = scan.nextLine();
		System.out.println("매니저아이디>");
		String manager_id = scan.nextLine();
		System.out.println("로케이션아이디");
		String location_id = scan.nextLine();
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR";
		String upw = "HR";
		
		//insert, update, delete 는 ResultSet 객체가 필요 없음		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO DEPTS (DEPARTMENT_ID , DEPARTMENT_NAME , MANAGER_ID, LOCATION_ID)\r\n"
				+ "VALUES(DEPTS2_SEQ.NEXTVAL ,?, ?, ?)";
		
		try {
			//1.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. conn
			conn = DriverManager.getConnection(url, uid, upw);
			//3. pstmt
			pstmt = conn.prepareStatement(sql);			
			pstmt.setString(1, name);
			pstmt.setInt(2, Integer.parseInt(manager_id));
			pstmt.setInt(3,Integer.parseInt(location_id));
			
			//4.sql실행
			int result = pstmt.executeUpdate();
			System.out.println("성공실패?:"  +result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
