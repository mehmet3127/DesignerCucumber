@kodGrubuSonuçKoduEkleme
Feature: Sonuç Kodu Ekleme

  @kodGrubuEkeleme
  Scenario Outline: TC001 Kodu Grubu Ekleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When kullanıcı ucmsadmin için geçerli username girer
    And kullanıcı ucmsadmin için geçerli password girer
    And kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And sonuş kodları sekmesine tıklar
    And kod grubu ekle ıkon a tıklar
    And grup adı "<grupAdı>" ekler
    And kaydet butonuna tıklar
    And onay butonuna tıklar
    Then sayfayı kapatır
    Examples:
      | grupAdı     |
      | otmasyon_01 |

  @sonuçKoduEkleme
  Scenario: TC002 Kapatıcı Sonuç Kodu Ekleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When kullanıcı ucmsadmin için geçerli username girer
    And kullanıcı ucmsadmin için geçerli password girer
    And kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And sonuş kodları sekmesine tıklar
    And Eklenen kod grubunun sonuç kodu ekle ikonuna tıklar
    And Aksiyon tipi combo suna tıklanır
    And acılan pencereden kaydı kapat sekmesine tıklar
    And başlık kısmına isim girer
    And Genel özellikler tabına geçer
    And Başarı durumu combosunda kriter dışını seçer
    And Müşteriye ulaşılma durumundan müşteriye ulaşılamadı seçer
    And Müşteri temas durumundan temas edilemedi seçer
      #Özellik ekleme ve CTI sonuç kodu seçimi yapılsın mı Melih Abi ye sorulsun
    And Kaydete tıklar








