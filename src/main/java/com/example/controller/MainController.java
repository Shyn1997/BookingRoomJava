package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String mainProgram() {
		//List<> list = bankAccountDAOlistBankAccountInfo();

		//model.addAttribute("accountInfos", list);

		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		//List<> list = bankAccountDAOlistBankAccountInfo();

		//model.addAttribute("accountInfos", list);

		return "login";
		}
	
	@RequestMapping(value = "/post", method = RequestMethod.GET)
	public	String post() {
		//List<> list = bankAccountDAOlistBankAccountInfo();

		//model.addAttribute("accountInfos", list);

		return "post";
		}
	
	@RequestMapping(value="/user", method = RequestMethod.GET)
	public String user() {
		return "user";
	}
	
	@RequestMapping(value="/admin", method = RequestMethod.GET)
	public String admin() {
		return "admin";
	}
	
	}
