/**
 * @author ashish.adhikari
 */
package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ashish.adhikari
 *
 */
@RestController
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "Das Boot, reporting for duty!";
	}
}
