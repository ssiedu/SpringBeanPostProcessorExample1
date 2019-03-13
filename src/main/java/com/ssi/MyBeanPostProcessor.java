package com.ssi;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("Inside postProcessAfterInitialization");
		System.out.println(bean);
		System.out.println(beanName);
		if(beanName.equals("customer1")){
			System.out.println("Happy Shopping");
		}else if(beanName.equals("product1")){
			System.out.println("Quality Assured");
		}else if(beanName.equals("supplier1")){
			System.out.println("Business Redefined");
		}
		
		
		String name=bean.getClass().getSimpleName();
		if(name.equalsIgnoreCase("customer")){
			
			Customer c=(Customer)bean;
			int code=c.getCode();
			int newcode=code+1000;
			c.setCode(newcode);
			return c;
		}
		
		
		
		
		
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("Inside postProcessBeforeInitialization");
		return bean;
	}

	
	
}
