#Author: rezendefrancav@gmail.com


Feature: Preencher Formulario
  Eu como usuario quero preencher o formulario


  
  Scenario: Enviar formulario preenchido
    Given que eu acesse o site "http://sampleapp.tricentis.com/101/app.php"
    When preencher todos os dados do formulario
    Then valido formulario enviado com sucesso!! 

