package com.RestOp.REST;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	
	@Autowired
	RestRepository restRepository;
	
	@PostMapping("/addEmployee")
	public Rest Employees(@RequestBody Rest rest ) {
	return restRepository.save(rest);
	}
	
	@GetMapping("/readEmp")
	public Iterable<Rest> employeeDetails(){
		return restRepository.findAll();
	}
	
	@DeleteMapping("/delete/{EmployeeId}")
	public void deleteEmployee(@PathVariable("EmployeeId") long EmployeeId){
		restRepository.deleteById(EmployeeId);
	}
	
	@PutMapping("/updateEmpDetails/{EmployeeId}")
	public Rest updateEmployee(@PathVariable ("EmployeeId") long EmployeeId, @RequestBody Rest rest) {
		return restRepository.save(rest);
		
	}
	
}
