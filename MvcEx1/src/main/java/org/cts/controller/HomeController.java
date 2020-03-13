package org.cts.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
	@RequestMapping("/show")
	public String showForm(Model model) {
		Emp e=new Emp();
		model.addAttribute(e);
		return "emp-form";
	}
	@RequestMapping("/process")
	public String processForm(@ModelAttribute("emp") @Valid Emp emp,BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			return "index";
		}
		else
		{
			return "emp-success";
		}
		
	}
}
