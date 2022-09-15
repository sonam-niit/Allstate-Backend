package com.allsttae.springsecurity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class CustomAutheticationProvider implements AuthenticationProvider{

	List<User> dummyUsers= new ArrayList<>();
	
	public CustomAutheticationProvider() {
		dummyUsers.add(new User("sonam", "secret", "ADMIN"));
		dummyUsers.add(new User("Alex", "alex123", "USER"));
	}
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String name= authentication.getName();
		String password= authentication.getCredentials().toString();
		
		Optional<User> autheticatedUser=dummyUsers.stream().filter(user->user.getName().equals(name) && 
				user.getPassword().equals(password)).findFirst();
		
		if(!autheticatedUser.isPresent())
			throw new BadCredentialsException("Not a valid User");
		
		List<GrantedAuthority> authorities=new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(autheticatedUser.get().getRole()));
		Authentication auth= new UsernamePasswordAuthenticationToken(name, password,authorities);
		return auth;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
