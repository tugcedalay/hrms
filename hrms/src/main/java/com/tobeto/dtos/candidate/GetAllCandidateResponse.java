package com.tobeto.dtos.candidate;

import lombok.Data;

@Data
public class GetAllCandidateResponse {
	private int id;
	private String email;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private int birthYear;
}
