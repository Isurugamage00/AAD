package com.ijse.spring.service;

import com.ijse.spring.dto.EmployeeDTO;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/

public interface EmployeeService {
    EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);
    void deleteEmployee(String id);
    EmployeeDTO updateEmployee(EmployeeDTO employeeDTO);
    EmployeeDTO getEmpId(String id);
}
