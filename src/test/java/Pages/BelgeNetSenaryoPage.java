package Pages;

import Utilities.ParametersWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BelgeNetSenaryoPage extends Parent{
    public BelgeNetSenaryoPage() { // Parametresiz Constructor
        PageFactory.initElements(ParametersWebDriver.getDriver(), this);
    }

    @FindBy(xpath = "//a[contains(text(),'Demo')]")
    private WebElement demoButton;
    @FindBy(xpath = "//input[contains(@id,'KullaniciAdi')]")
    private WebElement kullaniciAdi;
    @FindBy(id = "loginUSifre")
    private WebElement parola;
    @FindBy(xpath = "//span[text()='Giriş Yap']")
    private WebElement girisButton;
    @FindBy(xpath = "(//span[text()='GENEL MÜDÜRLÜK MAKAMI'])[2]")
    private WebElement gmmButton;
    @FindBy(xpath = "//span[text()='Evrak İşlemleri']")
    private WebElement evrakIslemButton;
    @FindBy(css = "[class='topMenuIcons evrakOlustur']")
    private WebElement evrakOlusturButton;
    @FindBy(xpath = "(//input[contains(@id,'geregiLov')])[1]")
    private WebElement geregiTextBox;
    @FindBy(xpath = "(//span[@class='lovItemDetail'])[5]")
    private WebElement birimTestDepClick;
    @FindBy(id = "yeniGidenEvrakForm:evrakBilgileriList:18:geregiLov:lovTreePanelKapat")
    private WebElement kapat;
    @FindBy(id = "yeniGidenEvrakForm:evrakBilgileriList:21:onayAkisiEkle")
    private WebElement addButton;
    @FindBy(id = "yeniGidenEvrakForm:evrakBilgileriList:21:akisAdimLov:LovSecilenTable:0:selectOneMenu")
    private WebElement arrowButton;
    @FindBy(id = "yeniGidenEvrakForm:evrakBilgileriList:21:akisAdimLov:LovSecilenTable:0:selectOneMenu")
    private WebElement select;
    @FindBy(xpath = "//*[text()='Kullan']")
    private WebElement kullanButton;
    @FindBy(id = "yeniGidenEvrakForm:evrakBilgileriList:1:konuKoduLov:LovText")
    private WebElement konuTextBox;
    @FindBy(css = "[class='expandCollapseLovItem ']")
    private WebElement konuKanunlarClick;
    @FindBy(css = "[id='yeniGidenEvrakForm:evrakBilgileriList:4:eklenecekKlasorlerLov:LovText']")
    private WebElement kaldirilacaklarTextBox;
    @FindBy(xpath= "//*[text()='[Üst Klasör] AA.000 | Genel']")
    private WebElement yKuruluEvrClick;
    @FindBy(css= "[class='ui-button-icon-left ui-icon ui-c editor']")
    private WebElement editorButton;
    @FindBy(xpath= "(//iframe)[3]")
    private WebElement iframe1;
    @FindBy(css= "[contenteditable='true']")
    private WebElement bigTabloText;
    @FindBy(css= "[class='ui-button-icon-left ui-icon ui-c kullaniciEkleri']")
    private WebElement ekleriButton;
    @FindBy(css= "[id='yeniGidenEvrakForm:evrakEkTabView:dosyaAciklama']")
    private WebElement ekMetniTextBox;
    @FindBy(css= "[id='yeniGidenEvrakForm:evrakEkTabView:fileUploadButtonA_label']")
    private WebElement dosyaEkleButton;
    @FindBy(css= "[class='ui-button-icon-left ui-icon ui-c imzala']")
    private WebElement imzalaButton;
    @FindBy(xpath= "(//*[@id='imzalaForm:imzalamaYontemiPanel']//td)[13]")
    private WebElement s_imzaClick;
    @FindBy(id= "imzalaForm:sayisalImzaConfirmDialogOpener")
    private WebElement imzalaButton2;
    @FindBy(xpath= "(//span[text()='Evet'])[5]")
    private WebElement evetButton;
    @FindBy(css= "[class='ui-widget-header ui-corner-all islemYaptiklarim-icon ui-menuitem-default ui-accordion-menu ui-menuitem-default']")
    private WebElement islemYaptiklarimClick;
    @FindBy(xpath= "(//span[text()='İmzaladıklarım'])[1]")
    private WebElement imzaladiklarimClick;
    @FindBy(xpath= "//span[text()='Tamam']")
    private WebElement tamamButton;
    @FindBy(xpath= "(//td[@class='ui-panelgrid-cell ui-inbox-satir3 ui-column-buttons-same-row']/div)[1]")
    private WebElement imzaladiklarimListClick;
    @FindBy(xpath= "(//iframe)[2]")
    private WebElement iframe2;
    @FindBy(xpath= "//*[text()='Merhaba bu bir test']")
    private WebElement imzaladiklarimVerify;
    @FindBy(xpath= "//span[text()='TEST DEPARTMENT']")
    private WebElement testDepartmanClick;
    @FindBy(xpath= "//h3[contains(text(),'Birim Evrakları')]")
    private WebElement birimEvraklariClick;
    @FindBy(xpath= "//span[contains(text(),'Teslim Alınmayı Bekleyenler')]")
    private WebElement teslimBekleyenClick;
    @FindBy(xpath= "(//td[@class='ui-panelgrid-cell ui-inbox-satir3 ui-column-buttons-same-row']/div)[1]")
    private WebElement bekleyenListClick;
    WebElement myElement;
    public void findAndClick(String strlement) {
        switch (strlement) {
            case "demoButton"               :myElement = demoButton;break;
            case "girisButton"              :myElement = girisButton;break;
            case "gmmButton"                :myElement = gmmButton;break;
            case "evrakIslemButton"         :myElement = evrakIslemButton;break;
            case "evrakOlusturButton"       :myElement = evrakOlusturButton;break;
            case "birimTestDepClick"        :myElement = birimTestDepClick;break;
            case "kapat"                    :myElement = kapat;break;
            case "addButton"                :myElement = addButton;break;
            case "arrowButton"              :myElement = arrowButton;break;
            case "kullanButton"             :myElement = kullanButton;break;
            case "konuKanunlarClick"        :myElement = konuKanunlarClick;break;
            case "yKuruluEvrClick"          :myElement = yKuruluEvrClick;break;
            case "kaldirilacaklarTextBox"   :myElement = kaldirilacaklarTextBox;break;
            case "editorButton"             :myElement = editorButton;break;
            case "ekleriButton"             :myElement = ekleriButton;break;
            case "dosyaEkleButton"          :myElement = dosyaEkleButton;break;
            case "imzalaButton"             :myElement = imzalaButton;break;
            case "s_imzaClick"              :myElement = s_imzaClick;break;
            case "imzalaButton2"            :myElement = imzalaButton2;break;
            case "evetButton"               :myElement = evetButton;break;
            case "islemYaptiklarimClick"    :myElement = islemYaptiklarimClick;break;
            case "imzaladiklarimClick"      :myElement = imzaladiklarimClick;break;
            case "tamamButton"              :myElement = tamamButton;break;
            case "imzaladiklarimListClick"  :myElement = imzaladiklarimListClick;break;
            case "testDepartmanClick"       :myElement = testDepartmanClick;break;
            case "birimEvraklariClick"      :myElement = birimEvraklariClick;break;
            case "teslimBekleyenClick"      :myElement = teslimBekleyenClick;break;
            case "bekleyenListClick"        :myElement = bekleyenListClick;break;
        }
        clickFunction(myElement);
    }
    public void findAndSend(String strlement, String value) {
        switch (strlement) {
            case "kullaniciAdi"              : myElement=kullaniciAdi;break;
            case "parola"                    : myElement=parola;break;
            case "geregiTextBox"             : myElement=geregiTextBox;break;
            case "konuTextBox"               : myElement=konuTextBox;break;
            case "kaldirilacaklarTextBox"    : myElement=kaldirilacaklarTextBox;break;
            case "bigTabloText"              : myElement=bigTabloText;break;
            case "ekMetniTextBox"            : myElement=ekMetniTextBox;break;

        }
        sendKeysFunction(myElement, value);
    }
    public void selectElement(String strlement,String value) {
        switch (strlement) {
            case "select"        : myElement = select;break;

        }
        selectContainElement(myElement, value);
    }
    public void iframeInputElement(String strlement) {
        switch (strlement) {
            case "iframe1"        : myElement = iframe1;break;
            case "iframe2"        : myElement = iframe2;break;

        }
        iframeInputContainElement(myElement);
    }
    public void findAndContainsText(String strlement, String text) {
        switch (strlement) {
              case "imzaladiklarimVerify"  : myElement = imzaladiklarimVerify;break;

        }
        verifyContainsTextFunction(myElement, text);
    }

}
