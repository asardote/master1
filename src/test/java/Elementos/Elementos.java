package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnAbrasuaconta = By.cssSelector("#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles_LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.stylesSearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles_ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)");
	private By campoNome = By.id("nome");
	private By campoTelefone = By.id("celular");
	private By campoEmail = By.id("email");
	private By campoCpf = By.id("cpf");
	private By campoDatanascimento = By.id("dataNascimento");
	private By checkbox = By.cssSelector(
			"body > div.style_ModalContent-wuavw4-0.hOXgJK > div.style_Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div:nth-child(6) > div > label");
	private By btnContinuar = By.cssSelector(
			"body > div.style_ModalContent-wuavw4-0.hOXgJK > div.style_Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div.col-12.text-center > div.d-none.d-md-block > button");
	public By getBtnAbrasuaconta() {
		return btnAbrasuaconta;
	}
	public By getCampoNome() {
		return campoNome;
	}
	public By getCampoTelefone() {
		return campoTelefone;
	}
	public By getCampoEmail() {
		return campoEmail;
	}
	public By getCampoCpf() {
		return campoCpf;
	}
	public By getCampoDatanascimento() {
		return campoDatanascimento;
	}
	public By getCheckbox() {
		return checkbox;
	}
	public By getBtnContinuar() {
		return btnContinuar;
	}

	
}