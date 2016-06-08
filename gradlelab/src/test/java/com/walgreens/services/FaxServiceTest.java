package com.walgreens.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.walgreens.domain.Clinic;
import com.walgreens.domain.Store;

public class FaxServiceTest {
	
	private FaxService faxService = new FaxService();

	@Test
	public void faxNumberFromClinic() {
		// set up
		Clinic clinic = new Clinic();
		
		// run test
		String faxPhoneNumber = faxService.getFaxNumber(clinic);
		
		// verify result
		assertEquals("111-222-3333", faxPhoneNumber);
	}
	
	@Test
	public void faxNumberFromStore() {
		// set up
		Store store = new Store();
		
		// run test
		String faxPhoneNumber = faxService.getFaxNumber(store);
		
		// verify result
		assertEquals("777-888-9999", faxPhoneNumber);
	}

}
