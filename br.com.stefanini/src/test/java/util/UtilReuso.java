package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UtilReuso {
	private WebDriver driver;
	
	public UtilReuso(WebDriver driver) {
		this.driver = driver;
	}

	// *** Retorna Texto *** //
	public String valorTexto(By by) {
		return driver.findElement(by).getText();
	}
	
	public String valorTextoId(String id) {
		return driver.findElement(By.id(id)).getText();
	}
	
	public String valorTexto(String xpath) {
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	public String valorTextoCss(String css) {
		return driver.findElement(By.cssSelector(css)).getText();
	}

	// *** Campo de texto *** //
	public void escrever(String id, String dados) {
		driver.findElement(By.id(id)).clear();
		driver.findElement(By.id(id)).sendKeys(dados);		
	}

	// *** Bot�o e Link *** //
	public void clicarBotao(String id) {
		driver.findElement(By.id(id)).click();
	}

	public void clicarLink(String id) {
		driver.findElement(By.linkText(id)).click();
	}
}
