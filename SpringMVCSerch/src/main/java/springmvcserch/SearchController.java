package springmvcserch;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/Home")
	public String Home() {
		
		return "Home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		
		
		String URL = "https://www.google.com/search?q="+query;
	RedirectView view = 	new RedirectView();
		view.setUrl(URL);
		
		return view;
		
	}
}
