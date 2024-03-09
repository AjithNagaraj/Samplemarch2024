package withoutmaven;

import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish N\\eclipse-workspace\\withoutmaven\\driver\\chromedriver.exe");
		
		//ChromeOptions opt=new ChromeOptions();
		//opt.setBinary("\"C:\\Users\\Sathish N\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe\"");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("www.google.com");
		
	}

}
