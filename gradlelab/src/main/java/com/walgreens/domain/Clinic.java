package com.walgreens.domain;

import com.walgreens.interfaces.FaxInterface;

public class Clinic implements FaxInterface {
	
	public String getFaxNumber() {
		return "333-444-5555";
	}

}
