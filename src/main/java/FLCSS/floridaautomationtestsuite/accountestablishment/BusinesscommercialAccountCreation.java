package FLCSS.floridaautomationtestsuite.accountestablishment;

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
 * Here we need to create a account type for Siebel Application for Business/Commercial purpose
 *
 * <br /><br />
 *
 * The full Gherkin for this scenario is as follows:
 * <pre style="margin-top: 5px;">
 * GIVEN i am at business/commercial account opening home page
 * WHEN When user clicks on New and submit all required field
 * THEN business account created succesfully
 * GIVEN user is now at contact section
 * WHEN user submits all required value in contact section
 * </pre>
 */
@Test (
  groups = {"ClearSky", "Scenario"},
  description = "Here we need to create a account type for Siebel Application for Business/Commercial purpose"
)
@ClearSkyTest (
  id = "",
  scenario = "Business/Commercial Account creation"
)
public class BusinesscommercialAccountCreation extends AbstractClearSkyTest {

  /**
   * The {@code Logger} to use in cooperation with all test instances.
   */
  private static final Logger LOG = LoggerFactory.getLogger(BusinesscommercialAccountCreation.class);

  /**
   * GIVEN i am at business/commercial account opening home page
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "GIVEN i am at business/commercial account opening home page"
  )
  @ClearSkyTestMethod (stepNumber = 1)
  public void GIVEN_i_am_at_businessXcommercial_account_opening_home_page_0001(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Business/Commercial Account creation], Step[0 : GIVEN i am at business/commercial account opening home page]");
    throw new NotYetImplementedException();
  }

  /**
   * WHEN When user clicks on New and submit all required field
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "GIVEN_i_am_at_businessXcommercial_account_opening_home_page_0001",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "WHEN When user clicks on New and submit all required field"
  )
  @ClearSkyTestMethod (stepNumber = 2)
  public void WHEN_When_user_clicks_on_New_and_submit_all_required_field_0002(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Business/Commercial Account creation], Step[1 : WHEN When user clicks on New and submit all required field]");
    throw new NotYetImplementedException();
  }

  /**
   * THEN business account created succesfully
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "WHEN_When_user_clicks_on_New_and_submit_all_required_field_0002",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "THEN business account created succesfully"
  )
  @ClearSkyTestMethod (stepNumber = 3)
  public void THEN_business_account_created_succesfully_0003(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Business/Commercial Account creation], Step[2 : THEN business account created succesfully]");
    throw new NotYetImplementedException();
  }

  /**
   * GIVEN user is now at contact section
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "THEN_business_account_created_succesfully_0003",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "GIVEN user is now at contact section"
  )
  @ClearSkyTestMethod (stepNumber = 4)
  public void GIVEN_user_is_now_at_contact_section_0004(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Business/Commercial Account creation], Step[3 : GIVEN user is now at contact section]");
    throw new NotYetImplementedException();
  }

  /**
   * WHEN user submits all required value in contact section
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "GIVEN_user_is_now_at_contact_section_0004",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "WHEN user submits all required value in contact section"
  )
  @ClearSkyTestMethod (stepNumber = 5)
  public void WHEN_user_submits_all_required_value_in_contact_section_0005(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Business/Commercial Account creation], Step[4 : WHEN user submits all required value in contact section]");
    throw new NotYetImplementedException();
  }
}
