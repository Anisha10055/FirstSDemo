package com.cg.learn;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Hello h = (Hello) factory.getBean("hi");
		Hello h1 = (Hello) factory.getBean("hi");
		Hello h2 = (Hello) factory.getBean("hi");
		System.out.println(h.sayHello("Anisha"));

	}

}
