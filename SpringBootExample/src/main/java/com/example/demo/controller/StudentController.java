package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.bean.StudentBean;
import com.example.demo.studentrepository.StudentRepository;
@Controller
public class StudentController {
	
	@Autowired
	private StudentRepository repo;
	
	@GetMapping("/index")
	public String showMainPage() {
		System.out.println("Success");
		return "home";
	}
		
		@GetMapping("/insert")
		public String insert(StudentBean studentBean) {
			repo.save(studentBean);
//			System.out.println("Successfully Inserted");
			return "insert";
	}
		
		@PostMapping("/insertAction")
		public String insertAction(StudentBean studentBean) {
			repo.save(studentBean);
			System.out.println(studentBean.getName());
			System.out.println(studentBean.getAddress());
			return "allstudents";
	}
		@GetMapping("/allstudents")
		public String view(Model model) {
			List<StudentBean> studentList = new ArrayList<StudentBean>();
			studentList=repo.findAll();
			System.out.println("Successfully");
			return "allstudents";
	}	

}
