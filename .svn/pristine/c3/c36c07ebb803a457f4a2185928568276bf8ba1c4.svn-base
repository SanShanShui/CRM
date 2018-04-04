<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
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

<body class="emp_body">
 <table border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td class="topg"></td>
  </tr>
</table>

<table border="0" cellspacing="0" cellpadding="0" class="wukuang">
  <tr>
    <td width="1%"><img src="images/tleft.gif"/></td>
    <td width="33%" align="left">[跟踪信息]</td>
   
    <td width="63%"align="right">
        <a class="butbg"  href="#"><img src="images/button/save.gif" /></a>
        <a class="butbg"  href="./follow/findAllFollow"><img src="images/button/tuihui.gif" /></a>
    </td>
    <td width="3%" align="right"><img src="images/tright.gif"/></td>
  </tr>
</table>

<table width="89%" class="emp_table"  align="left" cellspacing="0">
  <s:form  theme="simple">
  <tr>
    <td width="8%">日期:</td>
    <td width="17%"><s:textfield readonly="true" name="FDate"/></td>
    <td width="7%">交流方式:</td>
    <td width="18%"><s:textfield readonly="true" name="FWay"/></td>
    <td width="7%">营销人员:</td>
    <td width="43%"><s:textfield readonly="true" name="FZxr"/></td>
  </tr>
  <tr>
    <td>QQ:</td>
    <td><s:textfield readonly="true" name="SQq"  /></td>
    <td>学员:</td>
    <td><s:textfield readonly="true" name="SName" /></td>
    <td>交流结果:</td>
    <td><s:textfield readonly="true" name="FStatus" /></td>
  </tr>
  <tr>
    <td>内容:</td>
  </tr>
  <tr>
    <td></td>
    <td colspan="6"><s:textarea name="FContent" readonly="true"  rows="10" cols="80"></s:textarea></td>
  </tr>

  </s:form>
</table>

</body>
</html>

