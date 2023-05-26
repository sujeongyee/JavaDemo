package holy.vo;

public class TicketorderVO {
	/*
	 * TORDERNO   NOT NULL VARCHAR2(99) 
	HID                 VARCHAR2(99) 
	PAYNUM              NUMBER(15)   
	TORDERSEAT          VARCHAR2(99) 
	 */
	
	private String t_orderNo;
	private String t_orderSeat;
	private int pay_num;
	private String h_id;
	
	public TicketorderVO() {
		// TODO Auto-generated constructor stub
	}

	public TicketorderVO(String t_orderNo, String t_orderSeat, int pay_num, String h_id) {
		super();
		this.t_orderNo = t_orderNo;
		this.t_orderSeat = t_orderSeat;
		this.pay_num = pay_num;
		this.h_id = h_id;
	}

	public String getT_orderNo() {
		return t_orderNo;
	}

	public void setT_orderNo(String t_orderNo) {
		this.t_orderNo = t_orderNo;
	}

	public String getT_orderSeat() {
		return t_orderSeat;
	}

	public void setT_orderSeat(String t_orderSeat) {
		this.t_orderSeat = t_orderSeat;
	}

	public int getPay_num() {
		return pay_num;
	}

	public void setPay_num(int pay_num) {
		this.pay_num = pay_num;
	}

	public String getH_id() {
		return h_id;
	}

	public void setH_id(String h_id) {
		this.h_id = h_id;
	}

	

	
	
	
	
}
