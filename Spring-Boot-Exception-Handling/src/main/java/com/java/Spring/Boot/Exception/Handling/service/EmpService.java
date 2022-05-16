package com.java.Spring.Boot.Exception.Handling.service;

import java.util.ArrayList;
import com.java.Spring.Boot.Exception.Handling.modal.Employee;
public interface EmpService {
	ArrayList<Employee> findAllEmployee();
	Employee findAllEmployeeByID(long id);
	void addEmployee();
	void deleteAllData();
}
