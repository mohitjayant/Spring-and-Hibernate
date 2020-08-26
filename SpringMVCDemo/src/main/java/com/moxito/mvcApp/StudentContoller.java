package com.moxito.mvcApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentContoller {

	@RequestMapping("/showForm")
	public String showForm(Model thModel) {
		Student theStudent = new Student();

		// add object to model
		thModel.addAttribute("student", theStudent);
		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {

		// log the input data
		// System.out.println("theStudent: " + theStudent.getFirstName() + " " +
		// theStudent.getLastName());
		return "student-confirmation";
	}
}
