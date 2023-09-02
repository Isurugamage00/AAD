package com.ijse.spring.api;

import com.ijse.spring.dto.EmployeeDTO;
import com.ijse.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping("api/v1/employee")
public class Employee {
    @Autowired
    EmployeeService employeeService;

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public EmployeeDTO saveEmployee(
            @RequestPart String empId,
            @RequestPart String empName,
            @RequestPart String empEmail,
            @RequestPart byte[] dep) {
        
        String empDep = Base64.getEncoder().encodeToString(dep);
        EmployeeDTO tmpEmp = new EmployeeDTO();
        tmpEmp.setEmpId(empId);
        tmpEmp.setEmpName(empName);
        tmpEmp.setEmpEmail(empEmail);
        tmpEmp.setEmpDep(empDep);

        return employeeService.saveEmployee(tmpEmp);
    }

    @DeleteMapping("{id}")
    public void deleteEmployee(@PathVariable String id){
        System.out.println(id);
    }

    @PutMapping
    public void updateEmployee(@PathVariable String id,@RequestBody EmployeeDTO employeeDTO){
        System.out.println(id);
        System.out.println(employeeDTO);
    }

    @GetMapping(value = "/{id}")
    public List<EmployeeDTO> getEmployee(@PathVariable String id){

    }
}
