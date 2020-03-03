package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Steps {
    public WebDriver driver;
    @Given("^Open the Firefox and launch the application$")
    public void open_the_Firefox_and_launch_the_application() throws Throwable {
        System.setProperty("webdriver.gecko.driver", "geckodriver");
        driver= new FirefoxDriver();
//        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4");
        System.out.println("This Step open the Firefox and launch the application.");
    }

//    @When("^Enter the Username and Password$")
//    public void enter_the_Username_and_Password() throws Throwable {
//        driver.findElement(By.name("uid")).sendKeys("username12");
//        driver.findElement(By.name("password")).sendKeys("password12");
//        System.out.println("This step enter the Username and Password on the login page.");
//    }

    @When("^Enter the Username \"(.*)\" and Password \"(.*)\"$")
    public void enter_the_Username_and_Password(String username,String password) throws Throwable
    {
        driver.findElement(By.name("uid")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
    }
    @And("I entered a String \"(.*)\" to be printed$")
    public void stringMessage(String text) throws Throwable
    {
        System.out.println(text);
    }

    @Then("^Reset the credential$")
    public void reset_the_credential() throws Throwable {
        driver.findElement(By.name("btnReset")).click();
        System.out.println("This step click on the Reset button");
    }

    @Then("^close the browser$")
    public void close_the_browser() throws Throwable {
        driver.quit();
    }
}
