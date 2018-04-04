<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
    <td width="33%" align="left">[咨询学生跟踪]</td>
   
    <td width="63%"align="right">
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
<table width="88%" border="1">
  <tr class="henglan">
    <td align="center">日期</td>
    <td align="center">学员姓名</td>
    <td align="center">咨询方式</td>
    <td align="center">咨询人</td>
    <td align="center">效果</td>
    <td align="center">查看</td>
  	<td align="center">入学编班</td>
  	<td align="center">跟踪</td>
  	<td align="center">移交</td>
  </tr>
  <s:iterator value="followlist">
  <tr class="tabtd1">
    <td align="center"><s:property value="%{FDate}"/></td>
    <td align="center"><s:property value="%{SName}"/></td>
    <td align="center"><s:property value="%{FWay}"/></td>
    <td align="center"><s:property value="%{FZxr}"/></td>
    <td align="center"><s:property value="%{FStatus}"/></td>
  	<td width="8%" align="center"><a href="./follow/findFId?FId=${FId}"><img src="images/button/view.gif" class="img"/></a></td>
  	<td width="8%" align="center"><a href="inClass.html"><img src="images/button/modify.gif" class="img"/></a></td>
  	<td width="8%" align="center"><a href="./follow/findSId?SId=${SId}"><img src="images/button/modify.gif" class="img"/></a></td>
  	<td width="8%" align="center"><a href="./remove/selectOneStu.action?SId=${SId}"><img src="images/button/modify.gif" class="img"/></a></td>
  </tr>
  </s:iterator>
</table>

<table border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td align="right">
    	<span>第${page}/${pages}页</span>
        <span>
        <a href="follow/findAllFollow?page=1">[首页]</a>&nbsp;&nbsp;
        <c:if test="${page<=1}">
        [上一页]
        </c:if>
        <c:if test="${page>1}">
        <a href="follow/findAllFollow?page=${page-1}">[上一页]</a>&nbsp;&nbsp;
        </c:if>
        <c:if test="${page>=pages}">
        [下一页]
        </c:if>
        <c:if test="${page<pages}">
        <a href="follow/findAllFollow?page=${page+1}">[下一页]</a>&nbsp;&nbsp;
        </c:if>
        <a href="follow/findAllFollow?page=${pages}">[尾页]</a>
        </span>
    </td>
  </tr>
</table>

</body>
</html>
