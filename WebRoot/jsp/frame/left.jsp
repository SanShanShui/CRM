<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

String sup=(String)request.getSession().getAttribute("super");
%>

<HTML><HEAD>
<link href="../../css/dtree.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="../../js/dtree.js"></script>
<META http-equiv=Content-Type content="text/html; charset=utf-8">
</HEAD>
<BODY bgColor=#DDF0FB leftMargin=0 topMargin=0 marginwidth="0" marginheight="0">
<table width="90%" border="0" cellspacing="1" cellpadding="2" align="center" >
<tr>
<div class="dtree">
	<script type="text/javascript">
		d = new dTree('d');
		d.add('01','-1','CRM管理系统');
		d.add('0101','01','咨询部');
		d.add('010101','0101','咨询学生管理','../../student/findAllStu.action','','right');
		d.add('010102','0101','咨询学生跟踪','../../follow/findAllFollow','','right');
		d.add('010103','0101','学生移交','../../remove/findStuRemove','','right');
		d.add('010104','0101','移交历史查询','../../remove/findAllRemove','','right');
		d.add('0102','01','学工部');
		d.add('010201','0102','在校学生管理','../role/listRole.html','','right');
		d.add('010202','0102','学生升级/留班','../role/listRolePri.html','','right');
		d.add('010203','0102','学生流失情况','../privilege/listPrivilege.html','','right');		
		d.add('0103','01','教学部');
		d.add('010301','0103','班级管理','../classesm/listClass.html','','right');
		d.add('010302','0103','课程类别','../lesson/listLesson.html','','right');
		d.add('0104','01','就业部');
		d.add('010401','0104','就业情况','../dept/listDept.html','','right');
		d.add('0105','01','人力资源部');
		d.add('010501','0105','部门管理','../../department_findAll.action','','right');
		d.add('010502','0105','职务管理','../../positions_findAll','','right');
		d.add('010503','0105','员工管理','../staff/listStaff.html','','right');
		var a="super";
		if(a=="<%=sup%>"){
			d.add('0106','01','管理部门');
			d.add('010601','0106','查询管理员','../../selectAllUser.action','','right')
		}
		document.write(d);
	</script>
</div>
</tr>
</table>
</BODY>
</HTML>
      			
			


      
