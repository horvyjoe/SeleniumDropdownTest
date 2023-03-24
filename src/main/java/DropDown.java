import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends BasePage {


    public DropDown(WebDriver driver) {
        super(driver);
    }

    private final By DROPDOWN = By.id("select-demo");

    public void selectDay(String day){
        Select drpDay = new Select(driver.findElement(DROPDOWN));
        drpDay.selectByVisibleText(day);
    }

    private final By DAY = By.xpath("//p[@class=\"selected-value\"]");
    public String returnDay(){
        return driver.findElement(DAY).getText();
    }

}
