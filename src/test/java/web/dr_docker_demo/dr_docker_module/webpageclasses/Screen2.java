package web.dr_docker_demo.dr_docker_module.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Screen2 extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"http://devrabbit.com/\",\"report_upload_url\":\"https://192.168.1.142:8080/TAF_Automation_DR/UploadReportFile\",\"project_name\":\"DR_Docker_Demo\",\"project_description\":\"desc\",\"project_id\":220,\"module_name\":\"DR_Docker_module\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":360,\"testcase_name\":\"TC1\",\"testcase_id\":432,\"testset_id\":0,\"executed_timestamp\":-877514169,\"browser_type\":\"chrome\"}";

	public static String projectName = "dr_docker_demo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Screen2(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//LI[@id='menu-item-1876']/A[1]")	
	private WebElement	BFS_297967A;
	public String clkABFS_297967() {
		waitForExpectedElement(driver, BFS_297967A);		
		String text = BFS_297967A.getText();
		BFS_297967A.click();
		return text;
	}

}