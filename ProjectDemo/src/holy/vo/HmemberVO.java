package holy.vo;

public class HmemberVO {

	/*
	 * HID       NOT NULL VARCHAR2(100) 
		HNAME     NOT NULL VARCHAR2(100) 
		HPHONE    NOT NULL VARCHAR2(100) 
		HPASSWORD NOT NULL VARCHAR2(100) 
	 */
	
	private String h_id;
	private String h_name;
	private String h_phone;
	private String h_password;
	
	public HmemberVO() {
		// TODO Auto-generated constructor stub
	}

	public HmemberVO(String h_id, String h_name, String h_phone, String h_password) {
		super();
		this.h_id = h_id;
		this.h_name = h_name;
		this.h_phone = h_phone;
		this.h_password = h_password;
	}

	public String getH_id() {
		return h_id;
	}

	public void setH_id(String h_id) {
		this.h_id = h_id;
	}

	public String getH_name() {
		return h_name;
	}

	public void setH_name(String h_name) {
		this.h_name = h_name;
	}

	public String getH_phone() {
		return h_phone;
	}

	public void setH_phone(String h_phone) {
		this.h_phone = h_phone;
	}

	public String getH_password() {
		return h_password;
	}

	public void setH_password(String h_password) {
		this.h_password = h_password;
	}

	
	
}
