package com.vindhuja.Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridPart {

	@Test
	public void chromeTest() throws MalformedURLException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver wd = new RemoteWebDriver(new URL("http://192.168.2.11:4444/"), options);
		wd.get("https://stackoverflow.com/");
		System.out.println(wd.getCurrentUrl());
		sleep();
		wd.quit();

	}

	@Test
	public void fireFoxTest() throws MalformedURLException {
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("-private");
		WebDriver wd = new RemoteWebDriver(new URL("http://192.168.2.11:4444/"), options);
		wd.get("https://demoqa.com/");
		System.out.println(wd.getTitle());
		sleep();
		wd.quit();

	}

	@Test
	public void edgeTest() throws MalformedURLException {
		EdgeOptions options = new EdgeOptions();
		options.setCapability("InPrivate", true);
		WebDriver wd = new RemoteWebDriver(new URL("http://192.168.2.11:4444/"), options);
		wd.get("https://bookoutlet.ca/products/9781635577921B/a-day-of-fallen-night-the-roots-of-chaos-bk-2");
		System.out.println(wd.getTitle());
		sleep();
		wd.quit();

	}

	public void garbageTest() {
		Assert.assertEquals(true, true);
	}

	public void sleep() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void falseTest() {
		Assert.assertTrue(true);
	}

	public void dummyTest() {
		Assert.assertEquals(false, true);
	}
}
