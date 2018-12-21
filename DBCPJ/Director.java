package DBCPJ;

import java.util.Date;

public class Director {

	private String directorId;
	private String directorname;

	private String directorSex;
	private Date directorBirthday;
	public String getDirectorId() {
		return directorId;
	}
	public void setDirectorId(String directorId) {
		this.directorId = directorId;
	}
	public String getDirectorname() {
		return directorname;
	}
	public void setDirectorname(String directorname) {
		this.directorname = directorname;
	}
	public String getDirectorSex() {
		return directorSex;
	}
	public void setDirectorSex(String directorSex) {
		this.directorSex = directorSex;
	}
	public Date getDirectorBirthday() {
		return directorBirthday;
	}
	public void setDirectorBirthday(Date directorBirthday) {
		this.directorBirthday = directorBirthday;
	}


}
