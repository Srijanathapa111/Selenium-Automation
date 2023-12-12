import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {

	public static void main(String[] args) {
		
         ChromeDriver driver = new ChromeDriver();
         driver.get("https://practicetestautomation.com/practice-test-login/");
         
         driver.manage().window().maximize();
         
         WebElement usernameField = driver.findElement(By.id("username"));
         usernameField.sendKeys("student");
         
         WebElement passwordField = driver.findElement(By.id("password")); 
         passwordField.sendKeys("Password123");
         
         WebElement submitButton = driver.findElement(By.id("submit"));
         submitButton.click();
         
         String expectedURLSubstring = "practicetestautomation.com/logged-in-successfully/";
         if (driver.getCurrentUrl().contains(expectedURLSubstring)) {
             System.out.println("URL verification passed.");
         } else {
             System.out.println("URL verification failed.");
         }
         
         WebElement pageBody = driver.findElement(By.tagName("body"));
         String bodyText = pageBody.getText();
         boolean isTextPresent = bodyText.contains("Congratulations") || bodyText.contains("successfully logged in");
         if (isTextPresent) {
             System.out.println("Page contains Congratulations or Successfully logged in.");
         } else {
             System.out.println("Page contains congratulation verification failed.");
         }
         
         WebElement logoutButton = driver.findElement(By.id("logout"));
         boolean isLogoutButtonDisplayed = logoutButton.isDisplayed();

         if (isLogoutButtonDisplayed) {
             System.out.println("Logout button verification passed. Logout button is displayed.");
         } else {
             System.out.println("Logout button verification failed. Logout button is not displayed.");
         }

        
         driver.quit();    
	}	

}
