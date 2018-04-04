<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>

<STYLE>
.cla1 {
	FONT-SIZE: 12px;
	COLOR: #4b4b4b;
	LINE-HEIGHT: 18px;
	TEXT-DECORATION: none
}

.login_msg {
	font-family: serif;
}

.login_msg .msg {
	background-color: #acf;
}

.login_msg .btn {
	background-color: #9be;
	width: 73px;
	font-size: 18px;
	font-family: 微软雅黑;
}
</STYLE>

<TITLE></TITLE>
<META http-equiv=Content-Type content="text/html; charset=utf-8">
<LINK href="../css/style.css" type=text/css rel=stylesheet>

<META content="MSHTML 6.00.2600.0" name=GENERATOR>
</HEAD>
<BODY leftMargin=0 topMargin=0 marginwidth="0" marginheight="0"
	background="../images/rightbg.jpg">
	<div ALIGN="center">
		<table border="0" width="1140px" cellspacing="0" cellpadding="0"
			id="table1">
			<tr>
				<td height="93"></td>
				<td></td>
			</tr>
			<tr>
				<td background="../images/right.jpg" width="740" height="412"></td>
				<td class="login_msg" width="400">
				
				<s:form action="loginAction">
				<s:textfield name="UUsername" label="姓名"></s:textfield>
				<s:password name="UPassword"  label="密码"></s:password>
				<s:submit value="提交"></s:submit>
				</s:form>
				</td>
			</tr>
		</table>
	</div>
</BODY>
</HTML>
