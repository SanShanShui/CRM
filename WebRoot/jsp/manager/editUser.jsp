<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/sys.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="./js/jquery-1.3.1.js"></script>
<script type="text/javascript">
function change(desc){
	var a=desc.value;
	$.ajax({
		url:"selectRoleDesc",
		data:{
			'RId':a
		},
		success:function(data){
			$("#d1").html(data);
		}
	});
	
}
 function tijiao(){
	 if($(".one").val()==null||$(".one").val()==""){
		return false;
	 }else{
		 return true;
	 }
 }
 $(document).ready(function(){
	 $(".two").html("");
	 $(".two").hide();
	$("#username").blur(function(){
	   var exg=/^[A-Z]$/;
	   if(exg.test($("#username").val())){
		   return true;
	   }else{
		   $("#tip1").html("格式错误");
		   $("#tip1").show();
		   return false;
	   }
	});
	$("#password").blur(function(){
		var exg=/^[a-zA-Z]\w{5,17}$/;
	    if(exg.test($("#password").val())){
	    	return true;
	    }else{
		     $("#tip2").html("以字母开头，长度在6~18之间，只能包含字符、数字和下划线");
		     $("#tip2").show();
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

	<table border="0" cellspacing="0" cellpadding="0" class="wukuang"
		width="100%">
		<tr>
			<td width="1%"><img src="images/tleft.gif" /></td>
			<td width="44%" align="left">[修改管理员信息]</td>

			<td width="52%" align="right"> <a href="selectAllUser"><img
					src="images/button/tuihui.gif" /></a></td>
			<td width="3%" align="right"><img src="images/tright.gif" /></td> 
		</tr>
	</table>

	<table width="88%" border="0" class="emp_table" style="width:80%;">
	<tr>
		<s:form action="./updateUser?UId=%{UId}" onsubmit="return tijiao()" the>
		<td><s:textfield cssClass="one" id="username" name="UUsername" label="管理员账户" value="%{UUsername}"></s:textfield></td>
			<td align="right"><div id="tip1" class="two"></div></td>
		<td><s:textfield cssClass="one" id="password" name="UPassword" label="管理员密码" value="%{UPassword }"></s:textfield></td>
		    <td><div id="tip2" class="two"></div></td>
		<td><s:textfield name="UName" cssClass="one" label="管理员姓名" value="%{UName}"></s:textfield></td>
		    <td><div id="tip3"></div></td>
		<td><s:textfield name="UTel" cssClass="one" label="管理员电话" value="%{UTel}"></s:textfield></td>
		    <td><div id="tip4"></div></td>
		<td><s:textfield name="UEmail" cssClass="one" label="管理员邮箱" value="%{UEmail}"></s:textfield></td>
		    <td><div id="tip5"></div></td>
		<td><s:select name="RId"  list="rolelist"  listKey="RId" listValue="RName" onchange="change(this)"></s:select></td>
		    <td></td>
		<s:submit value="提交" style="margin-right:800px"></s:submit>
		</s:form>
	</tr>	
	</table>
<div id="d1" ></div>
</body>

</html>
