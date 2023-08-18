package com.demo.employee.dto;

import java.util.Date;
import java.util.List;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeeModelDTO {
	
	@Pattern(regexp="[A-Z]{1}[a-zA-Z]{2,}$", message = "Naming convention should as per condition")
	private String name;
	@NotNull
	private String gender;
	private Date startDate;
	@Min(value = 10000,message="Minimum salary should be 10K")
	@Max(value = 50000,message = "Maximum salary should be 50K")
	private long salary;
	private String profilePic;
	private List<String> department;
	private String note;

}