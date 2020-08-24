package com.moxito.mvcApp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	// need a controller method to show HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "HelloWorldForm";
	}

	// need a controller method to process the html form
	@RequestMapping("/processForm")
	public String processFrom() {
		return "helloWorld";
	}

	// Controller method to read form data and add data to model
	@RequestMapping("/addFromDataModel")
	public String addFormDataModel(HttpServletRequest request, Model model) {

		// read the request parameter from html form
		String theName = request.getParameter("studentName");
		theName = theName.toUpperCase();
		String message = "Yo! " + theName;
		model.addAttribute("message", message);
		return "helloWorld";
	}
}
