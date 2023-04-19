package com.vib.card.service.cardx.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vib.card.service.cardx.common.dto.ResponseData;
import com.vib.card.service.cardx.payload.request.SignInRequest;
import com.vib.card.service.cardx.payload.response.SignInResponse;
import com.vib.card.service.cardx.security.JwtTokenUtil;
import com.vib.card.service.cardx.service.impl.UserDetailServiceImpl;

@RestController
@RequestMapping("/api")
public class JwtAuthenticateController {

	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	UserDetailServiceImpl userDetailService;

	@Autowired
	JwtTokenUtil jwtTokenUtil;

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello world";
	}

	@PostMapping("/sign-in")
	public ResponseData<?> authenticateToken(@RequestBody SignInRequest req) throws Exception {

		String jId = UUID.randomUUID().toString();
		authenicate(req.getUsername(), req.getPassword());

		final UserDetails userDetails = userDetailService.loadUserByUsername(req.getUsername());
		final String token = jwtTokenUtil.generateToken(userDetails, jId);

		return new ResponseData<SignInResponse>().success(new SignInResponse(token, jwtTokenUtil.getExpirationDateFromToken(token), jId, req.getUsername(), null));
	}

	private void authenicate(String userName, String passWord) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userName, passWord));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}
}
