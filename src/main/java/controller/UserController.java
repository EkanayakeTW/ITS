/**
 * 
 */
package controller;

/**
 * @author Ekanayaketw
 *
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import service.UserService;




@Controller    
@RequestMapping(path="/demo") 
public class UserController {
@Autowired 
private UserService userservice;

	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewUser (@RequestParam String name
			, @RequestParam String password) {
		userservice.addNewUser(name, password);
		return "Saved";
	}

	/*@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		//return userRepository.findAll();
	}*/
}