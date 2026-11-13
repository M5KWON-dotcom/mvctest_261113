package dto;

import java.sql.Timestamp;

public class boardJoinDto {

	private int boardnum;
	private String title;
	private String content;
	private int hit;
	private Timestamp regdate;
	private String userid;
	private String name;
	private String email;
	
	public boardJoinDto(int boardnum, String title, String content, int hit, Timestamp regdate, String userid,
			String name, String email) {
		super();
		this.boardnum = boardnum;
		this.title = title;
		this.content = content;
		this.hit = hit;
		this.regdate = regdate;
		this.userid = userid;
		this.name = name;
		this.email = email;
	}
	public boardJoinDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBoardnum() {
		return boardnum;
	}
	public void setBoardnum(int boardnum) {
		this.boardnum = boardnum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
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
	
}
