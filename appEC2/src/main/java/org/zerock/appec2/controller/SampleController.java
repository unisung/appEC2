package org.zerock.appec2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /* html, json, xml, plain text.,,, */
@RequestMapping("/api/sample")
public class SampleController { /* POJO */
  
	@GetMapping("/getArr") /* localhost:8080/api/sample/getArr */
	public String[] getArr() {
		return new String[] {"AAA", "BBB","CCC"};
	}
	
}
