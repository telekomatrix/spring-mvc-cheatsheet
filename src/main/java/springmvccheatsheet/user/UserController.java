package springmvccheatsheet.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
	private static User user;
	
	@ResponseBody
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public User getUser(@PathVariable String id) {
		User user; 
		
		// ...
		user = UserController.user;
		
		return user;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void saveUser(@RequestBody User user) {
		
		// ...
		
		UserController.user = user;
	}
}