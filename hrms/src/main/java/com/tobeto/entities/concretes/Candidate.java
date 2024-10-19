package com.tobeto.entities.concretes;

import com.tobeto.entities.abstracts.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "candidates")
public class Candidate extends User {
    
	
	@NotNull(message = "First name field cannot be null")
	@NotBlank(message = "First name field cannot be blank")
	@Column(name = "first_name")
	private String firstName;
    
	
	@NotNull(message = "Last name field cannot be null")
	@NotBlank(message = "Last name field cannot be blank")
	@Column(name = "last_name")
    private String lastName;
    
	
	
	@NotNull(message = "Identity number field cannot be null")
	@NotBlank(message = "Identity number field cannot be blank")
	@Column(name = "nationality_id")
    private String nationalityId;
    
	
	
	@NotNull(message = "Birth year field cannot be null")
	@NotBlank(message = "Birth year  field cannot be blank")
	@Column(name = "birth_name")
    private String birthYear;
    
}
