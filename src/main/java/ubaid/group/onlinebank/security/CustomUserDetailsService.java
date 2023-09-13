package ubaid.group.onlinebank.security;

import java.util.Set;
import java.util.stream.Collectors;

import ubaid.group.onlinebank.entities.User;
import ubaid.group.onlinebank.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user=userRepository.findByUsernameOrEmail(username, username)
				.orElseThrow(()->new UsernameNotFoundException("User not found with username or email "+username));
		
		
		Set<GrantedAuthority> authorities=
				user.getRoles().stream().map(role->new SimpleGrantedAuthority(role.getName()))
				.collect(Collectors.toSet());
		
		
		
		
		
		return new org.springframework.security.core.userdetails.User(user.getUsername(),
				user.getPassword(),authorities);
	}

}
