package zx.github.com.web.controller.common.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/common")
public class PageJumpView {

	@RequestMapping(value="/pageJump.view")
	public ModelAndView userManageDetail() {
		ModelAndView mav = new ModelAndView("pages/common/personIndex.html");
		return mav;
	}
}
