package com.nt.validations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("empval")
public class EmployeeValidator {
    @Value("${emp.id}")
	private int id;

	@Override
	public String toString() {
		return "EmployeeValidator [id=" + id + "]";
	}
    
	
}
