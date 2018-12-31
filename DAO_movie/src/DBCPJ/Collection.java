package DBCPJ;

public class Collection {

	private String userId;
	private String movieId;
	public Collection() {
	}
	
	public Collection(String uId,String mid) {
		this.userId=uId;
		this.movieId=mid;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}



}
