package com.tobeto.entities.abstracts;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "verification_codes")
public abstract class VerificationCode {
     
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
     
	 private String code;
     
	 private boolean isVerified;
     
	 private LocalDate verifiedDate;
}
