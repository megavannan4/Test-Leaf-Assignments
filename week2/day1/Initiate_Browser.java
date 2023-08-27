package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Initiate_Browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.facebook.com/login");
		driver.manage().window().maximize();
		
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
