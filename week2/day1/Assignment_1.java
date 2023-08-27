package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Browser Initiation:
		ChromeDriver driver = new ChromeDriver();
		
		//Loading URL:
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		//Enter Username:
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Enter Password:
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Login the application:
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Clicking on CRM/SFA link:
		driver.findElement(By.id("button")).click();
		
		//Accessing Leads menu:
		driver.findElement(By.linkText("Leads")).click();
		
		//Navigating to Create Lead page:
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Assigning Company name: 
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Mitrophonomia");
		
		//Assigning First name:
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Megavannan");
		
		//Assigning Last name:
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		
		//Assigning Local name:
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vinu");
		
		//Assigning Department name:
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		
		//Assigning Decription :
		driver.findElement(By.name("description")).sendKeys("The goal is to locate this description field and enter this description");
		
		//Assigning Email:
		driver.findElement(By.name("primaryEmail")).sendKeys("megavannan@yopmail.com");
		
		//Selecting the state:
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select stateclick = new Select(state);
		stateclick.selectByVisibleText("New York");
		
		//Submitting application:
		driver.findElement(By.name("submitButton")).click();
		
		//Acquiring page name:
		String pagename = driver.getTitle();
		System.out.println("The page name is : "+pagename);
		
	}

}
