package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

abstract public class BasePage {
    protected WebDriver driver;

public BasePage(WebDriver driver){
    PageFactory.initElements(driver,this);
    this.driver = driver;
    driver.get("https://seleniumeasy.com/test/basic-checkbox-demo.html");
}
}
