

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",glue= {"StepDefenitions"},
monochrome	= true,
plugin = {"pretty","html:target/Reports/htmlreport.html",
		"json:target/Reports/Jsonreport.json"
	//	"junit:target/Reports/htmlreport.xml"
	 },
		tags= ("@Swaglabs or @HYR_test")
		)

public class Test_SL_runner {

}
