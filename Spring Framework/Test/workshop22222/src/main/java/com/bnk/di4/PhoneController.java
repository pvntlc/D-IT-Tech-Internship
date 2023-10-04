package com.bnk.di4;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.bnk.dto.Phone;
import com.bnk.model.PhoneService;

@Controller
public class PhoneController {
	@Autowired
	PhoneService pser;
	@Autowired
	private ServletContext servletContext;
	
	@RequestMapping("/")
	public String home(Locale locale, Model model) {
		return "index";
	}
	
	@RequestMapping("/regView")
	public String regView() {
		return "register";
	}
	
	@RequestMapping("/register")
	public String reg(Phone phone, @RequestParam("uploadfile") MultipartFile mFile) throws IllegalStateException, IOException{
		try {
			String fName = mFile.getOriginalFilename();
			File f = new File(servletContext.getRealPath("/resources/img"), fName);
			System.out.println(f);
			mFile.transferTo(f);
			phone.setPimg(fName);
			pser.add(phone);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";	
	}
	
	@RequestMapping("/list")
	public String list(Model m) {
		List<Phone> phones;
		try {
			phones = pser.search();
			m.addAttribute("phones", phones);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "list";
	}
	
	@RequestMapping("/view")
	public String view(String pnum, Model m) {
		try {
			Phone phones = pser.searchPnum(pnum);
			m.addAttribute("phones", phones);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "view";
	}
	
	@RequestMapping("/getQuantity")
	@ResponseBody
	public Map<String, Integer> getImg(String pnum) throws SQLException {
		System.out.println(pnum);
		Phone phone = pser.searchPnum(pnum);
		Map<String, Integer> m = new HashMap<String, Integer>();
		System.out.println(phone);
		m.put("quantity", phone.getQuantity());
		System.out.println(m);
		return m;
	}

}
