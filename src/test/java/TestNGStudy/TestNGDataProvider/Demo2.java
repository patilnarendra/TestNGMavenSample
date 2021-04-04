package TestNGStudy.TestNGDataProvider;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Demo2 extends Base {
			
		Demo2()
		{
			System.out.println("In Demo2 constructor");
		}
		
		@Test(groups={"test1"})
		@Parameters({"name"})
		public void Disp1(String n)
		{
			System.out.println(Thread.currentThread().getId());
			System.out.println("In Demo2 Disp1 Method");
			System.out.println(n);
		}
		
		@Test(groups={"test2"})
		public void Disp2()
		{
			System.out.println(Thread.currentThread().getId());
			System.out.println("In Demo2 Disp2 Method");
		}

		@Test(groups={"test3"})
		public void Disp3()
		{
			System.out.println(Thread.currentThread().getId());
			System.out.println("In Demo3 Disp2 Method");
		}
		
		@Test(dataProvider="provider1")		
		public void Disp4(String n1,int n2)
		{
			System.out.println("In Demo4 Disp2 Method");
			System.out.println(n1 + " : "+ n2);
		}
		
		@Test(dataProvider="provider1")		
		public void Disp5(String n1,int n2)
		{
			System.out.println("In Demo4 Disp2 Method");
			System.out.println(n1 + " : "+ n2);
		}
	}

