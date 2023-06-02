@tag
Feature: Abertura de conta
  

  @tag1
  Scenario: Formulario de abertura de conta PF
    Given que acesse o banco inter "https://www.bancointer.com.br/"
    And selecione o botao abra sua conta
    When preencher o formulario
    And selecionar o botao do checkbox
    And selecionar o botao continuar 
    Then será exibido o texto falta pouco
