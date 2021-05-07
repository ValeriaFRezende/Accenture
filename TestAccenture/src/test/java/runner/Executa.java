package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		
		
		// caminho da feature
		features = "src/test/resources/features/",

		// pacote da classes de testes
		glue = "testes",

		// formato BDD
		monochrome = true,

		// nome da tag no arquivo gherkins para executar os casos de testes
		// correspondente

		tags = "@executa",

		// formatar visualizar do codigo no console report html
		plugin = { "pretty", "html:target/report.html" },

		// valida se existem feature sem steps implementados,padrao deixar false
		dryRun = false)

public class Executa {

}
