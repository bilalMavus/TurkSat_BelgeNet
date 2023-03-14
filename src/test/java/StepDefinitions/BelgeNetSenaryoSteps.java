package StepDefinitions;

import Pages.BelgeNetSenaryoPage;
import Pages.Parent;
import Utilities.ParametersWebDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import static Utilities.ParametersWebDriver.getDriver;

public class BelgeNetSenaryoSteps {
    BelgeNetSenaryoPage bns = new BelgeNetSenaryoPage();

    @Given("BelgeNet Web Sitesine Git")
    public void belgenetWebSitesineGit() {
        getDriver().get("https://www.belgenet.com.tr/");
        ParametersWebDriver.getDriver().manage().window().maximize();
    }
    @When("Click The Demo Button And Enter The Username {string} And Password {string} Then Click The Login Button")
    public void clickTheDemoButtonAndEnterTheUsernameAndPasswordThenClickTheLoginButton(String kullaniciAdi, String parola) {
        bns.findAndClick("demoButton");
        bns.findAndSend("kullaniciAdi", kullaniciAdi);
        bns.findAndSend("parola", parola);
        bns.findAndClick("girisButton");
    }
    @And("Click On The Element")
    public void clickOnTheElement(DataTable value) {
        List<String> listElemanlar = value.asList(String.class);
        for (String strButtonName : listElemanlar) {
            bns.findAndClick(strButtonName);
        }
    }
    @And("Manual {int} Seconds Standby")
    public void manualSecondsStandby(int saniye){
        int sn = saniye * 1000;
        ParametersWebDriver.waits(sn);
    }
    @And("Enter Data in Text Box")
    public void enterDataInTextBox(DataTable deger) {
        List<List<String>> listElemanlar= deger.asLists(String.class);
        for (List<String> strings : listElemanlar)
            bns.findAndSend(strings.get(0), strings.get(1));
    }
    @And("Select Menu")
    public void selectMenu(DataTable deger) {
        List<List<String>> listElemanlar= deger.asLists(String.class);
        for (List<String> strings : listElemanlar)
            bns.selectElement(strings.get(0), strings.get(1));
    }
    @And("iframe Input")
    public void iframeInput(DataTable deger) {
        List<List<String>> listElemanlar= deger.asLists(String.class);
        for (List<String> strings : listElemanlar)
            bns.iframeInputElement(strings.get(0));
    }
    @And("iframe Exit")
    public void iframeExit() {
        bns.iframeExitContainElement();
    }
    @And("File attachment process")
    public void fileAttachmentProcess() throws AWTException {
        Robot robot = new Robot();
        StringSelection path= new StringSelection("C:\\Users\\Kuzey\\Desktop\\TurkSat.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path,null);
        ParametersWebDriver.waits(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        ParametersWebDriver.waits(1000);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    @And("ALT TAB")
    public void altTAB() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_TAB);
    }
    @And("Successful verification displayed")
    public void successfulVerificationDisplayed(DataTable value) {
        List<List<String>> listElemanlar= value.asLists(String.class);
        for (List<String> strings : listElemanlar)
            bns.findAndContainsText(strings.get(0), strings.get(1));
    }
}
