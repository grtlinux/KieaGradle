package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")
public class MainController {

	@Autowired
	private UserRepository userRepository;
	
	// http://localhost:8080/demo/add?name=kang&email=hello@mail.com
	@GetMapping(path="/add")
	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		userRepository.save(user);
		return "Saved";
	}
	
	// http://localhost:8080/demo/all
	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUser() {
		return userRepository.findAll();
	}
}
