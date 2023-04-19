package com.vib.card.service.cardx.payload.response;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignInResponse implements Serializable {

	private static final long serialVersionUID = 1460120132054668715L;

	public SignInResponse(String token, Date expiry, String jId, String username, String email) {
		this.token = token;
		this.jId = jId;
		this.username = username;
		this.email = email;
		this.expiry = expiry;
	}

	private String token;
	private String type= "Bearer ";
	private String jId;
	private String username;
	private String email;
	private Date expiry;

}
