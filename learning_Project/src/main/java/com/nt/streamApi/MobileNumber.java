package com.nt.streamApi;

import lombok.Data;

@Data
public class MobileNumber {

	private String number;

	public MobileNumber(String number) {
		this.number = number;
	}

}
