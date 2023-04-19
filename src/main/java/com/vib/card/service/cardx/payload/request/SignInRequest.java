package com.vib.card.service.cardx.payload.request;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SignInRequest implements Serializable {

	private static final long serialVersionUID = 4548238960835095628L;

	private String username;
	private String password;
}
