package com.chainsys.springproject.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chainsys.springproject.appconfig.AppConfig;
import com.chainsys.springproject.beans.Customer;
import com.chainsys.springproject.beans.Employee;
import com.chainsys.springproject.component.MobilePhone;

public class TestAnnotationConfig {

	public static void testA() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp = ac.getBean(Employee.class);
		emp.setId(201);
		emp.setName("Raj");
		emp.print();
		Employee secondemp = ac.getBean(Employee.class);
	
	}
	public static void testPhone() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.scan("com.chainsys.springproject.component");
        ac.refresh();
        MobilePhone phone=ac.getBean(MobilePhone.class);
        phone.setPhoneNumber(8122410442l);
        long number=phone.getPhoneNumber();
        System.out.println("Phone Number : "+number);
	}
}
