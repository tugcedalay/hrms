package com.tobeto.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tobeto.business.abstracts.JobTitlesService;
import com.tobeto.core.utilities.DataResult;
import com.tobeto.core.utilities.Result;
import com.tobeto.entities.concretes.JobTitles;

@RestController
@RequestMapping("/api/jobtitles")
public class JobTitlesController {
    
	private JobTitlesService jobTitlesService;
	
	@Autowired
	public JobTitlesController(JobTitlesService jobTitlesService) {
		super();
		this.jobTitlesService = jobTitlesService;
	}
	
	@GetMapping("/getall")
    public DataResult<List<JobTitles>> getAll(){
    	return this.jobTitlesService.getAll();
    }
	@PostMapping("/add")
	public Result add(@RequestBody JobTitles jobTitles){
		return this.jobTitlesService.add(jobTitles);
	}
	@GetMapping("/getAllByPage")
	DataResult<List<JobTitles>> getAll(int pageNo, int pageSize){
		 return this.jobTitlesService.getAll(pageNo, pageSize);
	}
	
	@GetMapping("/getAllDesc")
	public DataResult<List<JobTitles>> getAllSorted(){
		return this.jobTitlesService.getAllSorted();	
		}
	
	
	
	
}
