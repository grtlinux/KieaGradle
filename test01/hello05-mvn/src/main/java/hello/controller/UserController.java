package hello.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hello.exception.ResourceNotFoundException;
import hello.model.User;
import hello.repository.UserRepository;

@RestController
@RequestMapping("/api/v1")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return this.userRepository.findAll();
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long userId) throws ResourceNotFoundException {
		User user = this.userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User not found :: " + userId));
		return ResponseEntity.ok().body(user);
	}
	
	@PostMapping("/users")
	public User createUser(@Valid @RequestBody User user) {
		user.setCreatedAt(new Date());
		user.setUpdatedAt(new Date());
		return this.userRepository.save(user);
	}
	
	@PutMapping("/users/{id}")
	public ResponseEntity<User> updateUser(@PathVariable(value = "id") Long userId, @Valid @RequestBody User userDetails) throws ResourceNotFoundException {
		User user = this.userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User not found :: " + userId));
		
		user.setEmailId(userDetails.getEmailId());
		user.setLastName(userDetails.getLastName());
		user.setFirstName(userDetails.getFirstName());
		user.setUpdatedAt(new Date());
		final User updatedUser = this.userRepository.save(user);
		
		return ResponseEntity.ok(updatedUser);
	}
	
	@DeleteMapping("/users/{id}")
	public Map<String, Boolean> deleteUser(@PathVariable(value = "id") Long userId) throws ResourceNotFoundException {
		User user = this.userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User not found :: " + userId));
				
		this.userRepository.delete(user);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		
		return response;
	}
}
