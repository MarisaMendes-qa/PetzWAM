package general;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue     = "steps",
        //pasta target para saidas, por exemplo: output ou reports
        plugin = {"pretty",
                   "html: target/relatorioSimples",
                   "json: target/SearchProductReports.json ",
                    "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/dashboard.html"
        }
)

public class Runner {

}
