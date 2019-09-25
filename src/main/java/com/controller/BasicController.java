package com.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

	/*@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}*/

	@RequestMapping("/user")
	public Principal user(Principal principal) {
		return principal;
	}
}
