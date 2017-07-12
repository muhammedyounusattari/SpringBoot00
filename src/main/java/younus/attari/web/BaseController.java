package younus.attari.web;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/home")
public interface BaseController {

	@RequestMapping("/first")
	public ModelAndView firstRequest(@PathParam("first") String name);
}
