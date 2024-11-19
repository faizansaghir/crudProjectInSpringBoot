package io.github.faizansaghir.crudProjectInSpringBoot.rest;

import io.github.faizansaghir.crudProjectInSpringBoot.dao.EmployeeDao;
import io.github.faizansaghir.crudProjectInSpringBoot.entity.Employee;
import io.github.faizansaghir.crudProjectInSpringBoot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){
        Employee employee = employeeService.findById(employeeId);

        if(employee==null)
            throw new RuntimeException(STR."Employee id not found - \{employeeId}");

        return employee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        employee.setId(0);
        return employeeService.save(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){
        Employee employee = employeeService.findById(employeeId);
        if(employee==null)
            throw new RuntimeException(STR."Employee id not found - \{employeeId}");

        employeeService.deleteById(employeeId);

        return STR."Delete employee id - \{employeeId}";
    }
}
