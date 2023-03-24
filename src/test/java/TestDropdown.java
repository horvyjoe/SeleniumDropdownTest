import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class TestDropdown {
    WebDriver driver;

    @BeforeEach
    public void init(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void dropdownTest(){
        String expectedResult = "Thursday";

        IndexPage indexPage = new IndexPage(driver);
        indexPage.loadIndexPage();
        indexPage.navigateToDropdownPage();

        DropDown dropDown = new DropDown(driver);
        dropDown.selectDay(expectedResult);

        Assertions.assertTrue(dropDown.returnDay().endsWith(expectedResult));


    }

}
