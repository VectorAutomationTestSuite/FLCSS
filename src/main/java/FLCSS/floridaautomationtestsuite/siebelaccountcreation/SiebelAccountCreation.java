package FLCSS.floridaautomationtestsuite.siebelaccountcreation;

import com.vrds.clearsky.api.AbstractClearSkyTest;
import com.vrds.clearsky.api.ClearSkyTest;
import com.vrds.clearsky.api.ClearSkyTestMethod;
import com.vrds.clearsky.api.NotYetImplementedException;
import com.vrds.clearsky.api.dataprovider.ClasspathDataProvider;
import com.vrds.clearsky.api.parameters.BaseUrl;
import com.vrds.clearsky.api.parameters.DataTable;
import com.vrds.clearsky.api.parameters.Settings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * 
 *
 * <br /><br />
 *
 * The full Gherkin for this scenario is as follows:
 * <pre style="margin-top: 5px;">
 * GIVEN Launch the siebel application
 * WHEN Enter the UserId, Password and click Login button
 * THEN Home page should be displayed
 * WHEN Click on Account Opening button followed by New button
 * THEN Account Opening page should be displayed
 * WHEN Enter Account Type and Access Information details and save the application
 * THEN Account type and Access Infromation section should be saved
 * WHEN Click on New button, enter the Contact details and save the application
 * THEN Contact section should be saved
 * WHEN Click on New button, enter the Address details and save the application
 * THEN Adress section should be saved
 * WHEN Click on New button,enter the Replenishment details and save the application
 * THEN Replenishment section should be saved
 * WHEN Click on New button,enter the Vehicle details and save the application
 * THEN Vehicle section should  be saved
 * WHEN Click on New button,enter the Device Request details and save the application
 * THEN Device Request section should be saved
 * WHEN Click on New button,enter the Plan Details and save the application
 * AND Provides the Payment details and save the application
 * THEN Account should be created successfully
 * </pre>
 */
@Test (
  groups = {"ClearSky", "Scenario"},
  description = ""
)
@ClearSkyTest (
  id = "",
  scenario = "Siebel Account Creation"
)
public class SiebelAccountCreation extends AbstractClearSkyTest {

  /**
   * The {@code Logger} to use in cooperation with all test instances.
   */
  private static final Logger LOG = LoggerFactory.getLogger(SiebelAccountCreation.class);

  /**
   * GIVEN Launch the siebel application
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "GIVEN Launch the siebel application"
  )
  @ClearSkyTestMethod (stepNumber = 1)
  public void GIVEN_Launch_the_siebel_application_0001(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[0 : GIVEN Launch the siebel application]");
    throw new NotYetImplementedException();
  }

  /**
   * WHEN Enter the UserId, Password and click Login button
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "GIVEN_Launch_the_siebel_application_0001",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "WHEN Enter the UserId, Password and click Login button"
  )
  @ClearSkyTestMethod (stepNumber = 2)
  public void WHEN_Enter_the_UserIdX_Password_and_click_Login_button_0002(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[1 : WHEN Enter the UserId, Password and click Login button]");
    throw new NotYetImplementedException();
  }

  /**
   * THEN Home page should be displayed
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "WHEN_Enter_the_UserIdX_Password_and_click_Login_button_0002",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "THEN Home page should be displayed"
  )
  @ClearSkyTestMethod (stepNumber = 3)
  public void THEN_Home_page_should_be_displayed_0003(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[2 : THEN Home page should be displayed]");
    throw new NotYetImplementedException();
  }

  /**
   * WHEN Click on Account Opening button followed by New button
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "THEN_Home_page_should_be_displayed_0003",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "WHEN Click on Account Opening button followed by New button"
  )
  @ClearSkyTestMethod (stepNumber = 4)
  public void WHEN_Click_on_Account_Opening_button_followed_by_New_button_0004(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[3 : WHEN Click on Account Opening button followed by New button]");
    throw new NotYetImplementedException();
  }

  /**
   * THEN Account Opening page should be displayed
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "WHEN_Click_on_Account_Opening_button_followed_by_New_button_0004",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "THEN Account Opening page should be displayed"
  )
  @ClearSkyTestMethod (stepNumber = 5)
  public void THEN_Account_Opening_page_should_be_displayed_0005(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[4 : THEN Account Opening page should be displayed]");
    throw new NotYetImplementedException();
  }

  /**
   * WHEN Enter Account Type and Access Information details and save the application
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "THEN_Account_Opening_page_should_be_displayed_0005",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "WHEN Enter Account Type and Access Information details and save the application"
  )
  @ClearSkyTestMethod (stepNumber = 6)
  public void WHEN_Enter_Account_Type_and_Access_Information_details_and_save_the_application_0006(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[5 : WHEN Enter Account Type and Access Information details and save the application]");
    throw new NotYetImplementedException();
  }

  /**
   * THEN Account type and Access Infromation section should be saved
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "WHEN_Enter_Account_Type_and_Access_Information_details_and_save_the_application_0006",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "THEN Account type and Access Infromation section should be saved"
  )
  @ClearSkyTestMethod (stepNumber = 7)
  public void THEN_Account_type_and_Access_Infromation_section_should_be_saved_0007(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[6 : THEN Account type and Access Infromation section should be saved]");
    throw new NotYetImplementedException();
  }

  /**
   * WHEN Click on New button, enter the Contact details and save the application
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "THEN_Account_type_and_Access_Infromation_section_should_be_saved_0007",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "WHEN Click on New button, enter the Contact details and save the application"
  )
  @ClearSkyTestMethod (stepNumber = 8)
  public void WHEN_Click_on_New_buttonX_enter_the_Contact_details_and_save_the_application_0008(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[7 : WHEN Click on New button, enter the Contact details and save the application]");
    throw new NotYetImplementedException();
  }

  /**
   * THEN Contact section should be saved
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "WHEN_Click_on_New_buttonX_enter_the_Contact_details_and_save_the_application_0008",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "THEN Contact section should be saved"
  )
  @ClearSkyTestMethod (stepNumber = 9)
  public void THEN_Contact_section_should_be_saved_0009(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[8 : THEN Contact section should be saved]");
    throw new NotYetImplementedException();
  }

  /**
   * WHEN Click on New button, enter the Address details and save the application
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "THEN_Contact_section_should_be_saved_0009",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "WHEN Click on New button, enter the Address details and save the application"
  )
  @ClearSkyTestMethod (stepNumber = 10)
  public void WHEN_Click_on_New_buttonX_enter_the_Address_details_and_save_the_application_0010(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[9 : WHEN Click on New button, enter the Address details and save the application]");
    throw new NotYetImplementedException();
  }

  /**
   * THEN Adress section should be saved
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "WHEN_Click_on_New_buttonX_enter_the_Address_details_and_save_the_application_0010",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "THEN Adress section should be saved"
  )
  @ClearSkyTestMethod (stepNumber = 11)
  public void THEN_Adress_section_should_be_saved_0011(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[10 : THEN Adress section should be saved]");
    throw new NotYetImplementedException();
  }

  /**
   * WHEN Click on New button,enter the Replenishment details and save the application
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "THEN_Adress_section_should_be_saved_0011",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "WHEN Click on New button,enter the Replenishment details and save the application"
  )
  @ClearSkyTestMethod (stepNumber = 12)
  public void WHEN_Click_on_New_buttonXenter_the_Replenishment_details_and_save_the_application_0012(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[11 : WHEN Click on New button,enter the Replenishment details and save the application]");
    ///throw new NotYetImplementedException();
  }

  /**
   * THEN Replenishment section should be saved
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "WHEN_Click_on_New_buttonXenter_the_Replenishment_details_and_save_the_application_0012",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "THEN Replenishment section should be saved"
  )
  @ClearSkyTestMethod (stepNumber = 13)
  public void THEN_Replenishment_section_should_be_saved_0013(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[12 : THEN Replenishment section should be saved]");
    throw new NotYetImplementedException();
  }

  /**
   * WHEN Click on New button,enter the Vehicle details and save the application
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "THEN_Replenishment_section_should_be_saved_0013",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "WHEN Click on New button,enter the Vehicle details and save the application"
  )
  @ClearSkyTestMethod (stepNumber = 14)
  public void WHEN_Click_on_New_buttonXenter_the_Vehicle_details_and_save_the_application_0014(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[13 : WHEN Click on New button,enter the Vehicle details and save the application]");
    throw new NotYetImplementedException();
  }

  /**
   * THEN Vehicle section should  be saved
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "WHEN_Click_on_New_buttonXenter_the_Vehicle_details_and_save_the_application_0014",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "THEN Vehicle section should  be saved"
  )
  @ClearSkyTestMethod (stepNumber = 15)
  public void THEN_Vehicle_section_should_be_saved_0015(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[14 : THEN Vehicle section should  be saved]");
    throw new NotYetImplementedException();
  }

  /**
   * WHEN Click on New button,enter the Device Request details and save the application
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "THEN_Vehicle_section_should_be_saved_0015",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "WHEN Click on New button,enter the Device Request details and save the application"
  )
  @ClearSkyTestMethod (stepNumber = 16)
  public void WHEN_Click_on_New_buttonXenter_the_Device_Request_details_and_save_the_application_0016(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[15 : WHEN Click on New button,enter the Device Request details and save the application]");
    throw new NotYetImplementedException();
  }

  /**
   * THEN Device Request section should be saved
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "WHEN_Click_on_New_buttonXenter_the_Device_Request_details_and_save_the_application_0016",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "THEN Device Request section should be saved"
  )
  @ClearSkyTestMethod (stepNumber = 17)
  public void THEN_Device_Request_section_should_be_saved_0017(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[16 : THEN Device Request section should be saved]");
    throw new NotYetImplementedException();
  }

  /**
   * WHEN Click on New button,enter the Plan Details and save the application
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "THEN_Device_Request_section_should_be_saved_0017",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "WHEN Click on New button,enter the Plan Details and save the application"
  )
  @ClearSkyTestMethod (stepNumber = 18)
  public void WHEN_Click_on_New_buttonXenter_the_Plan_Details_and_save_the_application_0018(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[17 : WHEN Click on New button,enter the Plan Details and save the application]");
    throw new NotYetImplementedException();
  }

  /**
   * AND Provides the Payment details and save the application
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "WHEN_Click_on_New_buttonXenter_the_Plan_Details_and_save_the_application_0018",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "AND Provides the Payment details and save the application"
  )
  @ClearSkyTestMethod (stepNumber = 19)
  public void AND_Provides_the_Payment_details_and_save_the_application_0019(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[18 : AND Provides the Payment details and save the application]");
    throw new NotYetImplementedException();
  }

  /**
   * THEN Account should be created successfully
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "AND_Provides_the_Payment_details_and_save_the_application_0019",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "THEN Account should be created successfully"
  )
  @ClearSkyTestMethod (stepNumber = 20)
  public void THEN_Account_should_be_created_successfully_0020(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[19 : THEN Account should be created successfully]");
    throw new NotYetImplementedException();
  }
}
