package com.mingda.pasrv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mingda.pasrv.model.Torg;
import com.mingda.pasrv.services.CommonService;

@RequestMapping("/")
@Controller
public class HomeController {
	
	@Autowired
	private CommonService commonService;
	
	@RequestMapping("/gethostconf")
	@ResponseBody
	public String getHostconf() {
		Torg o= commonService.queryHostconf();
		return o.toString();
		
	}
}
