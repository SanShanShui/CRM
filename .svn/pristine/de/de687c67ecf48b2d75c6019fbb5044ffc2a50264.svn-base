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
<script type="text/javascript" src="./js/jquery-1.3.1.js"></script>
<script type="text/javascript">
function tijiao(){
	 if($("#tip").html()==null||$("#tip").html()==""){
		return false;
	 }else{
		 return true;
	 }
}
$(document).ready(function(){
//	 $("#tip").html("");
	 $("#tip").hide();
	$("#Status").blur(function(){
		if($("#Status").val()!=null&&$("#Status").val()!=""){
			$("#tip").html("");
			return true;
		}else{
			$("#tip").html("意向度不能为空");
			$("#tip").show();
			return false;
		}
	});
});
</script>
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
    <td width="33%" align="left">[编辑学员跟踪]</td>
   
    <td width="63%"align="right">
        <a class="butbg"  href="#"><img src="images/button/save.gif" /></a>
        <a class="butbg"  href="follow/findAllFollow"><img src="images/button/tuihui.gif" /></a>
    </td>
    <td width="3%" align="right"><img src="images/tright.gif"/></td>
  </tr>
</table>

<table width="89%" class="emp_table"    style="" align="left" cellspacing="0">
  <s:form action="/follow/addFollow?SId=%{SId}" onsubmit="return tijiao()" theme="simple">
  <tr>
    <td width="8%">日期:</td>
    <td width="17%"><s:textfield name="FDate"></s:textfield></td>
    <td width="7%">交流方式:</td>
    <td width="18%"><s:textfield name="FWay"></s:textfield></td>
    <td width="7%">营销人员:</td>
    <td width="43%"><s:textfield readonly="true" name="SZxr" /></td>
  </tr>
  <tr>
    <td>QQ:</td>
    <td><s:textfield readonly="true" name="SQq" /></td>
    <td>学员:</td>
    <td><s:textfield readonly="true" name="SName" /></td>
    <td>交流结果:</td>
    <td><s:textfield id="Status" name="FStatus"></s:textfield></td>
  </tr>
  <tr>
    <td>内容:</td>
    <td></td>
    <td><div id="tip"></div></td>
  </tr>
  <tr>
    <td></td>
    <td colspan="6"><s:textarea name="FContent" rows="10" cols="80"></s:textarea></td>
  </tr>
  <tr>
    <td></td>
    <td><s:submit value="提交"></s:submit></td>
  </tr>
  </s:form>
</table>

</body>
</html>

