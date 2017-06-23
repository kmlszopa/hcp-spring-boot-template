package pl.kamilszopa.sap.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(){
		return "Hello World";
	}
}
