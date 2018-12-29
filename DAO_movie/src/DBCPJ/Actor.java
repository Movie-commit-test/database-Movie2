package DBCPJ;

import java.util.Date;

public class Actor {

	private String actorId;
	private String actorname;

	private String actorSex;
	private Date actorBirthday;
	public String getActorId() {
		return actorId;
	}
	public void setActorId(String actorId) {
		this.actorId = actorId;
	}
	public String getActorname() {
		return actorname;
	}
	public void setActorname(String actorname) {
		this.actorname = actorname;
	}
	public String getActorSex() {
		return actorSex;
	}
	public void setActorSex(String actorSex) {
		this.actorSex = actorSex;
	}
	public Date getActorBirthday() {
		return actorBirthday;
	}
	public void setActorBirthday(Date actorBirthday) {
		this.actorBirthday = actorBirthday;
	}

	

}
