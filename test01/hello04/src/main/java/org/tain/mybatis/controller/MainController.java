package org.tain.mybatis.controller;

import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.tain.mybatis.service.MainService;
import org.tain.mybatis.vo.UsrVo;


@Controller
public class MainController {

	@Resource(name = "mainService")
	private MainService mainService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main(Locale locale, Model model) {
		UsrVo usrVo = mainService.getUsr();
		System.out.println(">>>>>> " + usrVo);
		model.addAttribute("usr", usrVo);
		
		return "index";
	}
}
