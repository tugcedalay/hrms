package com.tobeto.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tobeto.entities.concretes.JobTitles;

public interface JobTitlesDao extends JpaRepository<JobTitles, Integer> {
   boolean existsByTitle(String title);
}
