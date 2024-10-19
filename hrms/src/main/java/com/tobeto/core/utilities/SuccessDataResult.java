package com.tobeto.core.utilities;

public class SuccessDataResult<T> extends DataResult<T> {

	public SuccessDataResult(T data, String success) {
		super(data, true, success);
		// TODO Auto-generated constructor stub
	}
	
	public SuccessDataResult(T data) {
		super(data, true);
	}

	public SuccessDataResult(String message) {
		super(null, true, message);
	}

	public SuccessDataResult() {
		super(null, true);
	}

}
