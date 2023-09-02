package com.ijse.spring.service.impl;

import com.ijse.spring.dto.EmployeeDTO;
import com.ijse.spring.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {
        return null;
    }

    @Override
    public void deleteEmployee(String id) {

    }

    @Override
    public EmployeeDTO updateEmployee(String id,EmployeeDTO employeeDTO) {
        return null;
    }

    @Override
    public EmployeeDTO getEmpId(String id) {
        return null;
    }
}
