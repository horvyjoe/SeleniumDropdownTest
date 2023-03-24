import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPage extends BasePage{
    public IndexPage(WebDriver driver){
        super(driver);
    }
    private final String URL = "https://demo.seleniumeasy.com/";

    private final By INPUTFORM = By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/a");
    private final By DROPDOWNLIST = By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[4]/a");

    public void navigateToDropdownPage(){
        driver.findElement(INPUTFORM).click();
        driver.findElement(DROPDOWNLIST).click();
    }

    public void loadIndexPage(){
        driver.navigate().to(URL);
    }
}
