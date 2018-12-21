package DBCPJ;

import java.util.Date;

public class Movie {

	private String movieId;
	private String directorId;
	private String screenwriterId;
	private String zoneId;
	private String movieName;
	private String movieLanguage;
	private Date movieDate;
	private String movieIntroduction;
	private Float movieScore;
	private String movieAlias;
	


	public Date getMovieDate() {
		return movieDate;
	}
	public void setMovieDate(Date date) {
		movieDate = date;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieLanguage() {
		return movieLanguage;
	}
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}
	public String getMovieIntroduction() {
		return movieIntroduction;
	}
	public void setMovieIntroduction(String movieIntroduction) {
		this.movieIntroduction = movieIntroduction;
	}
	public Float getMovieScore() {
		return movieScore;
	}
	public void setMovieScore(Float movieScore) {
		this.movieScore = movieScore;
	}
	public String getMovieAlias() {
		return movieAlias;
	}
	public void setMovieAlias(String movieAlias) {
		this.movieAlias = movieAlias;
	}
	public String getDirectorId() {
		return directorId;
	}
	public void setDirectorId(String directorId) {
		this.directorId = directorId;
	}
	public String getZoneId() {
		return zoneId;
	}
	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}
	public String getScreenwriterId() {
		return screenwriterId;
	}
	public void setScreenwriterId(String screenwriterId) {
		this.screenwriterId = screenwriterId;
	}

	
	
}
