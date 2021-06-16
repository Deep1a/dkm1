package com.bjs.ecom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcomLoginDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Deepak\\eclipse-workspace\\DataDrivenFreamwork\\src\\com\\bjs\\utilites\\DataDrivenFreamwork.properties");
		Properties p = new Properties();
		p.load(fis);
		String urldata=p.getProperty("url");
		String usernamedata=p.getProperty("username");
		String passworddata=p.getProperty("password");
		System.out.println(urldata);
		System.out.println(usernamedata);
		System.out.println(passworddata);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(urldata);
		driver.findElement(By.linkText("sign in")).click();
		driver.findElement(By.id("email")).sendKeys(usernamedata);
		driver.findElement(By.id("passwd")).sendKeys(passworddata);
		driver.findElement(By.id("SubmitLogin")).click();
		driver.findElement(By.linkText("sign out")).click();
		

	}

}
