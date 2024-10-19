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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee extends User {
    
	
	@NotNull
	@NotBlank
	@Column(name = "first_name")
	private String firstName;
	
	
	@NotNull
	@NotBlank
	@Column(name = "last_name")
	private String lastName;
}
