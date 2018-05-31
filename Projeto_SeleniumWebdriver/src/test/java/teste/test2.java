package teste;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	private WebDriver navegador; 
	
    @Before
    public void setUp (){
    	
		System.setProperty("webdriver.chrome.driver","c:\\driver\\chromedriver.exe");
		navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// navegando para pagina! 
		navegador.get("http://www.juliodelima.com.br/taskit");
    	
    }

	@Test
	public void testAdicionarInformacaoDoUsuario() {

		// Clicar no link que possui o texto "Sign in"
		navegador.findElement(By.linkText("Sign in")).click();

		// Identificar formulario  de login
	 	WebElement formulariosignibox = navegador.findElement(By.id("signinbox"));
		
		// Digitar no campo com nome "login" que está dentro do formulario de id "signibox" o texto "julio0001"
	 	formulariosignibox.findElement(By.name("login")).sendKeys("julio0001");
		
		// Digitar no campo com nome "Password" que está dentro do formulario de id "signibox" o texto "123456"
        formulariosignibox.findElement(By.name("password")).sendKeys("123456");
	 	
		// Clicar no link com o texto "SIGN IN"
        navegador.findElement(By.linkText("SIGN IN")).click();
        
		// Validar que dentro do elemento com class "me" está o texto
		WebElement me = navegador.findElement(By.className("me"));
 
	}
	
	@After
	  public void teandown (){
		
		// fechar navegador 
	    navegador.close(); 
		
	}

}
