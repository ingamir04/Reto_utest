package utest.prueba.runner;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/Utest.feature",
        tags = "@stories",
        glue = "utest.prueba.stepdefinition",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
