package ubaid.group.onlinebank.service;

import ubaid.group.onlinebank.dtos.LoginDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
@Service
public class AuthServiceImpl implements AuthService {
	
	private AuthenticationManager authenticationManager;
	
	@Autowired
	public AuthServiceImpl(AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}


	@Override
	public String login(LoginDto loginDto) {
		
		UsernamePasswordAuthenticationToken authToken=
				new UsernamePasswordAuthenticationToken(loginDto.getUsernameOrEmail(),loginDto.getPassword());
		
		
		Authentication authentication=authenticationManager.authenticate(authToken);
		
		SecurityContextHolder.getContext().setAuthentication(authentication);
		
		return "User loggedin successfully";
	}

}
