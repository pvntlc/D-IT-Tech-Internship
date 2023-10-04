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

import com.bnk.model.Customer;
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

	@RequestMapping("/regView")
	public String regView() {
		return "register";
	}

	@RequestMapping("/login")
	public String login(String userName, String pw, HttpSession s, Model model) throws SQLException {

		boolean result = ser.login(userName, pw);
		if (result) {
			s.setAttribute("userName", userName);
			model.addAttribute("msg", "로그인 성공 !");
		} else {
			model.addAttribute("msg", "아이디 혹은 비밀번호 오류 !");
			// TODO Auto-generate d catch block
			model.addAttribute("msg", "로그인 실패!");
		}

		return "index";
	}

	@RequestMapping(value = "/logout")
	public String logout(HttpSession s) {
		s.invalidate();
		return "index";
	}

	@RequestMapping(value = "/register")
	public String register(String userName, String password, String conts, HttpSession s, Model model) {
		try {
			ser.save(new Customer(userName, password, conts));
			s.setAttribute("userName", userName);
			model.addAttribute("msg", "회원가입 성공 !");
		} catch (SQLException e) {
			model.addAttribute("msg", "회원가입 실패!");
		}
		return "index";
	}

	@RequestMapping(value = "/register3")
	public String upload(String userName, String password, String conts,
			@RequestParam("uploadfile") MultipartFile mFile, HttpSession s, Model model)
			throws IllegalStateException, IOException {
		try {
			String fName = mFile.getOriginalFilename();
			File f = new File(servletContext.getRealPath("/resources/img"), fName);
			System.out.println(f);
			mFile.transferTo(f);
			ser.save(new Customer(userName, password, conts, fName));
			s.setAttribute("userName", userName);
			model.addAttribute("msg", "회원가입 성공 !");
		} catch (SQLException e) {
			model.addAttribute("msg", "회원가입 실패!");
		}
		return "index";
	}

	@RequestMapping("/list")
	public String list(Model m) {
		List<Customer> cus;
		try {
			cus = ser.search();
			m.addAttribute("cus", cus);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "list";
	}

	@RequestMapping("/delete")
	public String delete(int cnum, Model m) {
		try {
			ser.delete(cnum);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}

	@RequestMapping("/view")
	public String view(int cnum, Model m) {
		try {
			Customer cus = ser.search(cnum);
			m.addAttribute("cus", cus);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "view";
	}

	@RequestMapping("/modifyView")
	public String modifyView(int cnum, Model m) {
		try {
			Customer cus = ser.search(cnum);
			m.addAttribute("cus", cus);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "modify";
	}

	@RequestMapping("/modifySave")
	public String modifySave(int cnum, String conts, @RequestParam("uploadfile") MultipartFile mFile, Model m)
			throws IllegalStateException, IOException {
		try {
			String fName = mFile.getOriginalFilename();
			File f = new File(servletContext.getRealPath("/resources/img"), fName);
			mFile.transferTo(f);
			ser.update(conts, fName, cnum);
			m.addAttribute("msg", "수정 완료 !");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}

	@RequestMapping("/getImg")
	@ResponseBody
	public Map<String, String> getImg(int cnum) throws SQLException {
		Customer c = ser.search(cnum);
		Map<String, String> m = new HashMap<String, String>();
		m.put("imgInfo", c.getImgInfo());
		return m;
	}

	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(Exception e) {
		ModelAndView m = new ModelAndView();
		m.addObject("msg", e.getMessage());
		m.setViewName("error");
		return m;
	}
}
