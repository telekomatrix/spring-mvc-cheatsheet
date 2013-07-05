package springmvccheatsheet.user;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
	private static Map<String, UserDTO> users = new HashMap<String, UserDTO>();
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public @ResponseBody UserDTO getUser(@PathVariable String id) {
		UserDTO user; 
		
		// This would be replaced with actual business code
		user = users.get(id);
		
		return user;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public @ResponseBody String saveUser(@RequestBody UserDTO user) {
		
		// Mock persistence
		user.setId(UUID.randomUUID().toString());
		users.put(user.getId(), user);
		
		return user.getId();
	}
	
	@RequestMapping(value = "/get-all-users", method = RequestMethod.GET)
	public @ResponseBody Iterable<UserDTO> getAllUsers() {
		Iterable<UserDTO> allUsers; 
		
		// This would be replaced with actual business code
		allUsers = users.values();
		
		return allUsers;
	}
}