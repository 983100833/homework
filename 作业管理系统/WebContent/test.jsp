<%@ page contentType="text/html; charset=gb2312" %>   
<%@ page language="java" %>   
<%@ page import="com.mysql.jdbc.Driver" %>   
<%@ page import="java.sql.*" %>   
<%   
//加载驱动程序   
String driverName="com.mysql.jdbc.Driver";   
//数据库信息  
String userName="root";   
//密码   
String userPasswd="root";   
//数据库名   
String dbName="hm_ms";   
//表名   
String tableName="student_homework";   
//将数据库信息字符串连接成为一个完整的url（也可以直接写成url，分开写是明了可维护性强）   
   
String url="jdbc:mysql://localhost/"+dbName+"?user="+userName+"&password="+userPasswd;   
Class.forName("com.mysql.jdbc.Driver").newInstance();   
Connection conn=DriverManager.getConnection(url);   
Statement stmt = conn.createStatement();   
String sql="SELECT * FROM "+tableName;   
ResultSet rs = stmt.executeQuery(sql);   
out.print("id");   
out.print("|");   
out.print("name");   
out.print("|");   
out.print("phone");   
out.print("<br>");   
while(rs.next()) {   
out.print(rs.getString(1)+" ");   
out.print("|");   
out.print(rs.getString(2)+" ");   
out.print("|");   
out.print(rs.getString(3));   
out.print("<br>");   
}   
out.print("<br>");   
out.print("ok， Database Query Successd！");   
out.print("<button type="+"button"+"disabled="+"'disabled'"+">"+"已提交"+"</button>");
rs.close();   
stmt.close();   
conn.close();   
%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<button type="button" disabled="disabled">Click Me!</button>
</body>
</html>