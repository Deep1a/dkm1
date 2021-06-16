package com.bjs.opensource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpensourceLoginDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Deepak\\eclipse-workspace\\KeyworddDivenFramework\\src\\com\\bjs\\utilities\\Keyworddriven.properties");
		Properties p=new Properties();
		p.load(fis);
		String username1=p.getProperty("username");
		String password1=p.getProperty("password");
		String LogIn1=p.getProperty("LogIn");
		String comment1=p.getProperty("comment");
		System.out.println(username1);
		System.out.println(password1);
		System.out.println(LogIn1);
		System.out.println(comment1);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		driver.findElement(By.id(username1)).sendKeys("opensourcecms");
		driver.findElement(By.id(password1)).sendKeys("opensourcecms");
		driver.findElement(By.id(LogIn1)).click();
		driver.findElement(By.xpath(comment1)).click();
		System.out.println("deepak");

	}

}
