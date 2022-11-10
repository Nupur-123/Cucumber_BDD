package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureWithTags",
glue= {"Stepsdefination"},
//tags = {"smoke","@regression"} //deprecated
//tags = {"@smoke or @regression"}
//tags = {"(@smoke or @regression) and @important"}
//tags = {"@smoke and @regression"}
//tags = {"@regression and not @smoke"}
        tags = {"@mustRun"}
//tags ={"(@smoke or @regression) and not @important"}
            )
public class TestRunner_RunwithSingletag {

}
