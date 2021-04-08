package com.testng.org;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Sample {
	
	@Test(retryAnalyzer = MyRetryAnalyzer.class)
	private void test() {
	Assert.assertEquals("jgkjkjkl", "jagakavi");
	
		
		
		
		
		
		
		
		
	}

}
