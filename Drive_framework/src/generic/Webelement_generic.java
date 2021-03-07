package generic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class Webelement_generic
{
	public void get_the_text(WebElement ele)
	{
		String text = ele.getText();
		System.out.println(text);
	}
	public void get_the_Attribut(WebElement ele,String an)
	{
		String av = ele.getAttribute(an);
		System.out.println(av);
	}
	public void get_the_css(WebElement ele,String cs)
	{
		String css = ele.getCssValue(cs);
		System.out.println(css);
		
	}
	public void get_the_tag(WebElement ele)
	{
		String tag = ele.getTagName();
		System.out.println(tag);
	}
	public void get_the_location(WebElement ele)
	{
		 Point loc = ele.getLocation();
		System.out.println(loc);
	}
	public void get_the_size(WebElement ele)
	{
		Dimension size = ele.getSize();
		System.out.println(size);
	
	}

}
