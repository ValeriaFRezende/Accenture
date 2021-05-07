package tests;

import org.openqa.selenium.By;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();

	@Given("que eu acesse o site {string}")
	public void que_eu_acesse_o_site(String appUrl) throws Throwable {

		metodo.abrirNavegador(appUrl);
	}

	@When("preencher todos os dados do formulario")
	public void preencher_todos_os_dados_do_formulario()throws Throwable {

		metodo.esperarElemento(elemento.Fabricante);
		metodo.clicar(elemento.Fabricante);
		metodo.clicar(elemento.Escolher);
		metodo.clicar(elemento.Model);
		metodo.clicar(elemento.Option);
		metodo.preencher(elemento.Cylinder, "1600");
		metodo.preencher(elemento.EngPerformace, "180");
		metodo.preencher(elemento.DateFacture, "05/06/2021");
		metodo.clicar(elemento.Number);
		metodo.clicar(elemento.NumberOfSeats);
		metodo.clicar(elemento.Direcao);
		metodo.clicar(elemento.Number1);
		metodo.clicar(elemento.EscolherSerie1);
		metodo.clicar(elemento.Combustivel);
		metodo.clicar(elemento.Combustivel1);
		metodo.preencher(elemento.CargaUtil, "350");
		metodo.preencher(elemento.Total, "800");
		metodo.preencher(elemento.PrecoTabela, "55000");
		metodo.preencher(elemento.NumberPlaca, "GF2587");
		metodo.preencher(elemento.KmAnual, "20000");
		metodo.clicar(elemento.Proximo);
		metodo.preencher(elemento.Nome, "Kaique");
		metodo.preencher(elemento.Sobrenome, "Silva");
		metodo.preencher(elemento.Nascimento, "02/18/1963");
		metodo.clicar(elemento.SexoM);
		metodo.preencher(elemento.Endereco, "Av. Deovair Cruz de Oliveira");
		metodo.clicar(elemento.Pais);
		metodo.clicar(elemento.SeuPais);
		metodo.preencher(elemento.Cep, "07750000");
		metodo.preencher(elemento.Cidade, "Sao Paulo");
		metodo.clicar(elemento.Ocupacao);
		metodo.clicar(elemento.EscolhaOcupacao);
		metodo.clicar(elemento.Diversao);
		metodo.clicar(elemento.Hobbie);
		metodo.preencher(elemento.Site, "www.teste.com.br");
		metodo.clicar(elemento.Foto);
		metodo.clicar(elemento.Next);
		metodo.preencher(elemento.DataInicio, "06/09/2021");
		metodo.clicar(elemento.R$Seguro);
		metodo.clicar(elemento.Valor);
		metodo.clicar(elemento.Merito);
		metodo.clicar(elemento.Merito1);
		metodo.clicar(elemento.Danos);
		metodo.clicar(elemento.Danos1);
		metodo.clicar(elemento.Product);
		metodo.clicar(elemento.Cortesia);
		metodo.clicar(elemento.Cortesia1);
		metodo.clicar(elemento.ProxPag);
		metodo.esperarElemento(elemento.Gold);
		metodo.clicar(elemento.Gold);
		metodo.esperar(2000);
		metodo.Scroll();
		metodo.clicar(elemento.ProxPag1);
		metodo.preencherDadosCadastrais("rezendefrancav@gmail.com","11932054447","kaique123","Ka102030","Ka102030");
		metodo.clicar(elemento.Enviar);

		

	}

	@Then("valido formulario enviado com sucesso!!")
	public void valido_formulario_enviado_com_sucesso()  throws Throwable {

		metodo.esperarElemento(elemento.Mensagem);
		metodo.screenShot("Sending e-mail success!");
		metodo.validarTexto(elemento.Mensagem, "Sending e-mail success!");
		metodo.fecharNavegador();

	}

}
