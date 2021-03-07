package generic;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Webdriver_generic
{
	public void get_the_title(WebDriver driver)
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	public void get_the_url(WebDriver driver)
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	public void get_the_pagesource(WebDriver driver)
	{
		String src = driver.getPageSource();
		System.out.println(src);
	}
	public void get_windowhandle(WebDriver driver)
	{
		String wh = driver.getWindowHandle();
		System.out.println(wh);
	}public void get_windowhandles(WebDriver driver)
	{
		Set<String> whs = driver.getWindowHandles();
		System.out.println(whs);
		
	}
	

}
