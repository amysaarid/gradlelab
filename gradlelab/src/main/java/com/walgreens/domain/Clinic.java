package com.walgreens.domain;

import com.walgreens.interfaces.FaxInterface;

public class Clinic implements FaxInterface {
	
	public String getFaxNumber() {
		return "111-222-3333";
	}

}
