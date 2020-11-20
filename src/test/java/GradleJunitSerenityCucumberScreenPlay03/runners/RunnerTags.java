package GradleJunitSerenityCucumberScreenPlay03.runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/opensourcecms.feature",
                  tags = "@stories",
                  glue = "GradleJunitSerenityCucumberScreenPlay03.stepdefinitions",
                  snippets = SnippetType.CAMELCASE)


public class RunnerTags {

}
