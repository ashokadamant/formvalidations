package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.nt.validations.EmployeeValidator;

@SpringBootApplication
@PropertySource("com/nt/validations/validation.properties")
public class MiniProjectFormValidationsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(MiniProjectFormValidationsApplication.class, args);
		EmployeeValidator empval=ctx.getBean("empval",EmployeeValidator.class);
		System.out.println(empval);
		System.out.println("ashok");
	}

}
