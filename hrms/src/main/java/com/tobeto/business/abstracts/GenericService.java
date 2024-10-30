package com.tobeto.business.abstracts;

import java.util.List;

import com.tobeto.core.utilities.DataResult;
import com.tobeto.core.utilities.Result;
import com.tobeto.entities.concretes.JobTitles;

public interface GenericService<T> {
	DataResult<List<T>> getAll();
	
	
	Result add(T entity);
}
