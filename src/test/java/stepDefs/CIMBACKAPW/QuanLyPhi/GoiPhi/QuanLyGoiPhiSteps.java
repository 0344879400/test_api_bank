package stepDefs.CIMBACKAPW.QuanLyPhi.GoiPhi;

import business.SystemTest.CIMBACKAPW.QuanLyPhi.GoiPhiBusiness;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class QuanLyGoiPhiSteps {
    GoiPhiBusiness quanLyGoiPhiBusiness = new GoiPhiBusiness();

    @Then("^user call api reject fee package$")
    public void cancelApprovalListProduct(DataTable table){
        List<Map<String,String>> data = table.asMaps(String.class, String.class);
        quanLyGoiPhiBusiness.rejectFeePackage(data);
    }

    @Given("user call api save draft fee package")
    public void userCallApiSaveDraftFeePackage(DataTable table) {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        quanLyGoiPhiBusiness.saveDraftAndSubmitFeePackage(data);
    }

}
