package org.excelread;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit {
	@BeforeClass
	public static void tc0() {
		System.out.println("Before Class");	
	}
	@AfterClass
	public static void tc1() {
		System.out.println("After Class");
	}
	@Before
	public void tc2() {
		System.out.println("Before");
	}
	@After
	public void tc3() {
		System.out.println("After");
	}
	@Test
	public void tc4() {
		System.out.println("Test");

	}

}
