package general;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Hooks extends Base{
    private Base base; //cria o objeto local para a comunicação com o Objeto da Classe extendida

    public Hooks(Base base) {
        super(base.driver);
        this.base = base;
    }

    @Before
    public void setUp(){
        //Onde esta o driver do browser
        System.setProperty("webdriver.chrome.driver","drivers/chrome/89/chromedriver.exe");

        //Instanciar o driver do Chrome
        base.driver = new ChromeDriver();

        //maximizar a tela
        base.driver.manage().window().maximize();

        //definir a espera implicita
        base.driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
    }

     @After
    public void tearDown(){

        //destruir o objeto do selenium
        base.driver.quit();

     }
}
