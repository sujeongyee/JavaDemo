package holy.vo;

public class MovieVO {
	
	
	private String movie_no;
	private String movie_name;
	private String movie_run;
	private int movie_price;
	
	
	public MovieVO() {
		
	}	

	public MovieVO(String movie_no, String movie_name, String movie_run, int movie_price) {
		super();
		this.movie_no = movie_no;
		this.movie_name = movie_name;
		this.movie_run = movie_run;
		this.movie_price = movie_price;
	}


	public String getMovie_no() {
		return movie_no;
	}


	public void setMovie_no(String movie_no) {
		this.movie_no = movie_no;
	}


	public String getMovie_name() {
		return movie_name;
	}


	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}


	public String getMovie_run() {
		return movie_run;
	}


	public void setMovie_run(String movie_run) {
		this.movie_run = movie_run;
	}


	public int getMovie_Price() {
		return movie_price;
	}


	public void setPrice(int movie_price) {
		this.movie_price = movie_price;
	}
	
	
	
	

}
