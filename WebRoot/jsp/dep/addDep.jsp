<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="../../css/sys.css" type="text/css" rel="stylesheet" /> 

</head>

<body class="emp_body">
	<table border="0" cellspacing="0" cellpadding="0" width="100%">
		<tr>
			<td class="topg"></td>
		</tr>
	</table>

	<table border="0" cellspacing="0" cellpadding="0" class="wukuang"
		width="100%">
		<tr>
			<td width="1%"><img src="../../images/tleft.gif" /></td>
			<td width="44%" align="left">[添加部门管理信息]</td>

			<td width="52%" align="right"> <a href="department_findAll"><img
					src="../../images/button/tuihui.gif" /></a></td>
			<td width="3%" align="right"><img src="../../images/tright.gif" /></td>
		</tr>
	</table>

	<table width="88%" border="0" class="emp_table" style="width:80%;">
	 
		<s:form action="./addDepartment">
			<s:textfield name="DName" label="部门名称"></s:textfield>
			<s:textarea name="DDesc" label="部门说明"></s:textarea>
		<s:submit value="提交" style="margin-right:800px"></s:submit>
		</s:form>
	
	</table>

</body>
</html>