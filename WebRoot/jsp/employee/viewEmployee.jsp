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
			<td width="44%" align="left">[咨询学生查询]</td>

			<td width="52%" align="right">
				
				<a href="#"><img src="images/button/save.gif" /></a> <a
				href="./student/findAllStu"><img src="images/button/tuihui.gif" /></a>
			</td>
			<td width="3%" align="right"><img src="images/tright.gif" /></td>
		</tr>
	</table>
	<table width="89%" class="emp_table"  align="left"
		cellspacing="0">
		<s:form  theme="simple">
		<tr>
		    <td >建档日期:</td>
			<td align="left"><s:textfield readonly="true" name="SDate" ></s:textfield></td>
			<td >营销人员:</td>
			<td align="left"><s:textfield readonly="true" name="SZxr" ></s:textfield></td>
			<td >学生来源:</td>
			<td align="left"><s:textfield readonly="true" name="SCome" ></s:textfield></td>
		</tr>
		  
		<tr>
		    <td>姓名:</td>
			<td height="25" align="left"><s:textfield readonly="true" name="SName" ></s:textfield></td>
			<td>QQ:</td>
			<td height="25" align="left"><s:textfield readonly="true" name="SQq" ></s:textfield></td>
			<td>电话:</td>
			<td height="25" align="left"><s:textfield readonly="true" name="STel" ></s:textfield></td>

		</tr>
		<tr>
		    <td>年龄:</td>
			<td height="28" align="left"><s:textfield readonly="true" name="SAge" ></s:textfield></td>
			<td>性别:</td>
			<td height="28" align="left"><s:textfield readonly="true" name="SSex" ></s:textfield></td>
			<td>Email:</td>
			<td height="28" align="left"><s:textfield readonly="true" name="SEmail" ></s:textfield></td>

		</tr>
		<tr>
		    <td>联系地址:</td>
			<td height="33" align="left"><s:textfield readonly="true" name="SAddress" ></s:textfield></td>
			<td>学校:</td>
			<td height="33" align="left"><s:textfield readonly="true" name="SSchool" ></s:textfield></td>
			<td>学历:</td>
			<td height="33" align="left"><s:textfield readonly="true" name="SDegree"></s:textfield></td>

		</tr>
		<tr>
		    <td>省份:</td>
			<td height="31" align="left"><s:textfield readonly="true" name="SProvince" ></s:textfield></td>
			<td>工作年限:</td>
			<td height="31" align="left"><s:textfield readonly="true" name="SWorklife" ></s:textfield></td>
			<td>介绍人:</td>
			<td height="31" align="left"><s:textfield readonly="true" name="SReference" ></s:textfield></td>
		</tr>
		<tr>
		    <td>介绍学员:</td>
			<td height="41" align="left"><s:textfield readonly="true" name="SIntroducestu" ></s:textfield></td>
			<td>意向班级:</td>
			<td height="41" align="left"><s:textfield readonly="true" name="SClasses" ></s:textfield></td>
			<td>意向度:</td>
			<td height="41" align="left"><s:textfield readonly="true" name="SStatus" ></s:textfield></td>
		</tr>
		<tr>
		    <td>咨询方式:</td>
			<td height="41" align="left"><s:textfield readonly="true"  name="FWay" ></s:textfield></td>
		</tr>
		<tr>
		<td>关注问题:</td>
		</tr>
		<tr><td></td>
			<td colspan="6"><s:textarea readonly="true" name="SProblem"  cols="60" rows="5"></s:textarea></td>
		</tr>
		<tr>
		<td>备注:</td>
		</tr>
		<tr><td></td>
			<td colspan="6"><s:textarea readonly="true" name="SRemarks"  cols="60" rows="5"></s:textarea></td>
		</tr>
		</s:form>
	</table>

</body>
</html>
