package com.testng.org;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
	@Test
	@Parameters({"username","password"})
	private void credential(@Optional("jaga")String username, String password) {
	System.out.println("Username ="+username+" Password ="+password);
	}

}
