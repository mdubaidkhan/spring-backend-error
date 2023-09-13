package ubaid.group.onlinebank.controllers;

import ubaid.group.onlinebank.dtos.LoginDto;
import ubaid.group.onlinebank.service.AuthService;

import ubaid.group.onlinebank.dtos.JwtAuthResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<JwtAuthResponse> login(@RequestBody LoginDto loginDto) {
		
		String token=authService.login(loginDto);
		JwtAuthResponse response=
				new JwtAuthResponse();
		response.setAccessToken(token);
		
		return ResponseEntity.ok(response);
	}

}
