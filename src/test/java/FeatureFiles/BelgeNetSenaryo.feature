#https://www.belgenet.com.tr/ linkinden demo seçimi ile ilerleyip Belgenet uygulamasında,
#tek imzacılı resmi evrakın oluşturulup imzalanması senaryosu
#
#-Kullanıcı Adı: botçu & Password:spider ile login ol
#-Soldan “GENEL MÜDÜRLÜK” birimini tıkla
#-Üst menü > evrak oluştur menüsünü aç
#-Gereği alanından “TEST DEPARTMENT” birimini seç
#-Onay akışı alanından kendi işlem yapan kullanıcıyı imzacı olarak seç
#-Editör ve bilgilerinde Zorunlu alanları doldur
#-Ekler tabından dosya ekle
#-Sağ üst köşede imzala butonunu tıkla
#-gelen pop upta s-imza seç, imzala
#-Sol menü > İşlem Yaptıklarım > İmzaladıklarım listesine evrakın düştüğünü gör
#-soldan “TEST DEPARTMENT” birimini tıkla
#-Sol menü > Birim Evrakları > Teslim alınmayı bekleyenler listesine evrakın düştüğünü gör

Feature: BelgeNet Module Functionality

  Background:
    Given BelgeNet Web Sitesine Git
    When Click The Demo Button And Enter The Username "botcu" And Password "spider" Then Click The Login Button
  @UITest
  Scenario: Belgenet uygulamasında, tek imzacılı resmi evrakın oluşturulup imzalanması
    And Manual 3 Seconds Standby
    Then Click On The Element
      | gmmButton |
    And Manual 3 Seconds Standby
    And Click On The Element
      | evrakIslemButton |
    And Manual 2 Seconds Standby
    And Click On The Element
      | evrakOlusturButton |
    And Manual 3 Seconds Standby
    And Enter Data in Text Box
      | geregiTextBox | TEST DEPARTMENT |
    And Manual 2 Seconds Standby
    And Click On The Element
      | birimTestDepClick |
    And Manual 2 Seconds Standby
    And Click On The Element
      | kapat       |
      | addButton   |
      | arrowButton |
    And Select Menu
      | select | İmzalama |
    And Click On The Element
      | kullanButton |
    And Enter Data in Text Box
      | konuTextBox | Kanunlar |
    And  Click On The Element
      | konuKanunlarClick |
    And Manual 2 Seconds Standby
    And Enter Data in Text Box
      | kaldirilacaklarTextBox | YÖNETİM KURULU EVRAKLARI |
    And Click On The Element
      | yKuruluEvrClick |
      | editorButton    |
    And iframe Input
      | iframe1 |
    And Manual 2 Seconds Standby
    And Enter Data in Text Box
      | bigTabloText | Merhaba bu bir test |
    And iframe Exit
    And Manual 2 Seconds Standby
    And Click On The Element
      | ekleriButton |
    And Enter Data in Text Box
      | ekMetniTextBox | Merhaba buradasın, dosya ekleyebilirsin |
    And Click On The Element
      | dosyaEkleButton |
    And File attachment process
    And Manual 3 Seconds Standby
    And Click On The Element
      | imzalaButton |
    And Manual 2 Seconds Standby
    And Click On The Element
      | s_imzaClick |
    And Manual 2 Seconds Standby
    And Click On The Element
      | imzalaButton2 |
    And Manual 2 Seconds Standby
    And ALT TAB
    And Manual 2 Seconds Standby
    And Click On The Element
      | evetButton |
    And Manual 2 Seconds Standby
  @UITest
  Scenario: Oluşturulan Evrakların Doğruluğu
#    Then Click On The Element
#      | tamamButton |
    And Manual 2 Seconds Standby
    Then Click On The Element
      | gmmButton |
    And Manual 2 Seconds Standby
    And Click On The Element
      | islemYaptiklarimClick |
    And Manual 2 Seconds Standby
    And Click On The Element
      | imzaladiklarimClick     |
      | imzaladiklarimListClick |
    And iframe Input
      | iframe2 |
    And Manual 2 Seconds Standby
    And Successful verification displayed
      | imzaladiklarimVerify | Merhaba bu bir test |
    And iframe Exit
    And Manual 2 Seconds Standby
    And Click On The Element
      | testDepartmanClick |
    And Manual 3 Seconds Standby
    Then Click On The Element
      | tamamButton |
    And Manual 3 Seconds Standby
    Then Click On The Element
      | birimEvraklariClick |
      | teslimBekleyenClick |
    And Manual 3 Seconds Standby
    Then Click On The Element
      | bekleyenListClick |
    And Manual 3 Seconds Standby
    And iframe Input
      | iframe2 |
    And Manual 2 Seconds Standby
    And Successful verification displayed
      | imzaladiklarimVerify | Merhaba bu bir test |
    And iframe Exit
    And Manual 2 Seconds Standby
