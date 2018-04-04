<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>CRM系统</title>
</head>

<frameset rows="90,*" framespacing="0px" frameborder="no">
	<frame src="frame/top.jsp" scrolling="no"/>
    <frameset id="main" cols="170,9,*" framespacing="0px" frameborder="no" >
        <frameset rows="30,*,40" framespacing="0px" frameborder="no" >
			<frame src="frame/left1.html" scrolling="no"/>
            <frame src="frame/left.jsp" scrolling="no"/>
            <frame src="frame/left2.html" scrolling="no"/>
        </frameset>
        <frame src="frame/control.html" scrolling="no"/>
        <frame src="frame/right.html" name="right" scrolling="no"/>
	</frameset>
</frameset>
</html>
