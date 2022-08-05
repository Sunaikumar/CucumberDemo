package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Cucumber_Project.Utility_Files;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".\\Feature\\Shopping.feature",
		glue = "com.step.Deviation",
		monochrome = true,
		
		plugin = {
				
				"html:Reports/index.html",
				"json:jsons/jquery.json",
				//"pretty"
		}
		
		)
		
	//dryRun = false,
		//publish = true
		

public class Shopping_Runner{

	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() {
		driver=Utility_Files.get_Browser("chrome");
			
	}
	
	@AfterClass
	public static void tear_Down() {
		//driver.close();
	}
	
}
