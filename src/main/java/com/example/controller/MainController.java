package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dao.ListPostDAO;
import com.example.dao.ListUserDAO;
import com.example.model.PostInfo;
import com.example.model.UserInfo;

@Controller
public class MainController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String mainProgram() {
		// List<> list = bankAccountDAOlistBankAccountInfo();

		// model.addAttribute("accountInfos", list);

		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		// List<> list = bankAccountDAOlistBankAccountInfo();

		// model.addAttribute("accountInfos", list);

		return "login";

	}

	@RequestMapping(value = "/post", method = RequestMethod.GET)
	public String post() {
		// List<> list = bankAccountDAOlistBankAccountInfo();

		// model.addAttribute("accountInfos", list);

		return "post";
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String user() {
		return "user";
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String admin() {
		return "admin";
	}

	@RequestMapping(value = "/EditPage", method = RequestMethod.POST)
	public String showEdit( Model model, @PathVariable Long id) {
		List<PostInfo> listPost= new ArrayList<PostInfo>();
		listPost=listPostDAO.getPost(id);
		PostInfo post=new PostInfo();
		post=listPost.get(0);
		model.addAttribute("postinfo", post);
		return "EditPage";
	}
	@Autowired
	private ListUserDAO listUserDAO;
	@Autowired
	private ListPostDAO listPostDAO;
	@RequestMapping(value = "/User", method = RequestMethod.GET)
	public String showHomeUsers(Model model ) {
		//hien thi users
		List<UserInfo> listUser= listUserDAO.getUser();
		model.addAttribute("userinfos", listUser);
		//hien thi posts 
		List<PostInfo> listPost= listPostDAO.getPosts();
		model.addAttribute("postinfos", listPost);
		return "Home" ;
	}

	
}
