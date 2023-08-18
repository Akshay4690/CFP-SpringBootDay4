package com.demo.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.employee.dto.EmployeeModelDTO;
import com.demo.employee.entity.EmployeeModel;
import com.demo.employee.repository.EmployeeRepository;

@Service
public class EmployeeService implements EService {

	@Autowired
	EmployeeRepository repository;
	
	@Override
	public EmployeeModel postempuser(EmployeeModelDTO model) {
		EmployeeModel user = new EmployeeModel (model);
		return user;
	}

	@Override
	public List<EmployeeModel> getAllUser() {
		return repository.findAll();
	}

	@Override
	public EmployeeModel getAllUser(int id) {

		Optional<EmployeeModel> user = repository.findById(id);
		return user.get();
	}

	@Override
	public String deleteUser(int id) {
		repository.deleteById(id);
		return "User Deleted SuccessFully,for id:" +id;
	}

	@Override
	public EmployeeModel updateUser(int id, EmployeeModel model) {
		EmployeeModel eModel = repository.findById(id).get();
		
		eModel.setName(model.getName());
		eModel.setGender(model.getGender());
		eModel.setStartDate(model.getStartDate());
		eModel.setSalary(model.getSalary());
		eModel.setProfilePic(model.getProfilePic());
		eModel.setDepartment(model.getDepartment());
		eModel.setNote(model.getNote());
		repository.save(eModel);
		
		return eModel;
		
	}

}
