<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    request.setCharacterEncoding("utf-8");
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자의 요청정보 출력</title>
</head>
<body>
<h1>입력한 회원 정보</h1>
<hr>
<table border="1">
<tr>
<td>이름</td>
<td><%=request.getParameter("username") %></td>
</tr>
<tr>
<td>비밀번호</td>
<td><%=request.getParameter("password") %></td>
</tr>
<tr>
<td>직업</td>
<td><%=request.getParameter("job") %></td>
</tr>
<tr>
<td>관심사항</td>
<td>
<% String[] likes=request.getParameterValues("like");
	for(int i=0;i<likes.length;i++){
		out.println(likes[i]+"<br>");
	}
%>
<%-- <%=request.getParameter("like") %> --%>
</td>
</tr>
</table>
<%-- <jsp:forward page="forward2.jsp"/> --%>
</body>
</html>