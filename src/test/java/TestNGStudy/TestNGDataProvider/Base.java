package TestNGStudy.TestNGDataProvider;

import java.lang.reflect.Method;

import org.testng.annotations.*;
public class Base {

	@BeforeSuite(alwaysRun=true)
	public void BeforeSuite()
	{
		System.out.println("Base Before Suite");
	}

	@BeforeTest(alwaysRun=true)
	public void BeforeTest()
	{
		System.out.println("Base Before Test");
	}

	@BeforeClass(alwaysRun=true)
	public void BeforeClass()
	{
		System.out.println("Base Before Class");
	}

	@BeforeMethod(alwaysRun=true)
	public void BeforeMethod()
	{
		System.out.println("Base Before Method");
	}

	@BeforeGroups(groups={"test1"}, alwaysRun=true)
	public void BeforeGroup()
	{
		System.out.println("Base Before Group");
	}


	@DataProvider(name = "provider1")
	public Object[][] createData1(Method m) {
		System.out.println("Method Name:"+m.getName());
		return new Object[][] {  { "Cedric",new Integer(40) },
			{ "Anne",new Integer(50)},
		};
	}

}
