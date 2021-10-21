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
        driver.get("http://ec2-35-178-110-185.eu-west-2.compute.amazonaws.com:8080");
        Thread.sleep(300);
        driver.manage().window().maximize();

    }

    @When("i search the song title")
    public void ISearchTheSongTitle() throws InterruptedException {
        Thread.sleep(300);
        driver.findElement(By.id("songTitle")).sendKeys("Happy");
        Thread.sleep(300);
        driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();

    }

    @Then("the song is displayed")
    public void theSongIsDisplayed() {
        assertEquals(true,driver.findElement(By.xpath("//body[contains(text(),'Happy')]")).isDisplayed(), "Song is not displayed");
    }

    @Given("the song is not in the playlist")
    public void theSongIsNotInThePlaylist() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://ec2-35-178-110-185.eu-west-2.compute.amazonaws.com:8080");
        Thread.sleep(300);
        driver.manage().window().maximize();
    }

    @When("the song title is searched")
    public void theSongTitleIsSearched() throws InterruptedException {
        Thread.sleep(300);
        driver.findElement(By.id("songTitle")).sendKeys("About a week ago");
        Thread.sleep(300);
        driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();

    }

    @Then("song is not displayed")
    public void songIsNotDisplayed() {
        assertEquals(true,driver.findElement(By.xpath("//body[contains(text(),'empty')]")).isDisplayed(), "Song is displayed");
    }


    @Given("i have a song")
    public void iHaveASong() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://ec2-35-178-110-185.eu-west-2.compute.amazonaws.com:8080");
        Thread.sleep(300);
        driver.manage().window().maximize();

    }

    @When("i add the song details")
    public void iAddTheSongDetails() throws InterruptedException {
        Thread.sleep(300);
        driver.findElement(By.id("songTitleAdd")).sendKeys("DotA");
        Thread.sleep(300);
        driver.findElement(By.id("songArtist")).sendKeys("Basshunter");
        Thread.sleep(300);
        driver.findElement(By.id("songGenre")).sendKeys("bad");
        Thread.sleep(300);
        driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();


    }

    @Then("the song is added")
    public void theSongIsAdded() {
        assertEquals(true,driver.findElement(By.xpath("//body[contains(text(),'DotA')]")).isDisplayed(), "Song is not displayed");


    }
}
