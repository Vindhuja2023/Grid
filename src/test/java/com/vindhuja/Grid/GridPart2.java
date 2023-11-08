package com.vindhuja.Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GridPart2 {

	public ThreadLocal<WebDriver> wd = new ThreadLocal<>();

	@BeforeMethod
	public void setUp() throws MalformedURLException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("headless");
		wd.set(new RemoteWebDriver(new URL("http://192.168.2.11:4444"), options));
	}

	@Test
	public void chromeTest() {

		wd.get().get("https://demoqa.com/");
		System.out.println(wd.get().getCurrentUrl());
		sleep();

	}

	@Test
	public void fireFoxTest() {

	
		wd.get().get("https://stackoverflow.com/");
		System.out.println(wd.get().getTitle());
		sleep();

	}

	@Test
	public void edgeTest() {

		wd.get().get("https://demoqa.com/");
		System.out.println(wd.get().getTitle());
		sleep();

	}

	public void sleep() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void tearDown() {
		wd.get().quit();

	}
}
