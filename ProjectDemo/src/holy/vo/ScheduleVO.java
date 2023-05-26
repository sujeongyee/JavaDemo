package holy.vo;

public class ScheduleVO {
	/*
	 * SCHNO    NOT NULL VARCHAR2(99) 
	SCHTIME  NOT NULL VARCHAR2(10) 
	MOVIENO           VARCHAR2(99) 
	TORDERNO          VARCHAR2(10) 
	 */
	
	private String sch_no;
	private String sch_time;
	private String movie_no;
	private String t_orderno;
	
	public ScheduleVO() {
		// TODO Auto-generated constructor stub
	}

	public ScheduleVO(String sch_no, String sch_time, String movie_no, String t_orderno) {
		super();
		this.sch_no = sch_no;
		this.sch_time = sch_time;
		this.movie_no = movie_no;
		this.t_orderno = t_orderno;
	}

	public String getSch_no() {
		return sch_no;
	}

	public void setSch_no(String sch_no) {
		this.sch_no = sch_no;
	}

	public String getSch_time() {
		return sch_time;
	}

	public void setSch_time(String sch_time) {
		this.sch_time = sch_time;
	}

	public String getMovie_no() {
		return movie_no;
	}

	public void setMovie_no(String movie_no) {
		this.movie_no = movie_no;
	}

	public String getT_orderno() {
		return t_orderno;
	}

	public void setT_orderno(String t_orderno) {
		this.t_orderno = t_orderno;
	}

	
	
}
