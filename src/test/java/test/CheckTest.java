package test;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.Checkbox;

public class CheckTest extends BaseTest {


    @Test
    public void TestCheckBox (){
        String Message = new Checkbox(driver).setSingle();

        Assertions.assertThat(Message).isEqualTo("Success - Check box is checked");

    }

}
