package com.dpl.cart.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {
	private static final long serialVersionUID = -1348534216280537971L;
	private int errorCode;
	private String errorMessage;
	private String errorCause;
	private HttpStatus httpStatus;

	public NotFoundException(ErrorCodes errorCodes) {
		super(errorCodes.getErrorCode());
		this.errorMessage = errorCodes.getErrorCode();
		this.httpStatus = errorCodes.getHttpStatus();
		this.errorCode = errorCodes.getHttpStatus().value();
	}

}
