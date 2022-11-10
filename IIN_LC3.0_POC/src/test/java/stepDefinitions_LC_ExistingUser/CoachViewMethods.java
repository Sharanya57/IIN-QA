package stepDefinitions_LC_ExistingUser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.core.BaseVariables;
import com.seleniumFuctions.SeleniumFunctions;

public class CoachViewMethods extends SeleniumFunctions {
	
	public void clickonlistofcoachingcircle() throws Exception
	{
		
		WebDriver driver = BaseVariables.getInstance().getWebdriver();
		List<WebElement> reviewYourCC = driver.findElements(By.xpath("//*[text()='Review your coaching circles']"));
		
		System.out.println(reviewYourCC.size());
		if (reviewYourCC.size() !=0) {
			System.out.println("Sneha");
		
		for(int rcc =0 ; rcc < reviewYourCC.size(); rcc++ ) 
		{
			List<WebElement> reviewYourCC1 = driver.findElements(By.xpath("//*[text()='Review your coaching circles']"));
			reviewYourCC1.get(rcc).click();
			Thread.sleep(10000);
			
			
			System.out.println( reviewYourCC1.get(rcc)+ " Elements found by TagName as input \n");
			Page("CoachView").clickElement("MyCoachingCirclestext");
			Thread.sleep(3000);
		}
			
}
	   
}

	private void Threadsleep(int i) {
		// TODO Auto-generated method stub
		
	}



		
		
	}
	


