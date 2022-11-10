package stepDefinitions_LC_ExistingUser;

 import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.core.BaseVariables;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario; 
 
public class AfterActions extends BaseVariables {
  @AfterStep
	public static void TakeScreenshot(Scenario scenario) {

	   System.out.println("After run");
	 	WebDriver driver = BaseVariables.getInstance().getWebdriver();
		//System.out.println(scenario.isFailed());
		
		//if (scenario.isFailed()) {
		 
			byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		 
			     String name = scenario.getName();
			      
				scenario.attach(screenshotBytes,"image/png",name);
		 //  }
 		
				 
		
	} 
  /*@After
  public void quit()
  {
	 	WebDriver driver = BaseVariables.getInstance().getWebdriver();
	 	driver.quit();
	 	setWebdriverNull(driver);
	 	
  }	*/
}
