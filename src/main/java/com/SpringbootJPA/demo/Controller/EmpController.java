package com.SpringbootJPA.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.SpringbootJPA.demo.dao.Employeerepo;
import com.SpringbootJPA.demo.model.Employment;

@Controller @RestController
public class EmpController {

	@Autowired
	Employeerepo repo;
		
		@RequestMapping("/")
		public String home() {
			System.out.println("hi");
			return "home.jsp";
		}
		
		@RequestMapping("/Add")
		public String Addemployee(Employment employment) {
			repo.save(employment);
			return"home.jsp";
		}
		
		@RequestMapping("/GetEmployee")
		public ModelAndView Getemployee(@RequestParam int EmpID) {
			ModelAndView mv=new ModelAndView("Show.jsp");
			Employment employment = repo.findById(EmpID).orElse(new Employment());
			mv.addObject(employment);
			return mv;
			
		}
		
//		@RequestMapping("/Employment")
//		@ResponseBody
//		public List<Employment> AllEmployee() {
//			return repo.findAll();
//		}
		
		@RequestMapping(path="/Employment")
		@ResponseBody
		public List<Employment> AllEmployee() {
			return repo.findAll();
		}
		
		@GetMapping(path="/Employment/{EmpID}",produces= {"application/json"})
		public Optional<Employment> EmployeeEMPIDGet(@PathVariable("EmpID") int EmpID) {
			return repo.findById(EmpID);
		}
		
		@PostMapping(path="/Employment", consumes={"application/json"})
		public Employment AddEmployeepost(@RequestBody Employment employment) {
			repo.save(employment);
			return employment;
		}
		
		@DeleteMapping(path="/Employment/{EmpID}",produces= {"application/json"})
		public String EmployeeEMPIDDelete(@PathVariable("EmpID") int EmpID) {
			
			Employment employement = repo.getOne(EmpID);
			repo.delete(employement);
			return "Deleted";
		}
		
		
		@PutMapping(path="/Employment", consumes={"application/json"})
		public Employment AddorupEmployeepost(@RequestBody Employment employment) {
			repo.save(employment);
			return employment;
		}
	}

