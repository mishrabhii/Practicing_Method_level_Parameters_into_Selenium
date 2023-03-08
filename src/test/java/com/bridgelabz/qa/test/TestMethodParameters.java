package com.bridgelabz.qa.test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;

public class TestMethodParameters extends BaseClass{
	
	@Test
	@Parameters({"phone_Number","Name"})
	public void Test(String phone_Number, String Name) throws InterruptedException {
		driver.get("https://bldev.bridgelabz.com/webinar");

		Thread.sleep(400);
		driver.findElement(By.id("deftphnumber")).sendKeys(phone_Number);
		Thread.sleep(400);
		driver.findElement(By.id("deftusername")).sendKeys(Name);
	}

}
