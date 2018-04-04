package com.zy.util;

import java.lang.reflect.Method;

public class AnnotationParse {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String parse(Class cla,String methodName){
		//cla为action类
		try {
			//获取方法
			Method method=cla.getMethod(methodName);
			//判断方法上是否有注解
			if(method.isAnnotationPresent(MethodInfo.class)){
				//获取注解类
				MethodInfo mif=method.getAnnotation(MethodInfo.class);
				return mif.name();
			}else{
				return null;
			}
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return null;
	}

}
