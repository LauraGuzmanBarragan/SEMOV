@SEMOV
Feature: Login en plataforma SEMOV

  @login
  Scenario: Iniciar sesión en la plataforma
    Given que ingreso a la plataforma de SEMOV
    When ingreso el email y clave en el login
      | email                | clave     |
      | dummy_u5@testing.com | 123456789 |
    And ingreso el código de verificación "99999"



