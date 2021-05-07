
package elementos;

import org.openqa.selenium.By;

public class Elementos {
	public By Fabricante = By.id("make");
	public By Escolher = By.cssSelector("#make > option:nth-child(3)");
	public By Model = By.id("model");
	public By Option = By.cssSelector("#model > option:nth-child(2)");
	public By Cylinder = By.id("cylindercapacity");
	public By EngPerformace = By.id("engineperformance");
	public By DateFacture = By.id("dateofmanufacture");
	public By Number = By.id("numberofseats");
	public By NumberOfSeats = By.cssSelector("#numberofseats > option:nth-child(5)");
	public By Direcao = By.cssSelector("#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(1) > span");
	public By Number1 = By.id("numberofseatsmotorcycle");
	public By EscolherSerie1 = By.cssSelector("#numberofseatsmotorcycle > option:nth-child(3)");
	public By Combustivel = By.id("fuel");
	public By Combustivel1 = By.cssSelector("#fuel > option:nth-child(4)");
	public By CargaUtil = By.id("payload");
	public By Total = By.id("totalweight");
	public By PrecoTabela = By.id("listprice");
	public By NumberPlaca = By.id("licenseplatenumber");
	public By KmAnual = By.id("annualmileage");
	public By Proximo = By.id("nextenterinsurantdata");
	public By Nome = By.id("firstname");
	public By Sobrenome = By.id("lastname");
	public By Nascimento = By.id("birthdate");
	public By SexoM = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]");
	public By Endereco = By.id("streetaddress");
	public By Pais = By.id("country");
	public By SeuPais = By.cssSelector("#country > option:nth-child(7)");
	public By Cep = By.id("zipcode");
	public By Cidade = By.id("city");
	public By Ocupacao = By.id("occupation");
	public By EscolhaOcupacao = By.cssSelector("#occupation > option:nth-child(3)");
	public By Diversao = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p");
	public By Hobbie = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]");
	public By Site = By.id("website");
	public By Foto = By.id("picture");
	public By Open = By.id("id=\"open\"");
	public By Next = By.id("nextenterproductdata");
	public By DataInicio = By.id("startdate");
	public By R$Seguro = By.id("insurancesum");
	public By Valor = By.cssSelector("#insurancesum > option:nth-child(2)");
	public By Merito = By.id("meritrating");
	public By Merito1 = By.cssSelector("#meritrating > option:nth-child(5)");
	public By Danos = By.id("damageinsurance");
	public By Danos1 = By.xpath("//*[@id=\"damageinsurance\"]/option[4]");
	public By Product = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span");
	public By Cortesia = By.id("courtesycar");
	public By Cortesia1 = By.cssSelector("#courtesycar > option:nth-child(3)");
	public By ProxPag = By.id("nextselectpriceoption");
	public By Gold = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(2) > span");
	public By ProxPag1 = By.id("nextsendquote");
	public By Email = By.id("email");
	public By Fone = By.id("phone");
	public By Usuario = By.id("username");
	public By Senha = By.id("password");
	public By Confirma = By.id("confirmpassword");
	public By Enviar = By.id("sendemail");
	public By Mensagem = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2");

}
