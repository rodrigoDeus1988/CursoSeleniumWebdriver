package teste;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class test {

	private WebDriver navegador;

	@Before
	public void setUp() {

		TesteAmbiente.executar(null);

		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
 
	@Test
	public void testAdicionarInformacaoDoUsuario() {

		// Clicar no link que possui o texto "Sign in"
		navegador.findElement(By.linkText("Sign in")).click();

		// Identificar formulario de login
		WebElement formulariosignibox = navegador.findElement(By
				.id("signinbox"));

		// Digitar no campo com nome "login" que está dentro do formulario de id
		// "signibox" o texto "julio0001"
		formulariosignibox.findElement(By.name("login")).sendKeys("julio0001");

		// Digitar no campo com nome "Password" que está dentro do formulario de
		// id "signibox" o texto "123456"
		formulariosignibox.findElement(By.name("password")).sendKeys("123456");

		// Clicar no link com o texto "SIGN IN"
		navegador.findElement(By.linkText("SIGN IN")).click();

		// Validar que dentro do elemento com class "me" está o texto
		WebElement me = navegador.findElement(By.className("me"));
		String textodoElementoMe = me.getText();
		assertEquals("Hi, Julio", textodoElementoMe);

	}

	@After
	public void teandown() {

		// fechar navegador
		navegador.close();

	}

}
