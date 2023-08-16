@UcmsLoginTest
Feature: Ucms_Admin_Test

  Scenario: TC001_UcmsAdminLoginTest

    Given Kullanıcı ucmsadmin sayfasına gider
    When kullanıcı ucmsadmin için geçerli username girer
    And kullanıcı ucmsadmin için geçerli password girer
    And kullanıcı giriş butonuna tıklar