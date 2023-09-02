package com.ijse.spring.dto;
import java.io.Serializable;
import java.util.Arrays;

public class EmployeeDTO implements Serializable {
    private String empId;
    private String empName;
    private String empEmail;
    private String empDep;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String empId, String empName, String empEmail, String empDep) {
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empDep = empDep;
    }


    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpDep() {
        return empDep;
    }

    public void setEmpDep(String empDep) {
        this.empDep = empDep;
    }


    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empDep='" + empDep + '\'' +
                '}';
    }
}
