<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>

<link href="css/sys.css" type="text/css" rel="stylesheet" />

</head>

<body>
	<table border="0" cellspacing="0" cellpadding="0" width="100%">
		<tr>
			<td class="topg"></td>
		</tr>
	</table>

	<table border="0" cellspacing="0" cellpadding="0" class="wukuang"
		width="100%">
		<tr>
			<td width="1%"><img src="images/tleft.gif" /></td>
			<td width="39%" align="left">[课程类别]</td>

			<td width="57%" align="right"><a href="addlesson.html"><img
					src="images/button/tianjia.gif" /></a> <a
				href="querylesson.html"><img
					src="images/button/gaojichaxun.gif" /></a></td>
			<td width="3%" align="right"><img src="images/tright.gif" /></td>
		</tr>
	</table>
	<table border="0" cellspacing="0" cellpadding="0"
		style="margin-top:5px;">
		<tr>
			<td><img src="images/result.gif" /></td>
		</tr>
	</table>
	<table width="97%" border="1">

		<tr class="henglan" style="font-weight:bold;">
			<td width="14%" align="center">名称</td>
			<td width="33%" align="center">简介</td>
			<td width="13%" align="center">总学时</td>
			<td width="18%" align="center">收费标准</td>
			<td width="11%" align="center">编辑</td>
		</tr>
		<s:form theme="simple" >
		<tr class="tabtd1">
			<td align="center"><s:property value="" /> </td>
			<td align="center"><s:property value="" /></td>
			<td align="center"><s:property value="" /></td>
			<td align="center"><s:property value="" />8</td>
			<td width="11%" align="center"><a href="editlesson.html"><img
					src="images/button/modify.gif" class="img"/></a></td>
		</tr>
		</s:form>
	</table>
	<table border="0" cellspacing="0" cellpadding="0" align="center">
		<tr>
			<td align="right">
    	<span>第${page}/${pages}页</span>
        <span>
        <a href="lesson/findAll#?page=1">[首页]</a>&nbsp;&nbsp;
        <c:if test="${page<=1}">
        [上一页]
        </c:if>
        <c:if test="${page>1}">
        <a href="lesson/findAll#?page=${page-1}">[上一页]</a>&nbsp;&nbsp;
        </c:if>
        <c:if test="${page>=pages}">
        [下一页]
        </c:if>
        <c:if test="${page<pages}">
        <a href="lesson/findAll#?page=${page+1}">[下一页]</a>&nbsp;&nbsp;
        </c:if>
        <a href="lesson/findAll#?page=${pages}">[尾页]</a>
        </span>
			</td>
		</tr>
	</table>
</body>
</html>

