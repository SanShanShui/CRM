<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
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
function tijiao(){
	if($(".one").val()==null||$(".one").val()==""){
		return false;
	}else{
		return true;
	}
}
function change(RId){
	alert(RId.value);
	var a=RId.value;
	$.ajax({
		url:"selectRoleDesc",
		data:{
			'RId':a
		},
		dateType:'json',
		success:function(data){
			$("#d1").html(data);
		}
	});
}
$(document).ready(function (){
	 $(".two").html("");
	 $(".two").hide();
	$("#username").blur(function(){
	   var exg=/^[A-Z]$/;
	   if(exg.test($("#username").val())){
		   $("#tip1").html();
		   return true;
	   }else{
		   $("#tip1").html("账户格式只能是A-Z");
		   $("#tip1").show();
		   return false;
	   }
	});
	$("#password").blur(function(){
		var exg=/^[a-zA-Z]\w{5,17}$/;
	    if(exg.test($("#password").val())){
	    	$("#tip2").html();
	    	return true;
	    }else{
		     $("#tip2").html("密码以字母开头，长度在6~18之间，只能包含字符、数字和下划线");
		     $("#tip2").show();
		     return false;
	    }
	});
	$("#Tel").blur(function(){
		var exg=/^[1-9]{1}[0-9]{10}$/;
	    if(exg.test($("#Tel").val())){
	    	$("#tip4").html("");
	    	return true;
	    }else{
		     $("#tip4").html("电话必须是11位数字");
		     $("#tip4").show();
		     return false;
	    }
	});
	$("#Email").blur(function(){
		var exg=/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
		if(exg.test($("#Email").val())){
			$("#tip5").html("");
			return true;
		}else{
			$("#tip5").html("邮箱格式必须是123@123.com");
			$("#tip5").show();
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
			<td width="44%" align="left">[添加管理员]</td>

			<td width="52%" align="right"> <a href="selectAllUser"><img
					src="images/button/tuihui.gif" /></a></td>
			<td width="3%" align="right"><img src="images/tright.gif" /></td>
		</tr>
	</table>

	<table width="88%" border="0" class="emp_table" style="width:80%;">
	 
		<s:form action="./addUser" onsubmit="return tijiao()" theme="simple">
		<tr>
		<td>账户:</td>
		<td><s:textfield id="username" cssClass="one" name="u.UUsername" ></s:textfield></td>
		<td><div id="tip1" class="two"></div></td>
		</tr>
		<tr>
		<td>密码:</td>
		<td><s:password id="password" cssClass="one" name="u.UPassword" ></s:password></td>		
		<td><div id="tip2" class="two"></div></td>
		</tr>	
		<tr>
		<td>姓名:</td>
		<td><s:textfield id="name" cssClass="one" name="u.UName"></s:textfield></td>
		<td><div id="tip3" class="two"></div></td>
		</tr>
		<tr>
		<td>电话:</td>
		<td><s:textfield id="Tel" cssClass="one" name="u.UTel" ></s:textfield></td>
		<td><div id="tip4" class="two"></div></td>
		</tr>	
		<tr>
		<td>邮箱:</td>
		<td><s:textfield id="Email" cssClass="one" name="u.UEmail" ></s:textfield></td>
		<td><div id="tip5" ></div></td>
		</tr>	
        <tr>
        <td>角色:</td>
        <td><s:select name="RId" headerKey=" " headerValue="请选择角色" list="rolelist"  listValue="RName" listKey="RId"  onchange="change(this)"></s:select></td>
        <td><div id="tip6" class="two"></div></td>
        </tr> 
        <tr>
        <td></td>
        <td><div id="d1" /></td>
        </tr> 
        <tr> 
		<td></td>
		<td><s:submit value="提交" style="margin-right:800px"></s:submit></td>
		</tr>
		</s:form>

	</table>
	              	
	                	 
</body>

</html>
