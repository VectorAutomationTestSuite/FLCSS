package FLCSS.floridaautomationtestsuite.accountcreationinwebapplication;

import com.vrds.clearsky.api.AbstractClearSkyTest;
import com.vrds.clearsky.api.ClearSkyTest;
import com.vrds.clearsky.api.ClearSkyTestMethod;
import com.vrds.clearsky.api.NoStepsInScenarioException;
import com.vrds.clearsky.api.NotYetImplementedException;
import com.vrds.clearsky.api.dataprovider.ClasspathDataProvider;
import com.vrds.clearsky.api.parameters.BaseUrl;
import com.vrds.clearsky.api.parameters.DataTable;
import com.vrds.clearsky.api.parameters.Settings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Creating private account in web application
 *
 * <br /><br />
 *
 * The full Gherkin for this scenario is as follows:
 * <pre style="margin-top: 5px;">
 * THEN User is navigated to third page
 * THEN User is navigated to second page
 * AND Clicks on Next Toll Tags And Vehicles button
 * WHEN User enters the required data in third page
 * GIVEN User has launched the web application
 * WHEN User enters the required data in second field
 * WHEN User enters the required data in first page
 * AND Clicks on Plans And Payment button
 * THEN Account creation should be completed successfully
 * AND Clicks on Order Completion button
 * </pre>
 */
@Test (
  groups = {"ClearSky", "Scenario"},
  description = "Creating private account in web application"
)
@ClearSkyTest (
  id = "",
  scenario = "Private Account Creation"
)
public class PrivateAccountCreation extends AbstractClearSkyTest {

  /**
   * The {@code Logger} to use in cooperation with all test instances.
   */
  private static final Logger LOG = LoggerFactory.getLogger(PrivateAccountCreation.class);

  /**
   * THEN User is navigated to third page
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "THEN User is navigated to third page"
  )
  @ClearSkyTestMethod (stepNumber = 1)
  public void THEN_User_is_navigated_to_third_page_0001(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Private Account Creation], Step[0 : THEN User is navigated to third page]");
    throw new NotYetImplementedException();
  }

  /**
   * THEN User is navigated to second page
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "THEN_User_is_navigated_to_third_page_0001",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "THEN User is navigated to second page"
  )
  @ClearSkyTestMethod (stepNumber = 2)
  public void THEN_User_is_navigated_to_second_page_0002(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Private Account Creation], Step[1 : THEN User is navigated to second page]");
    throw new NotYetImplementedException();
  }

  /**
   * AND Clicks on Next Toll Tags And Vehicles button
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "THEN_User_is_navigated_to_second_page_0002",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "AND Clicks on Next Toll Tags And Vehicles button"
  )
  @ClearSkyTestMethod (stepNumber = 3)
  public void AND_Clicks_on_Next_Toll_Tags_And_Vehicles_button_0003(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Private Account Creation], Step[2 : AND Clicks on Next Toll Tags And Vehicles button]");
    throw new NotYetImplementedException();
  }

  /**
   * WHEN User enters the required data in third page
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "AND_Clicks_on_Next_Toll_Tags_And_Vehicles_button_0003",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "WHEN User enters the required data in third page"
  )
  @ClearSkyTestMethod (stepNumber = 4)
  public void WHEN_User_enters_the_required_data_in_third_page_0004(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Private Account Creation], Step[3 : WHEN User enters the required data in third page]");
    throw new NotYetImplementedException();
  }

  /**
   * GIVEN User has launched the web application
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "WHEN_User_enters_the_required_data_in_third_page_0004",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "GIVEN User has launched the web application"
  )
  @ClearSkyTestMethod (stepNumber = 5)
  public void GIVEN_User_has_launched_the_web_application_0005(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Private Account Creation], Step[4 : GIVEN User has launched the web application]");
    throw new NotYetImplementedException();
  }

  /**
   * WHEN User enters the required data in second field
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "GIVEN_User_has_launched_the_web_application_0005",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "WHEN User enters the required data in second field"
  )
  @ClearSkyTestMethod (stepNumber = 6)
  public void WHEN_User_enters_the_required_data_in_second_field_0006(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Private Account Creation], Step[5 : WHEN User enters the required data in second field]");
    throw new NotYetImplementedException();
  }

  /**
   * WHEN User enters the required data in first page
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "WHEN_User_enters_the_required_data_in_second_field_0006",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "WHEN User enters the required data in first page"
  )
  @ClearSkyTestMethod (stepNumber = 7)
  public void WHEN_User_enters_the_required_data_in_first_page_0007(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Private Account Creation], Step[6 : WHEN User enters the required data in first page]");
    throw new NotYetImplementedException();
  }

  /**
   * AND Clicks on Plans And Payment button
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "WHEN_User_enters_the_required_data_in_first_page_0007",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "AND Clicks on Plans And Payment button"
  )
  @ClearSkyTestMethod (stepNumber = 8)
  public void AND_Clicks_on_Plans_And_Payment_button_0008(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Private Account Creation], Step[7 : AND Clicks on Plans And Payment button]");
    throw new NotYetImplementedException();
  }

  /**
   * THEN Account creation should be completed successfully
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "AND_Clicks_on_Plans_And_Payment_button_0008",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "THEN Account creation should be completed successfully"
  )
  @ClearSkyTestMethod (stepNumber = 9)
  public void THEN_Account_creation_should_be_completed_successfully_0009(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Private Account Creation], Step[8 : THEN Account creation should be completed successfully]");
    throw new NotYetImplementedException();
  }

  /**
   * AND Clicks on Order Completion button
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "THEN_Account_creation_should_be_completed_successfully_0009",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "AND Clicks on Order Completion button"
  )
  @ClearSkyTestMethod (stepNumber = 10)
  public void AND_Clicks_on_Order_Completion_button_0010(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Private Account Creation], Step[9 : AND Clicks on Order Completion button]");
    throw new NotYetImplementedException();
  }
}
