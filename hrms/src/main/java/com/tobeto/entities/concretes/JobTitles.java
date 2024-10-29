package com.tobeto.entities.concretes;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "job_titles")
public class JobTitles{
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
   
	
	@NotNull
	@NotBlank
	@Column(name = "title")
    private String title;
	
	//private String companyName;
	//private String jobPozisition;
	//private String jobDescription;
	//private String city;
//	private String minSalary;
//	private String maxSalary;
//	private int openPositionCount;
//	private LocalDate publicationDate;
//	private LocalDate applicationDeadline;
	
	
	
	
}
