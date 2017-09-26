package zx.github.com.web.controller.common.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class IndexView {
	
	@RequestMapping(value="/")
	public ModelAndView indexView1() {
		ModelAndView mav = new ModelAndView("index.html");
		return mav;
	}
	
	@RequestMapping(value="/index.view")
	public ModelAndView indexView2() {
		ModelAndView mav = new ModelAndView("index.html");
		return mav;
	}
}
