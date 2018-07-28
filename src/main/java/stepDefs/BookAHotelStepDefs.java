package stepDefs;

import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;


import static org.openqa.selenium.ie.InternetExplorerDriver.*;

public class BookAHotelStepDefs {
    WebDriver driver;
    InternetExplorerOptions ieOptions = new InternetExplorerOptions();


    @Given("^user has open IE browser$")
    public void user_has_open_IE_browser() {
        System.setProperty("webdriver.ie.driver", "/Users/angelamukherjee/Desktop/WebDriver/IEDriverServer.exe");
        ieOptions.setCapability(INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS);
        ieOptions.setCapability(ENABLE_ELEMENT_CACHE_CLEANUP);
        driver = new InternetExplorerDriver(ieOptions);
    }

    @Given("^user has navigated to orbitz\\.com$")
    public void user_has_navigated_to_orbitz_com() {
        driver.get("https://www.orbitz.com");
    }

    @Given("^user has selected departure \"([^\"]*)\"$")
    public void user_has_selected_departure(String departureCity) throws InterruptedException {
        WebElement departureCityElement = driver.findElement(By.id("package-origin-hp-package"));
        departureCityElement.sendKeys(departureCity);
        Thread.sleep(300);
        departureCityElement.sendKeys(Keys.TAB);
        Thread.sleep(300);

    }

    @Given("^user has selected arrival \"([^\"]*)\"$")
    public void user_has_selected_arrival(String arrivalCity) throws InterruptedException {
        WebElement arrivalCityElement = driver.findElement(By.id("package-origin-hp-package"));
        arrivalCityElement.sendKeys(arrivalCity);
        Thread.sleep(300);
        arrivalCityElement.sendKeys(Keys.TAB);
        Thread.sleep(300);
    }
}
