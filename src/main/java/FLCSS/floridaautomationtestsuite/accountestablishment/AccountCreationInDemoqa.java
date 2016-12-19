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
 * Account needs to be created
 *
 * <br /><br />
 *
 * The full Gherkin for this scenario is as follows:
 * <pre style="margin-top: 5px;">
 * GIVEN i am at homepage
 * WHEN I click "MyAccount" text on the top right of the page
 * AND i am taken to the login screen with a "Register link"
 * AND i click register
 * THEN i see the following details
 * </pre>
 */
@Test (
  groups = {"ClearSky", "Scenario"},
  description = "Account needs to be created"
)
@ClearSkyTest (
  id = "",
  scenario = "Account creation in DemoQa"
)
public class AccountCreationInDemoqa extends AbstractClearSkyTest {

  /**
   * The {@code Logger} to use in cooperation with all test instances.
   */
  private static final Logger LOG = LoggerFactory.getLogger(AccountCreationInDemoqa.class);

  /**
   * GIVEN i am at homepage
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "GIVEN i am at homepage"
  )
  @ClearSkyTestMethod (stepNumber = 1)
  public void GIVEN_i_am_at_homepage_0001(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Account creation in DemoQa], Step[0 : GIVEN i am at homepage]");
    throw new NotYetImplementedException();
  }

  /**
   * WHEN I click "MyAccount" text on the top right of the page
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "GIVEN_i_am_at_homepage_0001",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "WHEN I click \"MyAccount\" text on the top right of the page"
  )
  @ClearSkyTestMethod (stepNumber = 2)
  public void WHEN_I_click_MyAccount_text_on_the_top_right_of_the_page_0002(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Account creation in DemoQa], Step[1 : WHEN I click \"MyAccount\" text on the top right of the page]");
    throw new NotYetImplementedException();
  }

  /**
   * AND i am taken to the login screen with a "Register link"
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "WHEN_I_click_MyAccount_text_on_the_top_right_of_the_page_0002",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "AND i am taken to the login screen with a \"Register link\""
  )
  @ClearSkyTestMethod (stepNumber = 3)
  public void AND_i_am_taken_to_the_login_screen_with_a_Register_link_0003(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Account creation in DemoQa], Step[2 : AND i am taken to the login screen with a \"Register link\"]");
    throw new NotYetImplementedException();
  }

  /**
   * AND i click register
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "AND_i_am_taken_to_the_login_screen_with_a_Register_link_0003",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "AND i click register"
  )
  @ClearSkyTestMethod (stepNumber = 4)
  public void AND_i_click_register_0004(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Account creation in DemoQa], Step[3 : AND i click register]");
    throw new NotYetImplementedException();
  }

  /**
   * THEN i see the following details
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "AND_i_click_register_0004",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "THEN i see the following details"
  )
  @ClearSkyTestMethod (stepNumber = 5)
  public void THEN_i_see_the_following_details_0005(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Account creation in DemoQa], Step[4 : THEN i see the following details]");
    throw new NotYetImplementedException();
  }
}
