package com.sw.proxy;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sw.proxy.model.Fencer;

@RestController
public class FencersController {

	@RequestMapping("/fencer")
	public Fencer getFencer() {
		return new Fencer();
	}
	
}
