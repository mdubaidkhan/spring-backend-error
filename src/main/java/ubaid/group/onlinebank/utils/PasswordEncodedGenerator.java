package ubaid.group.onlinebank.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncodedGenerator {
	
	public static void main(String [] args) {
		
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		System.out.println(encoder.encode("1234"));
	
		
	}

}
