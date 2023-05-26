package holy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import holy.main.MovieDBProperties;
import holy.vo.HmemberVO;


public class HMemberDAO {

	private String url = MovieDBProperties.URL;
	private String uid = MovieDBProperties.UID;
	private String upw = MovieDBProperties.UPW;

	Connection conn =null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;


	// 생성자

	public HMemberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("CLASS FOR NAME ERR");
		}		
	}

	// 메서드 (데이터베이스 결과가 1행 => vo를 반환
	//		 데이터베이스 결과가 여러행 => List<VO>를 반환)
	public List<HmemberVO> getMovie() { // 매개변수 뭘로 받아오는지..

		String sql = "SELECT * FROM HMEMBER";
		List<HmemberVO> list = new ArrayList<>(); 

		try {			
			//conn , pstmt ,resultset	
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt=conn.prepareStatement(sql);

			// 매개변수로 받아온 값

			rs= pstmt.executeQuery();

			while(rs.next()) {
				//String h_id, String h_name, String h_phone, String h_password
				String h_id = rs.getString("h_id");
				String h_name = rs.getString("h_name");
				String h_phone = rs.getString("h_phone");
				String h_password = rs.getString("h_password");

				//1행에 대한 값을 저장
				HmemberVO vo = new HmemberVO(h_id,h_name,h_phone,h_password);

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
	//회원가입	
	public void join(HmemberVO member) {

		String sql = "INSERT INTO HMEMBER VALUES ('ID'||LPAD(HMEMBER_SEQ.NEXTVAL,4,0), ?, ?, ?)";


		try {

			conn = DriverManager.getConnection(url, uid, upw);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(2, member.getH_name());
			pstmt.setString(3, member.getH_phone());
			pstmt.setString(4, member.getH_password());
			pstmt.executeUpdate();


		} catch (SQLException e) {
			System.out.println("join SQL문 오류");
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}



	}


	// 아이디 중복검사
	public boolean checkId(String h_id) {
		String sql = "SELECT COUNT(ID) FROM HMEMBER WHERE ID = ?";	
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, h_id);
			rs = pstmt.executeQuery();

			rs.next(); 
			if (rs.getInt(1) == 1) {
				return true;
			}

		} catch (SQLException e) {
			System.out.println("checkId SQL문 오류");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	// 로그인
	public boolean login(String h_id, String h_password) {
		String sql = "SELECT * FROM HMEMBER WHERE H_ID = ? AND H_PASSWORD = ?";
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, h_id);
			pstmt.setString(2, h_password);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return true;
			}
			return false;
			
		} catch (SQLException e) {
			System.out.println("login sql문 오류");
		}finally {
			try {
				if(rs!=null) {
					rs.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(conn!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
		
		return false;
	}
	
	

}
