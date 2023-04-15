package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {
	
	
	@Before(order = 1)
	public void beforeHook1()
	{
		System.out.println("Before1 hook");
	}
	
	@Before(order = 2)
	public void beforeHook2()
	{
		System.out.println("Before2 hook");
	}
	
	
	@After(order = 1)
	public void afterHook1()
	{
		System.out.println("After1 hook");
	}
	
	@After(order = 2)
	public void afterHook2()
	{
		System.out.println("After2 hook");
	}

}
