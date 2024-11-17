package com.tobeto.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.tobeto.business.abstracts.JobTitlesService;
import com.tobeto.core.utilities.DataResult;
import com.tobeto.core.utilities.Result;
import com.tobeto.core.utilities.SuccessDataResult;
import com.tobeto.core.utilities.SuccessResult;
import com.tobeto.dataAccess.abstracts.JobTitlesDao;
import com.tobeto.entities.concretes.JobTitles;

@Service
public class JobTitlesManager implements JobTitlesService{
     
	private JobTitlesDao jobTitlesDao;
    
	@Autowired
	public JobTitlesManager(JobTitlesDao jobTitlesDao) {
		super();
		this.jobTitlesDao = jobTitlesDao;
	}

	@Override
	public DataResult<List<JobTitles>> getAll() {
		return new SuccessDataResult<List<JobTitles>>
		(this.jobTitlesDao.findAll(), "Data listelendi");
	}

	@Override
	public DataResult<List<JobTitles>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC, "productName");
		return new SuccessDataResult<List<JobTitles>>
		(this.jobTitlesDao.findAll(sort), "Basarili") ;
	}

	@Override
	public DataResult<List<JobTitles>> getAll(int pageNo, int pageSize) {
     Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		
		return new SuccessDataResult<List<JobTitles>>
		(this.jobTitlesDao.findAll(pageable).getContent()) ;
	}






	@Override
	public Result add(JobTitles jobTitles) {
		this.jobTitlesDao.save(jobTitles);
		return new SuccessResult("abc");
	}






//	@Override
//	public DataResult<List<JobTitles>> getByJobTitlesIn(List<Integer> jobTitles) {
//		return new SuccessDataResult<List<JobTitles>>
//		(this.jobTitlesDao.getByCategoryIn(jobTitles), "Data listelendi");
//	}






//	@Override
//	public Result add1(JobTitles entity) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	

}
