package younus.attari.web.impl;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import younus.attari.web.BaseController;

@RestController
public class BaseControllerImpl implements BaseController {

	@Override
	public ModelAndView firstRequest(@PathParam("first") String name) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "some text information...");
		mv.setViewName("first");
		System.out.println("this is from first view");
		return mv;
//		return "Welcome..."+name;
	}

}
