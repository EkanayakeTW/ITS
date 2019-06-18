/**
 * 
 */
package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.User;
import model.UserRepository;
@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public  String addNewUser ( String name, String password) {
		
		User n = new User();
		n.setUsername(name);
		n.setPassword(password);
		userRepository.save(n);
		return "Saved";
	}
	

}
