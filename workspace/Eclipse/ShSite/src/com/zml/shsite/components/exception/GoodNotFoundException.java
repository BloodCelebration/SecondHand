package com.zml.shsite.components.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No such Good")  // 404
public class GoodNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2987504628617469551L;

}
