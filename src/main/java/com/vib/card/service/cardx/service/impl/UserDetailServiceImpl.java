package com.vib.card.service.cardx.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		if ("hien.lethanh".equals(username)) {
			return new User(username, "$2a$10$6R88bDe31XcZisPVukCg1e0QrjdPQX/tHGsacdvAqqh48zv54WCBe",
					new ArrayList<>());
			/* Permission */
		} else {
			throw new UsernameNotFoundException("user not found with username: " + username);
		}
	}
}
