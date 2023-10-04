package com.bnk.di4;

import java.sql.SQLException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bnk.model.dto.Phone;
import com.bnk.service.PhoneService;

@Controller
public class PhoneController {
	@Autowired
	PhoneService pser;
	
	@RequestMapping("/")
	public String home(Locale locale, Model model) {
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
