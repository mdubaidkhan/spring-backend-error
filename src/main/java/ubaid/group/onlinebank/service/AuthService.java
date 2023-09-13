package ubaid.group.onlinebank.service;

import ubaid.group.onlinebank.dtos.LoginDto;

public interface AuthService {

	String login(LoginDto loginDto);
}
