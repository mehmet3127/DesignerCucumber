@Wde_PozitifLoginTest
Feature: Wde_Login_Test

  Scenario: TC001_WdePozitiveTest

    Given Kullanici Wde sayfasina gider
    Then Kullanıcı Wde için gecerli username girer
    And Kullanıcı Wde için gecerli password girer
    And Kullanici Wde login buttonuna tıklar