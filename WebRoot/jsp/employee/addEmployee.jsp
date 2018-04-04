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
<base href="<%=basePath%>"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>

<link href="css/sys.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="./js/jquery-1.3.1.js"></script>
<script type="text/javascript">
function tijiao(){
	if($(".one").val()==""||($(".one").val()==null)){
		return false;
	}else{
		return true;
	}
}

$(document).ready(function(){
     $("#tip").html("");
	 $("#tip").hide();
	$(".one").blur(function(){
	//zxr
		if($("#Zxr").val()!=null&&($("#Zxr").val()!="")){
			$("#tip").html("");
			$("#tip").hide();
	    }else{
	 	    $("#tip").html("营销人员不能为空");
	 		$("#tip").show();
	 	    return false;
	 	}
	//name
		if($("#Name").val()!=null&&($("#Name").val()!="")){
			   $("#tip").html("");
			   $("#tip").hide();
			}else{
				$("#tip").html("名字不能为空");
			    $("#tip").show();
				return false;
			}
	//qq	   
		var qq=/^[1-9]{1}[0-9]{4,}$/;
		   if(qq.test($("#QQ").val())){
			   $("#tip").html("");
		   }else{
			   $("#tip").html("QQ必须是数字");
			   $("#tip").show();
			   return false;
		   }
	//tel
		   var tel=/^[1-9]{1}[0-9]{10}$/;
		    if(tel.test($("#Tel").val())){
		    	$("#tip").html("");
		    }else{
			     $("#tip").html("电话必须是11位数字");
			     $("#tip").show();
			     return false;
		    }	
	//age
		    var age=/^[1-9]{1,2}$/;
			if(age.test($("#Age").val())){
				$("#tip").html("");
			}else{
				$("#tip").html("年龄必须在1-99之间");
				return false;
			}
	//sex
			var sex=/^[男|女]$/;
			if(sex.test($("#Sex").val())){
				$("#tip").html("");
			}else{
				$("#tip").html("性别必须是男或女");
				return false;
			}
	//email
			var email=/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
			if(email.test($("#Email").val())){
				$("#tip").html("");
			}else{
				$("#tip").html("Email格式必须是123@123.com");
				$("#tip").show();
				return false;
			}
	//worklife
			var work=/^[0-9]{1,}$/;
			if(work.test($("#Worklife").val())){
				$("#tip").html("");
			}else{
				$("#tip").html("工作年限必须是数字");
				$("#tip").show();
				return false;
			}
	//status		
			if($("#Status").val()!=null&&($("#Status").val()!="")){
				$("#tip").html("");
			}else{
				$("#tip").html("意向度不能为空");
				$("#tip").show();
				return false;
			}
	 });	
  /*  $("#Name").blur(function(){
	   if($("#Name").val()!=null&&($("#Name").val()!="")){
		   $("#tip").html("111");
		   $("#tip").hide();
		}else{
			$("#tip").html("名字不能为空");
		    $("#tip").show();
			return false;
		}
	});
	$("#QQ").blur(function(){
	   var exg=/^[1-9]{1}[0-9]{4,}$/;
	   if(exg.test($("#QQ").val())){
		   $("#tip").html("111");
		   $("#tip").hide();
	   }else{
		   $("#tip").html("QQ必须是数字");
		   $("#tip").show();
		   return false;
	   }
	});
	$("#Tel").blur(function(){
		var exg=/^[1-9]{1}[0-9]{10}$/;
	    if(exg.test($("#Tel").val())){
	    	$("#tip").html("111");
	    	$("#tip").hide();
	    }else{
		     $("#tip").html("电话必须是11位数字");
		     $("#tip").show();
		     return false;
	    }
	});
	$("#Age").blur(function(){
		var exg=/^[1-9]{1,2}$/;
		if(exg.test($("#Age").val())){
			$("#tip").html("111");
			$("#tip").hide();
		}else{
			$("#tip").html("年龄必须在1-99之间");
			return false;
		}
	});	
	$("#Sex").blur(function(){
		var exg=/^[男|女]$/;
		if(exg.test($("#Sex").val())){
			$("#tip").html("111");
			$("#tip").hide();
		}else{
			$("#tip").html("性别必须是男或女");
			$("#tip").show();
			return false;
		}
	});
	$("#Email").blur(function(){
		var exg=/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
		if(exg.test($("#Email").val())){
			$("#tip").html("111");
			$("#tip").hide();
		}else{
			$("#tip").html("Email格式必须是123@123.com");
			$("#tip").show();
			return false;
		}
	});
	$("#Worklife").blur(function(){
		var exg=/^[0-9]{1,}$/;
		if(exg.test($("#Worklife").val())){
			$("#tip").html("");
		}else{
			$("#tip").html("工作年限必须是数字");
			$("#tip").show();
			return false;
		}
	});
	$("#Status").blur(function(){
		if($("#Status").val()!=null&&($("#Status").val()!="")){
			$("#tip").html("111");
			$("#tip").hide();
		}else{
			$("#tip").html("意向度不能为空");
			$("#tip").show();
			return false;
		}
	});*/
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
			<td width="44%" align="left">[咨询学生添加]</td>
			<td width="52%" align="right">
				<a href="#"><img src="images/button/save.gif" /></a> <a
				href="./student/findAllStu"><img src="images/button/tuihui.gif" /></a>
			</td>
			<td width="3%" align="right"><img src="images/tright.gif" /></td>
		</tr>
	</table>
	<table width="89%" class="emp_table"  align="left"
		cellspacing="0">
		<s:form action="./student/addStu.action" onsubmit="return tijiao()" theme="simple">
		<tr>
		    <td >建档日期:</td>
			<td align="left"><s:textfield  name="SDate" ></s:textfield></td>
			<td >营销人员:</td>
			<td align="left"><s:textfield cssClass="one"  id="Zxr" name="SZxr" ></s:textfield></td>
			<td >学生来源:</td>
			<td align="left"><s:textfield name="SCome" ></s:textfield></td>
		</tr>

		<tr>
		    <td>姓名:</td>
			<td height="25" align="left"><s:textfield  cssClass="one" id="Name" name="SName" ></s:textfield></td>
			<td>QQ:</td>
			<td height="25" align="left"><s:textfield  cssClass="one" id="QQ" name="SQq" ></s:textfield></td>
			<td>电话:</td>
			<td height="25" align="left"><s:textfield  cssClass="one" id="Tel" name="STel" ></s:textfield></td>
		</tr>
		<tr>
		    <td>年龄:</td>
			<td height="28" align="left"><s:textfield cssClass="one" id="Age" name="SAge" ></s:textfield></td>
			<td>性别:</td>
			<td height="28" align="left"><s:textfield cssClass="one" id="Sex" name="SSex" ></s:textfield></td>
			<td>Email:</td>
			<td height="28" align="left"><s:textfield cssClass="one" id="Email" name="SEmail" ></s:textfield></td>
		</tr>
		<tr>
		    <td>联系地址:</td>
			<td height="33" align="left"><s:textfield name="SAddress" ></s:textfield></td>
			<td>学校:</td>
			<td height="33" align="left"><s:textfield name="SSchool" ></s:textfield></td>
			<td>学历:</td>
			<td height="33" align="left"><s:textfield name="SDegree"></s:textfield></td>
		</tr>
		<tr>
		    <td>省份:</td>
			<td height="31" align="left"><s:textfield name="SProvince" ></s:textfield></td>
			<td>工作年限:</td>
			<td height="31" align="left"><s:textfield cssClass="one" id="Worklife" name="SWorklife" ></s:textfield></td>
			<td>介绍人:</td>
			<td height="31" align="left"><s:textfield name="SReference" ></s:textfield></td>
		</tr>
		<tr>
		    <td>介绍学员:</td>
			<td height="41" align="left"><s:textfield name="SIntroducestu" ></s:textfield></td>
			<td>意向班级:</td>
			<td height="41" align="left"><s:textfield name="SClasses" ></s:textfield></td>
			<td>意向度:</td>
			<td height="41" align="left"><s:textfield cssClass="one" id="Status" name="SStatus" ></s:textfield></td>
		</tr>
		<tr>
		    <td>咨询方式:</td>
			<td height="41" align="left"><s:textfield  name="FWay" ></s:textfield></td>
			<td colspan="5"><div id="tip" ></div></td>
		</tr>
		<tr>
		    <td>关注问题:</td>
		</tr>
		<tr>
		    <td></td>
			<td colspan="7"><s:textarea name="SProblem"  cols="60" rows="5"></s:textarea></td>
		</tr>
		<tr>
		    <td>备注:</td>
		</tr>
		<tr>
		    <td></td>
			<td colspan="7"><s:textarea name="SRemarks"  cols="60" rows="5"></s:textarea></td>
		</tr>
		<tr>
		    <td></td>
		    <td><s:submit value="提交"></s:submit></td>
		</tr>
		</s:form>
	</table>
</body>
</html>
