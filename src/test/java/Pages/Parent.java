package Pages;

import Utilities.ParametersWebDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utilities.ParametersWebDriver.getDriver;
import static org.testng.Assert.assertTrue;

public class Parent {
    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));

    public void sendKeysFunction(WebElement element, String value) {
        waitUntilVisible(element);
        scrollToelement(element);
        element.clear();
        element.sendKeys(value);
    }
    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        scrollToelement(element);
        element.click();
    }
    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void scrollToelement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void verifyContainsTextFunction(WebElement element, String value) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
        assertTrue(element.getText().contains(value), "The text you searched could'nt be find");
        new Actions(getDriver()).sendKeys(Keys.ESCAPE).perform();
    }
    public void selectContainElement(WebElement element, String value) {
        waitUntilVisible(element);
        Select ddMenu = new Select(element);
        ddMenu.selectByVisibleText(value);
    }
    public void iframeInputContainElement(WebElement element) {
        waitUntilVisible(element);
        getDriver().switchTo().frame(element);
    }
    public void iframeExitContainElement() {
        getDriver().switchTo().parentFrame();
    }
}
