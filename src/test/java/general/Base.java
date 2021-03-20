package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    protected WebDriver driver; //Declarou o Objeto do Selenium WebDriver, vulgo bola
    // ^ - ao usar PageFactory mudar de public para protected

    // v - criar um constructor e inicializar os elementos do PageFactory
    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
