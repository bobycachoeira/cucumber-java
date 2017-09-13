package cucumber.teste;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", tags = "@testeUm",
        glue = "cucumber.teste.steps", monochrome = true, dryRun = false)
public class testeGoogle {
}

