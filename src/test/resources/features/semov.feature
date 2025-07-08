@prorrogaPermisos
Feature: Gestión de trámites de Prorroga de Permisos en plataforma SEMOV

  @iniciarTramiteProrrogaPermisos
  Scenario: Iniciar sesión en la plataforma
    Given que ingreso a la plataforma de SEMOV
    When ingreso el email y clave en el login
      | email                | clave     |
      | dummy_u5@testing.com | 123456789 |
    And ingreso el código de verificación "99999"
    And se dirige a Tramites de Prorroga de Permisos

  @pagoTramites
  Scenario: Acceder a link de pago
    Given que ingreso a la plataforma de pagos


  @aprobarTramiteProrrogaPermisos
  Scenario: Iniciar sesión en la plataforma
    Given que ingreso a la plataforma de SEMOV
    When ingreso el email y clave en el login
    #  | email                    | clave     |
    #  | dummy_u35@testing.com.mx | 123456789 |
    #And ingreso el código de verificación "99999"
    #And se reasigna la solicitud
    #When ingreso el email y clave en el login
      | email                    | clave     |
      | dummy_u33@testing.com.mx | 123456789 |
    And ingreso el código de verificación "99999"
    And se dirige a revisar tramite
    And realiza la aprobacion de documentos
