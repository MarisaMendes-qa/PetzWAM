package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import general.Base;
import org.openqa.selenium.WebDriver;
import pages.Home;
import pages.List;
import pages.Product;

import static org.junit.Assert.assertEquals;

public class SearchProduct_StepsDefs extends Base {
    private Base base; //Declaramos as nossas páginas
    private Home home;
    private List list;
    private Product productClass; // é a classe Produto.java

    public SearchProduct_StepsDefs(WebDriver driver, Base base) {
        super(driver);
        this.base = base;
    }

    @Given("^I access Petz homepage$")
    public void iAccessPetzHomepage() {
        base.driver.get("https://www.petz.com.br");
    }

    @When("^I search \"([^\"]*)\"$") //expressões regulares, gera automático
    public void iSearch(String product) {
        home.searchWithEnter(product);//product é uma variável que vem da nossa .feature
    }

    @Then("^I see a list of product \"([^\"]*)\"$")
    public void iSeeAListOfProduct(String product)  {
        //então temos uns asserts, pois temos que verificar algo
        //Validar o nome da guia
        assertEquals(product + " - Produtos pet em promoção | Petz",list.readTitleTab());

        //Validar o texto no Resultado Para (ResultBy)
        assertEquals("Resultado para \"" + product + "\"", list.readResultBy());
    }

    @And("^I click in product \"([^\"]*)\"$")
    public void iClickInProduct(String product)  {
        list.clickAtDesireProduct(product);
    }

    @Then("^show the title \"([^\"]*)\" and price \"([^\"]*)\"$")
    public void showTheTitleAndPrice(String product, String price)  {
        //Validar o título da guia
        assertEquals(product + " - Produtos pet em promoção | Petz", productClass.readTitleTab());

        //Validar o nome do produto
        assertEquals(product, productClass.readProductTitle());
        //assertEquals(product, this.product.readProductTitle());

        //Validar o preço
        assertEquals(price, productClass.readPriceCurrent());

    }
}
