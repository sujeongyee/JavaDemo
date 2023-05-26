package jdbc.demo.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DeptsDAO {

	// 멤버변수

	private String url = DBProperties.URL;
	private String uid = DBProperties.UID;
	private String upw = DBProperties.UPW;

	// 생성자

	public DeptsDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("CLASS FOR NAME ERR");
		}		
	}

	// 메서드 (데이터베이스 결과가 1행 => vo를 반환
	//		 데이터베이스 결과가 여러행 => List<VO>를 반환)
	public List<DeptsVO> getDepts(String name) {

		String sql = "SELECT * FROM DEPTS WHERE DEPARTMENT_NAME = ?";
		List<DeptsVO> list = new ArrayList<>(); 
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {			
			//conn , pstmt ,resultset	
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt=conn.prepareStatement(sql);
						
			pstmt.setString(1,name);
			rs= pstmt.executeQuery();

			while(rs.next()) {
				int department_id = rs.getInt("department_id");
				String department_name = rs.getString("department_name");
				int manager_id = rs.getInt("manager_id");
				int location_id = rs.getInt("location_id");
				
				//1행에 대한 값을 저장
				DeptsVO vo = new DeptsVO(department_id,department_name,manager_id,location_id);
				
				//리스트에 vo를 추가
				list.add(vo);				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
				rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}



		return list;
	}
	
	public int insertDepts(DeptsVO vo) {
		
		int result = 0; // 0이 반환 되면 실패, 1이 반환되면 성공
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO DEPTS (DEPARTMENT_ID , DEPARTMENT_NAME , MANAGER_ID, LOCATION_ID)\r\n"
				+ "VALUES(DEPTS2_SEQ.NEXTVAL ,?, ?, ?)";
		
		try {
			//2. conn
			conn = DriverManager.getConnection(url, uid, upw);
			//3. pstmt
			pstmt = conn.prepareStatement(sql);			
			pstmt.setString(1, vo.getDepartment_name());
			pstmt.setInt(2, vo.getManager_id());
			pstmt.setInt(3,vo.getLocation_id());
			
			//4.sql실행
			result = pstmt.executeUpdate(); // 성공시 1 반환, 실패시 0 반환
			
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
		
		
		
		
		return result;
	}






}
