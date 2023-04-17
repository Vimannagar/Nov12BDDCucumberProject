package taghooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TagHooks {
	
	@Before("@sanity")
	public void beforeHook()
	{
		System.out.println("Before hook for Sanity tag");
	}
	
	
	@After("@functional")
	public void afterHook()
	{
		System.out.println("After hook for Functional tag");
	}

}
