package dto;

import java.sql.Timestamp;

public class memberDto {

	private String userid;
	private String userpw;
	private String name;
	private String email;
	private Timestamp userdate;
	public memberDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public memberDto(String userid, String userpw, String name, String email, Timestamp userdate) {
		super();
		this.userid = userid;
		this.userpw = userpw;
		this.name = name;
		this.email = email;
		this.userdate = userdate;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Timestamp getUserdate() {
		return userdate;
	}
	public void setUserdate(Timestamp userdate) {
		this.userdate = userdate;
	}
	
}
