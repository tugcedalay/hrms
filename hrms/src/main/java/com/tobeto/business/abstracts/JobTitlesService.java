package com.tobeto.business.abstracts;

import java.util.List;

import com.tobeto.core.utilities.DataResult;
import com.tobeto.core.utilities.Result;
import com.tobeto.entities.concretes.JobTitles;

public interface JobTitlesService {
	DataResult<List<JobTitles>> getAll();
    DataResult<List<JobTitles>> getAllSorted();
    DataResult<List<JobTitles>> getAll(int pageNo, int pageSize);  
	
    
    
    Result add(JobTitles jobTitles);
	
	
	
	
	
	//DataResult<List<JobTitles>> getByJobTitlesIn(List<Integer> jobTitles);
	
	//DataResult<JobTitles> findAllActiveJobsSortedByDate();
	
	//DataResult<JobTitles> findAllActiveJobsByCompany(String CompanyName);
	
	//DataResult<JobTitles> findById();
	
	
}
