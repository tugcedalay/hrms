package com.tobeto.entities.confirm;

import com.tobeto.entities.abstracts.VerificationCode;
import com.tobeto.entities.concretes.Candidate;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "verification_code_candidate")
public class VerificationCodeCandidate extends VerificationCode{

	@ManyToOne
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;

}
