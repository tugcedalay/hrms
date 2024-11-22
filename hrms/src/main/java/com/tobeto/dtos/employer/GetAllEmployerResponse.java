package com.tobeto.dtos.employer;

import lombok.Data;

@Data 
public class GetAllEmployerResponse {
    
	private String companyName;
    
    private String webAdress;
    
    private String phoneNumber;
    
    private String email;			
}
