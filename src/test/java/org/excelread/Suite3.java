package org.excelread;

import org.junit.Test;

import junit.framework.Assert;

public class Suite3 {
	@Test
	public void tc20() {
		System.out.println("Test21");

	}
    @Test
    public void tc21() {
    	System.out.println("Test22");
	}
    @Test
    public void tc23() {
    	String s="Class";
    	System.out.println("s");
    	Assert.assertEquals("s", "Class");
    	System.out.println("Assert class");
    	
	}
    @Test
    public void tc24() {
    	System.out.println("Test24");
	}
    @Test
    public void tc22() {
    	System.out.println("Test25");
}
}