package com.example.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTfulAPIController {
	@GetMapping("/rest") // GET RESTAPI
	public RESTfulAPIResponse getRest() {
		// 返り値をid＝1, name="subaru_get", age=10
		return new RESTfulAPIResponse(1,"subaru_get",10);
	}
	@PostMapping("/rest") // POST RESTAPI
	public RESTfulAPIResponse postRest() {
		// 返り値をid＝2, name="subaru_post", age=20
		return new RESTfulAPIResponse(2,"subaru_post",20);
	}
}
