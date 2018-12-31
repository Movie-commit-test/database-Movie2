package DBCPJ;

public class Cinema {

	private String cinemaId;
	private String cinemaName;
	private String cinemaAddress;
	public Cinema() {
	}
	
	public Cinema(String Id,String name) {
		this.cinemaId=Id;
		this.cinemaName=name;
	}
	public String getCinemaId() {
		return cinemaId;
	}
	public void setCinemaId(String cinemaId) {
		this.cinemaId = cinemaId;
	}
	public String getCinemaName() {
		return cinemaName;
	}
	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}
	public String getCinemaAddress() {
		return cinemaAddress;
	}
	public void setCinemaAddress(String cinemaAddress) {
		this.cinemaAddress = cinemaAddress;
	}



}
