package com.bnk.di4;

import java.sql.SQLException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bnk.dto.Customer;
import com.bnk.dto.Product;
import com.bnk.model.ProductServiceImpl;

@Controller
public class ProductController {
	
	@Autowired
	ProductServiceImpl dao;
	
	@RequestMapping("")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/regView")
	public String regView() {
		return "register";
	}
	
	@RequestMapping("/register")
	public String register(String code, String title, String category, String rate, String memo, Model model) {
		try {
			double realRate = Double.parseDouble(rate);
			dao.save(new Product(code, title, category, realRate, memo));
			model.addAttribute("msg", "정상적으로 저장 되었습니다");
		} catch (SQLException e) {
			model.addAttribute("msg", "저장에 실패하였습니다");
		}
		
		return "result";
	}
	
	@RequestMapping("/list")
	public String list(Model m, String word, String category) {
		List<Product> pos;
		try {
			if(category == null) {
				pos = dao.search(word);
			}
			else if(category.equals("title")) {
				pos = dao.search(word);
			}
			else {
				pos = dao.searchBoon(word);
			}
			m.addAttribute("category", category);
			m.addAttribute("pos", pos);
			m.addAttribute("word",word);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "list";
	}
	
	@RequestMapping("/view")
	public String view(int code, Model model) {
		try {
			Product pos = dao.search(code);
			model.addAttribute("pos", pos);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "view";
	}
	
	@RequestMapping("/delete")
	public String delete(String code, Model m) {
		try {
			dao.delete(code);
			m.addAttribute("msg", "정상적으로 삭제되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "result";
	}
	
	@RequestMapping("/getMemo")
	@ResponseBody
	public Map<String, String> getMemo(String title) throws SQLException {
		Product p = dao.searchTitle(title);
		System.out.println(p);
		Map<String, String> m = new HashMap<String, String>();
		m.put("memo", p.getMemo());
		return m;
	}
	
	@RequestMapping("/deleteAll")
	public String deleteAll(int[] code, Model m, HttpServletRequest request) throws SQLException {
		Enumeration e = request.getParameterNames();
		while(e.hasMoreElements()) {
			String num = (String) e.nextElement();
			dao.delete(num);
		}
		
		return "redirect:list";
	}

}
