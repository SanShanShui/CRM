package com.zy.util;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MyInterceptor extends MethodFilterInterceptor{

	/**
	 * result前正着经过拦截器拦截action
	 * result后倒着经过拦截器
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		
		String username=(String) ServletActionContext.getRequest().getSession().getAttribute("username");
System.out.println(username+":拦截器");
		//获取权限
		List<String> prilist=(List<String>) ServletActionContext.getRequest().getSession().getAttribute("privilege");
	System.out.println("权限拦截:"+prilist);	
	
		AnnotationParse parse=new AnnotationParse();
		//获取对应的action类
		Class cla=invocation.getAction().getClass();
		//获取方法
		String methodName=invocation.getProxy().getMethod();
		//获取方法上的注解 
		String annotationName=parse.parse(cla, methodName);
		System.out.println(annotationName+"拦截");
		//判断用户是否登录
		if(username!=null){
			//判断用户权限
			if(prilist.contains(annotationName)){
				System.out.println("进入action");
				return invocation.invoke();
			}else{
				ServletActionContext.getRequest().setAttribute("p", "没有权限");
				return "input";
			}
		}else{
			return "login";
		}
		
	}

}
