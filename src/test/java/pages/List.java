package pages;

import general.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class List extends Base {

    // 1 - Mapeamentos
    @FindBy(css= "h1.h2Categoria.nomeCategoria")
    // Label = rótulo texto do resultado para
    private WebElement lblResultBy;

    // 2 - Constructor
    public List(WebDriver driver) {
        super(driver);
    }

    // 3 - Métodos e Funções baseados no Mapeamento

    // Lê o título da guia e devolve o texto encontrado
    public String readTitleTab(){
        return driver.getTitle();
    }
    //Ler a frase Resultado para "Produto"
    public String readResultBy(){
        return lblResultBy.getText();
    }

    // Clique no produto desejado
    public void clickAtDesireProduct(String product){
       //driver.findElement(By.xpath("//h3[contains(text(),'" + product + "')]")).click();
        //segundo produto
        driver.findElement(By.xpath("//h3[contains(text(),'Aquário Boyu Preto MT 50 80 Litros')]")).click();
    }
}
