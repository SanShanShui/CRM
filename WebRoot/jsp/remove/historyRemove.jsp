<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

<body >
 <table border="0" cellspacing="0" cellpadding="0" width="100%">
 
  <tr>
    <td class="topg"></td>
  </tr>
</table>

<table border="0" cellspacing="0" cellpadding="0"  class="wukuang"width="100%">
  <tr>
    <td width="1%"><img src="images/tleft.gif"/></td>
    <td width="39%" align="left">[学生移交历史查询]</td>
   
    <td width="57%"align="right">
       <a href="./remove/findAllRemove"><img src="images/button/shuaxin.gif" /></a>
       <a href="#"><img src="images/button/gaojichaxun.gif" /></a>
      
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
  <td width="12%" align="center">学生姓名</td>
    <td width="13%" align="center">QQ</td>
    <td width="14%" align="center">联系电话</td>
    <td width="15%" align="center">移交时间</td>
    <td width="15%" align="center">移交之前业务员</td>
    <td width="16%" align="center">当前业务员</td>
    <td width="15%" align="center">移交原因</td>
    
  </tr>
  <s:iterator value="removelist">
  <tr class="tabtd2">
  	<td align="center"><s:property value="SName" /></td>
    <td align="center"><s:property value="SQq" /></td>
    <td align="center"><s:property value="STel" /></td>
    <td align="center"><s:property value="RDate" /></td>
    <td align="center"><s:property value="ROldzxr" /></td>
    <td align="center"><s:property value="RNewzxr" /></td>
    <td align="center"><s:property value="RCase" /></td>
  </tr>
  </s:iterator>
</table>
<table border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td align="right">
        <span>第${page}/${pages}页</span>
        <span>
         <a href="remove/findAllRemove?page=1">[首页]</a>&nbsp;&nbsp;
        <c:if test="${page<=1}">
        [上一页]
        </c:if>
        <c:if test="${page>1}">
        <a href="remove/findAllRemove?page=${page-1}">[上一页]</a>&nbsp;&nbsp;
        </c:if>
        <c:if test="${page>=pages}">
        [下一页]
        </c:if>
        <c:if test="${page<pages}">
        <a href="remove/findAllRemove?page=${page+1}">[下一页]</a>&nbsp;&nbsp;
        </c:if>
        <a href="remove/findAllRemove?page=${pages}">[尾页]</a>
        </span>
    </td>
  </tr>
</table>
</body>
</html>