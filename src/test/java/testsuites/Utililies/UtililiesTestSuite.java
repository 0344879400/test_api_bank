package testsuites.Utililies;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/CIMBACKAPW.QuanLyPhi/GoiPhi/DayDuyetGoiPhi.feature",
        tags = "@feature=day-duyet-goi-phi",
        glue = {"stepDefs"}
)
public class UtililiesTestSuite {
}
