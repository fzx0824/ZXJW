package zx.github.com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/index")
public class ViewJumpController {

	@RequestMapping(value="")
	public ModelAndView indexView2() {
		ModelAndView mav = new ModelAndView("pages/index/index.html");
		return mav;
	}
}
