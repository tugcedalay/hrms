package com.tobeto.entities.abstracts;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED) //superclass islevi gorur
@Table(name = "users")
public abstract class User {
    
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
    
	
	@Email(message = "Please enter a valid e-mail address.")
	@NotNull(message = "The email field cannot be null")
	@NotBlank(message = "The email field cannot be blank")
	@Column(name = "email")
    private String email;
    
	
	
	@NotNull(message = "The email field cannot be null")
	@NotBlank(message = "The email field cannot be blank")
	@Column(name = "password")
    private String password;
    
	
	//degiskenin veritabanında saklanmamasını saglar 
	@Transient
    private String passwordRepeat;
}
