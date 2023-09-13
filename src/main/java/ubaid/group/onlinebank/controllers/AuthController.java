package ubaid.group.onlinebank.controllers;

import ubaid.group.onlinebank.dtos.LoginDto;
import ubaid.group.onlinebank.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	@Autowired
	private AuthService authService;
	@PostMapping("/login")
	public String login(@RequestBody LoginDto loginDto) {
		
		return authService.login(loginDto);
	}

}
