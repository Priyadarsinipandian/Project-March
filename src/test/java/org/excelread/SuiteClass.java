package org.excelread;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Suite1.class,Suite2.class,Suite3.class})
public class SuiteClass {
	public static void main(String[] args) {
	Result r = JUnitCore.runClasses(SuiteClass.class);
	int f=r.getFailureCount();
	System.out.println("Failure count:"+f);
	int ii=r.getIgnoreCount();
	System.out.println("Ignore count:"+ii);
	int rr=r.getRunCount();
	System.out.println("Run Count:"+rr);
	Long rt=r.getRunTime();
	System.out.println("Run time:"+rt);
	List<Failure>failures = r.getFailures();
	for(Failure ff:failures) {
	System.out.println(ff.toString());
	}
	}
}
		
	


