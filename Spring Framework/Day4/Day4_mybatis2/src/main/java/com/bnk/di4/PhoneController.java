package com.bnk.di4;

import java.sql.SQLException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bnk.dto.Phone;


@Controller
public class PhoneController {
	@Autowired
	com.bnk.model.PhoneService pser;
	@RequestMapping("/")
	public String home(Locale locale, Model model) {
		System.out.println("dddd");
		return "index";
	}
	
	@RequestMapping("/regView")
	public String regView() {
		return "register";
	}
	
	@RequestMapping("/register")
	public String reg(Phone phone){
		try {
			pser.add(phone);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";	
	}

}
