package Runners;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
@CucumberOptions(
        tags = "@UITest",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","json:target/cucumber/cucumber.json"}
)
public class TestRunnerExtentReport extends AbstractTestNGCucumberTests {
    @AfterClass
    public static void writeExtentReport() {
        ExtentService.getInstance().setSystemInfo("Windows User Name", System.getProperty("user.name"));
        ExtentService.getInstance().setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Application Name", "TurkSat-BelgeNet");
        ExtentService.getInstance().setSystemInfo("Department", "Test Birimi");
        ExtentService.getInstance().setSystemInfo("Team Leader", "Bilal");
        ExtentService.getInstance().setSystemInfo("Test Sorumlusu", "Bilal");
        ExtentService.getInstance().setSystemInfo("Ek Satır", "Açıklama");

        System.out.println("Test Başarılı = " + "Test Başarılı");
    }
}
