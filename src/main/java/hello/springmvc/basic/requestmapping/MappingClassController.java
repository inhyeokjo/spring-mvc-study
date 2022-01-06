package hello.springmvc.basic.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MappingClassController {

	@GetMapping("/users")
	public String users() {
		return "get users";
	}

	@PostMapping("/users")
	public String addUser() {
		return "add users";
	}

	@GetMapping("/users/{userId}")
	public String findUser(@PathVariable Long userId) {
		return "find user:"+userId;
	}

	@PostMapping("/users/{userId}")
	public String updateUser(@PathVariable Long userId) {
		return "update user:"+userId;
	}

	@DeleteMapping("/users/{userId}")
	public String deleteUser(@PathVariable Long userId) {
		return "delete user:"+userId;
	}
}
