package teste;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//***
public class TesteAmbiente {

	public static void executar(String ambiente) {

		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Github\\CursoSeleniumWebdriver\\CursoSeleniumWebdriver\\Projeto_SeleniumWebdriver\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.juliodelima.com.br/taskit"); 
	}

}
