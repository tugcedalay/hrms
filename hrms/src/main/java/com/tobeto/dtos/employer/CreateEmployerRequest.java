package com.tobeto.dtos.employer;

import lombok.Data;

@Data
public class CreateEmployerRequest {
	
	private String companyName;
    
    private String webAdress;
    
    private String phoneNumber;
    
    private String email;
    private String password;
    private String passwordRepeat;
}
