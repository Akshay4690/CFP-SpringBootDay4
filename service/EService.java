package com.demo.employee.service;

import java.util.List;

import com.demo.employee.dto.EmployeeModelDTO;
import com.demo.employee.entity.EmployeeModel;

public interface EService {

	EmployeeModel postempuser(EmployeeModelDTO model);

	List<EmployeeModel> getAllUser();

	EmployeeModel getAllUser(int id);

	String deleteUser(int id);

	EmployeeModel updateUser(int id, EmployeeModel model);

}
