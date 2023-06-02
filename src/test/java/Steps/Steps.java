package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	Metodos a = new Metodos();
	Elementos e = new Elementos();

	@Given("^que acesse o banco inter \"([^\"]*)\"$")
	public void que_acesse_o_banco_inter(String url) throws Throwable {
		a.abrirNavegador(url);
	}

	@Given("^selecione o botao abra sua conta$")
	public void selecione_o_botao_abra_sua_conta() throws Throwable {
		a.pausa(3000);
		a.click(e.getBtnAbrasuaconta());
	}

	@When("^preencher o formulario$")
	public void preencher_o_formulario() throws Throwable {
		a.pausa(3000);
		a.preencher(e.getCampoNome(), "teste flahs");
		a.preencher(e.getCampoTelefone(), "11111111111");
		a.preencher(e.getCampoEmail(), "teste@123.com");
		a.preencher(e.getCampoCpf(), "99373392000");
		a.preencher(e.getCampoDatanascimento(), "12011999");
	}

	@When("^selecionar o botao do checkbox$")
	public void selecionar_o_botao_do_checkbox() throws Throwable {
		a.click(e.getCheckbox());
	}

	@When("^selecionar o botao continuar$")
	public void selecionar_o_botao_continuar() throws Throwable {
		a.click(e.getBtnContinuar());
	}

	@Then("^será exibido o texto falta pouco$")
	public void será_exibido_o_texto_falta_pouco() throws Throwable {

	}

}
