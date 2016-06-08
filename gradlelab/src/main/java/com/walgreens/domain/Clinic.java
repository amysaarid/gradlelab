package com.walgreens.domain;

import com.walgreens.interfaces.FaxInterface;

public class Clinic implements FaxInterface {
	
	public String getFaxNumber() {
		return "777-888-9999";
	}

}
