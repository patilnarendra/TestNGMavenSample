package TestNGStudy.TestNGDataProvider;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Ignore;

public class ListenerImpl extends TestListenerAdapter{


public void onStart(ITestContext context) {
	System.out.println("On STart");
}

public void onFinish(ITestContext context) {
	System.out.println("On Finish");
	}

@Override
	public void onTestStart(ITestResult result) {
	System.out.println("On Test STart");
	}
}
