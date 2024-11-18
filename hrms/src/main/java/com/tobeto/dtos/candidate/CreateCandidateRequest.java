package com.tobeto.dtos.candidate;

import lombok.Data;

@Data
public class CreateCandidateRequest {
	private String email;
	private String password;
	private String passwordRepeat;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private int birthYear;
	
	
}
