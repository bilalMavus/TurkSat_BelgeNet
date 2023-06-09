package StepDefinitions;

import Utilities.ParametersWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void before() {
        System.out.println("Senaryo başladı");
    }
    @After
    public void after(Scenario senaryo) {
        System.out.println("Senaryo bitti");

        if (senaryo.isFailed())
        {
            final byte[] byteHali = ((TakesScreenshot) ParametersWebDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
            senaryo.attach(byteHali, "image/png", "screenshot name");
        }
        ParametersWebDriver.quitDriver();
    }
}
