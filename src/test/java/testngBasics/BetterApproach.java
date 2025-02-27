package testngBasics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BetterApproach {

    // With TestNg first we have to do is get rid of main method
    // TestNG provides us ability to turn any method in runnable test
    // When we create methods use either: camelCase or snake_case
    // To make a test case runnable we need to provide annotation "@Test"
    @Test
    public void verifyLogoIsDisplayed() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        Thread.sleep(5000);

        // Verify that logo is displayed

        WebElement logo = driver.findElement(By.cssSelector("img[alt=Google]"));
        boolean isLogoDisplayed = logo.isDisplayed();

        if(isLogoDisplayed){
            System.out.println("LOGO Verification: PASSED");
        } else {
            System.out.println("LOGO Verification: FAILED");
        }
        driver.quit();
    }



}
