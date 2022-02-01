package com.base;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class BrokenLing {
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace1\\Adda\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	 List<WebElement> elements = driver.findElements(By.tagName("a"));
	 int size = elements.size();
	 System.out.println(size);
	int brokenCount=0;
	 
	 for(int i=0;i<elements.size();i++) {
	 WebElement link = elements.get(i);
	 String attribute = link.getAttribute("href");
	 URL url =new URL (attribute);
	 URLConnection connection =url.openConnection();
	 
	 HttpsURLConnection urlConnection = (HttpsURLConnection) connection;
	 int responseCode = urlConnection.getResponseCode();
	 if(responseCode!=200) {
		 System.out.println(attribute);
		 brokenCount++;
	 }
	 }
	 System.out.println("Broken link count;"+brokenCount);
	 
	 
	 
	
	
		
		
		
		
		
		
	}

	}
