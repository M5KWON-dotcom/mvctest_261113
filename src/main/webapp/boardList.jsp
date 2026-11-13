<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글 목록</title>
</head>
<body>
<h2>게시판 글 목록</h2>
<hr>
<table border="1" width="800">
<thead>
<tr>
<th>번호</th>
<th>제목</th>
<th>작성자</th>
<th>이메일</th>
<th>조회수</th>
<th>작성일</th>
</tr>
</thead>
<tbody>
<c:forEach var="Bdto" items="${boardList}">
     <tr>
        <td>${Bdto.boardnum}</td>
        <td>
           <a href="boardView.do?boardnum=${Bdto.boardnum}">${Bdto.title}</a>
        </td>
        <td>${Bdto.username}</td>
        <td>${Bdto.email}</td>
        <td>${Bdto.hit}</td>
        <td>${Bdto.regdate}</td>
        </c:forEach>
</tbody>
	<button type="button" onclick="location.href='boardWrite.do'">글쓰기</button>
</table>

</body>
</html>