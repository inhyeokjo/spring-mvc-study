package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class MappingClassController {

	@GetMapping
	public String users() {
		return "get users";
	}

	@PostMapping
	public String addUser() {
		return "add users";
	}

	@GetMapping("/{userId}")
	public String findUser(@PathVariable Long userId) {
		return "find user:" + userId;
	}

	@PostMapping("/{userId}")
	public String updateUser(@PathVariable Long userId) {
		return "update user:" + userId;
	}

	@DeleteMapping("/{userId}")
	public String deleteUser(@PathVariable Long userId) {
		return "delete user:" + userId;
	}
}
