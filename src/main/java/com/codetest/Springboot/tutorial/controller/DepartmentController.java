package com.codetest.Springboot.tutorial.controller;

import com.codetest.Springboot.tutorial.entity.Department;
import com.codetest.Springboot.tutorial.service.DepartmentService;
import com.codetest.Springboot.tutorial.service.DepartmentServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
    DepartmentService service = new DepartmentServiceImpl()



    }

}
