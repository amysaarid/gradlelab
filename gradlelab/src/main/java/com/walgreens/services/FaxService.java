package com.walgreens.services;

import com.walgreens.interfaces.FaxInterface;

public class FaxService {
	
	
	public String getFaxNumber(FaxInterface faxData) {
		
		// get the fax phone number from the interface
		return faxData.getFaxNumber();
		
	}

}
