<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
 <table border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td class="topg"></td>
  </tr>
</table>

<table border="0" cellspacing="0" cellpadding="0" class="wukuang">
  <tr>
    <td width="1%"><img src="images/tleft.gif"/></td>
    <td width="33%" align="left">[咨询学生管理]</td>
   
    <td width="63%"align="right">
        <a class="butbg"  href="jsp/employee/addEmployee.jsp"><img src="images/button/tianjia.gif" /></a>
        <a class="butbg"  href="#"><img src="images/button/gaojichaxun.gif" /></a>
    </td>
    <td width="3%" align="right"><img src="images/tright.gif"/></td>
  </tr>
</table>
<table border="0" cellspacing="0" cellpadding="0" style="margin-top:5px;">
  <tr>
    <td ><img src="images/result.gif"/></td>
  </tr>
</table>
<table width="100%" border="1" >
  
  <tr class="henglan" style="font-weight:bold;">
 	<td width="8%" align="center">ID</td> 
	<td width="8%" align="center">姓名</td>
	<td width="6%" align="center">性别</td>
	<td width="9%" align="center">电话</td>
	<td width="11%" align="center">QQ </td>
	<td width="15%" align="center">班级意向</td>
	<td width="17%" align="center">状态</td>
	<td width="10%" align="center">营销人员</td>
	<td width="8%" align="center">编辑</td>
	<td width="8%" align="center">查看</td>
  </tr>
  
  <s:iterator value="stulist">
  <tr >
     <td align="center"><s:property value="SId"/></td>
     <td align="center"><s:property value="SName"/></td>
     <td align="center"><s:property value="SSex"/></td>
     <td align="center"><s:property value="STel"/></td>
     <td align="center"><s:property value="SQq"/></td>
     <td align="center"><s:property value="SClasses"/></td>
     <td align="center"><s:property value="SStatus" /></td>
     <td align="center"><s:property value="SZxr" /></td>
     <td width="8%" align="center"><a href="./student/selectOneStu?SId=${SId}">
	<img src="images/button/modify.gif" class="img"/></a></td>
	<td width="8%" align="center"><a href="./student/selectStu?SId=${SId}">
	<img src="images/button/view.gif" class="img"/></a></td>
   </tr>
  </s:iterator>


</table>
<table border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td align="right">
    	<span>第${page}/${pages}页</span>
        <span>
        <a href="student/findAllStu?page=1">[首页]</a>&nbsp;&nbsp;
        <c:if test="${page<=1}">
        [上一页]
        </c:if>
        <c:if test="${page>1}">
        <a href="student/findAllStu?page=${page-1}">[上一页]</a>&nbsp;&nbsp;
        </c:if>
        <c:if test="${page>=pages}">
        [下一页]
        </c:if>
        <c:if test="${page<pages}">
        <a href="student/findAllStu?page=${page+1}">[下一页]</a>&nbsp;&nbsp;
        </c:if>
        <a href="student/findAllStu?page=${pages}">[尾页]</a>
        </span>
    </td>
  </tr>
</table>
</body>
</html>

