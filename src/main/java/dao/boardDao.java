package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import dbutil.DBConnection;
import dto.boardDto;
import dto.boardJoinDto;
import dto.memberDto;

public class boardDao {

public int writeBoard(String userid, String title, String content) {
		
		String sql = "INSERT INTO board(userid, title, content, hit)"
				+ "VALUES(?,?,?,0)";
		
		int result = 0;
		
		try {
			
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, userid);			
			pstmt.setString(2, title);
			pstmt.setString(3, content);
			
			result = pstmt.executeUpdate(); //가입 성공시 1이 반환
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return result; //성공했을때 1이 반환, 실패했을때 0이 반환
		
	}
	
	//게시판 모든 글 목록 불러오는 메소드
	public ArrayList<boardJoinDto> boardList() {
		
		String sql = "SELECT B.boardnum, B.title, B.content, B.regdate, B.hit, M.userid, M.name, M.email FROM board B INNER JOIN member M ON B.userid = M.userid ORDER BY B.boardnum DESC ";
		
		ArrayList<boardJoinDto> boardList = new ArrayList<boardJoinDto>();
		
		try {
			
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) { //글 목록에서 글의 수만큼 반복
				int boardnum = rs.getInt("boardnum"); //글번호
				String userid = rs.getString("userid"); //글 제목
				String content = rs.getString("content"); //글 내용
				int hit = rs.getInt("hit"); //글번호
				String title = rs.getString("title"); //글 작성자 아이디
				String name = rs.getString("name"); //글 작성자 이름
				String email = rs.getString("email"); //글 작성자 이메일
				Timestamp regdate = rs.getTimestamp("regdate"); //글 작성일시
				
				boardJoinDto BJDto = new boardJoinDto(boardnum, userid, content, hit, title, name, email, regdate);
				
				boardList.add(BJDto);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return boardList;
		
	}
	public boardDto boardView(String boardnum) {
		
		String sql = "SELECT * FROM boardnum=?";
					
		try {
				
				Connection conn = DBConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, boardnum);
								
				ResultSet rs = pstmt.executeQuery();
				
				if(rs.next()) { //참->회원존재한다는 이야기->로그인 성공을 시켜야 함
					int boardnum = rs.getInt("boardnum");
					String title = rs.getString("title");
					String content = rs.getString("content");
					int hit = rs.getInt("hit");
					String userid = rs.getString("userid");
					Timestamp regdate = rs.getTimestamp("regdate");
					
					boardDto bDto = new boardDto(boardnum, title, content, hit, userid, regdate);
					return bDto;
				 }else {
					return null;
				}
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			return null;
		}
	public void updateHit(String boardnum) {
		String sql = "UPDATE"
	}
	
}