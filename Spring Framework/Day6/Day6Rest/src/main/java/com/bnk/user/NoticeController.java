package com.bnk.user;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bnk.user.dto.Notice;
import com.bnk.user.model.INoticeService;

@Controller
@RequestMapping("notice")
public class NoticeController {
	
	@Autowired
	INoticeService nser;
	
	@RequestMapping("")
	public String notice() {
		return "index";
	}
	
	@RequestMapping("/regView")
	public String noticeRegView(){
		return "noticeRegView";
	}
	
	@RequestMapping("/reg")
	public String reg(Notice n, Model m, HttpSession s) {
		n.setWriter((String) s.getAttribute("userName"));
		nser.save(n);
		m.addAttribute("msg", "성공적으로 등록되었습니다.");
		return "index";
	}
	
	@RequestMapping("/list")
	public String noticeList(Model m, String word){
		List<Notice> nos = nser.search(word);
		m.addAttribute("word",word);
		m.addAttribute("nos", nos);
		return "noticeList";
	}
	
	@RequestMapping("/view")
	public String noticeView(Model m, int cnum) {
		Notice nos = nser.searchSeq(cnum);
		m.addAttribute("cus",nos);
		return "noticeView";
	}
	
	@RequestMapping("/delete")
	public String delete(int cnum, Model m) {
		nser.delete(cnum);
		m.addAttribute("msg","성공적으로 삭제되었습니다 !");
		return "index";
	}
	
	@RequestMapping("/updateView")
	public String updateView(int cnum, Model m) {
		Notice n = nser.searchSeq(cnum);
		m.addAttribute("nos", n);
		return "noticeUpdate";
	}
	
	@RequestMapping("/update")
	public String update(int cnum, String title, String cont, Model m) {
		Notice n = nser.searchSeq(cnum);
		n.setCont(cont);
		n.setTitle(title);
		nser.update(n);
		return "index";
	}

}
