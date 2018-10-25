package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkbox extends BasePage {
    public Checkbox(WebDriver driver) {
        super(driver);
    }

  @FindBy(id="isAgeSelected")
    private WebElement single;

    @FindBy(css = "#txtAge")
    private WebElement succes;


    public String setSingle()  {
        this.single.click();
        return this.succes.getText();

    }


}
