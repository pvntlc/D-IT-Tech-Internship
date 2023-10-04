package com.bnk.di4;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bnk.dto.Customer;
import com.bnk.model.IUserService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	IUserService ser;
	@Autowired
	private ServletContext servletContext;

	@RequestMapping("/loginView")
	public String loginView() {
		return "login";
	}

	@RequestMapping("/login")
	public String login(String id, String pw, HttpSession s, Model model) throws SQLException {
		boolean result = ser.login(id, pw);
		if (result) {
			s.setAttribute("id", id);
			model.addAttribute("msg", "로그인 성공 !");
			return "index";
		} else {
			// TODO Auto-generate d catch block
			model.addAttribute("msg", "로그인에 실패하였습니다.");
			return "login";
		}

		
	}

	@RequestMapping(value = "/logout")
	public String logout(HttpSession s) {
		s.invalidate();
		return "index";
	}

}
