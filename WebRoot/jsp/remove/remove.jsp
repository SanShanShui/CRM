<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<script type="text/javascript" src="./js/jquery-1.3.1.js"></script>
<script type="text/javascript">
function tijiao(){
	 if($(".one").val()==null||$(".one").val()==""){
		return false;
	 }else{
		 return true;
	 }
}
$(document).ready(function(){
	 $("#tip").html("111");
	 $("#tip").hide();
	$("#Zxr").blur(function() {
			if ($("#Zxr").val() != null && $("#Zxr").val() != "") {
				$("#tip").html("");
				return true;
			} else {
				$("#tip").html("目标业务人员不能为空");
				$("#tip").show();
				return false;
			}
		});
		$("#RCase").blur(function() {
			if ($("#RCase").val() != null && $("#RCase").val() != "") {
				$("#tip").html("");
				return true;
			} else {
				$("#tip").html("移交原因不能为空");
				$("#tip").show();
				return false;
			}
		});
	});
</script>
</head>

<body class="emp_body">
<table border="0" cellspacing="0" cellpadding="0" width="100%">
  <tr>
    <td class="topg"></td>
  </tr>
</table>

<table border="0" cellspacing="0" cellpadding="0"  class="wukuang"width="100%">
  <tr>
    <td width="1%"><img src="images/tleft.gif"/></td>
    <td width="44%" align="left">[学员移交]</td>
   
    <td width="52%"align="right">
       <a href="#"><img src="images/button/save.gif" /></a>
       <a href="./follow/findAllFollow"><img src="images/button/tuihui.gif" /></a>
    </td>
    <td width="3%" align="right"><img src="images/tright.gif"/></td>
  </tr>
</table>

<table width="88%" border="0" class="emp_table" style="width:80%;">
  <s:form  action="./remove/addRemove?SId=%{SId}" onsubmit="return tijiao()" theme="simple">
  <tr>
    <td width="13%">目标业务人员：</td>
    <td width="34%"><s:textfield id="Zxr"  name="RNewzxr" ></s:textfield></td>
    <td colspan="2"><div id="tip" ></div></td>
  </tr>
  <tr>
    <td>移交原因：</td>
  </tr>
  <tr>
    <td></td>
    <td colspan="4"><s:textarea id="RCase"  name="RCase" cols="60" rows="10"></s:textarea></td>
  </tr>
   <tr>
    <td></td>
    <td ><s:submit value="提交"></s:submit></td>
  </tr>
</s:form>
</table>

</body>
</html>

