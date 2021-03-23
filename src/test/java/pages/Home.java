package pages;

import general.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends Base {

    // 1. Mapeamentos de elementos
    @FindBy(id= "search")
    private WebElement txtInputSearch; //inspecionando a caixa de Texto(Pesquisa)

    @FindBy(css = "button.button-search")
    private WebElement btnSearch;//inspecionando o botão da Lupa

    // 2. Construtor

    public Home(WebDriver driver) {
        super(driver);// Superclasse.É uma classe especial de onde todos derivam
    }


    // 3. Ações dos Elementos

    public void search(String product){
        txtInputSearch.click(); //clica na caixa de pesquisa
        txtInputSearch.clear(); //limpar o conteúdo da caixa de texto
        txtInputSearch.sendKeys(product); // Escreve na caixa de texto
    }

    //Feature --> Steps --> searchWith.. -->search()

    public void searchWithMagnifierButton(String product){
        search(product);
        btnSearch.click(); //clicar no botão lupa
    }

    public void searchWithEnter(String product){
        search(product);
        txtInputSearch.sendKeys(Keys.ENTER); //tecla no ENTER/RETURN
    }

}
