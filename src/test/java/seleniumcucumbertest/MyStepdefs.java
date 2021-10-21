package seleniumcucumbertest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MyStepdefs {

    WebDriver driver;

    @Given("the song is already in the playlist")
    public void theSongIsAlreadyInThePlaylist() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("");
        Thread.sleep(300);
        driver.manage().window().maximize();

    }

    @When("when i search the song title")
    public void whenISearchTheSongTitle() throws InterruptedException {
        Thread.sleep(300);
    }

    @Then("the song is displayed")
    public void theSongIsDisplayed() {
    }
}
