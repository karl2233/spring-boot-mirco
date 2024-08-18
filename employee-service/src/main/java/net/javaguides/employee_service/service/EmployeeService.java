package net.javaguides.employee_service.service;

import net.javaguides.employee_service.dto.APIResponseDto;
import net.javaguides.employee_service.dto.EmployeeDto;

public interface EmployeeService {
    public EmployeeDto saveEmployee(EmployeeDto employeeDto);
    public APIResponseDto getEmployeeById(Long employeeId);
}
