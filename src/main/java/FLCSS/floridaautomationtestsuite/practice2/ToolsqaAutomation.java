package FLCSS.floridaautomationtestsuite.practice2;

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
 * 
 *
 * <br /><br />
 *
 * The full Gherkin for this scenario is as follows:
 * <pre style="margin-top: 5px;">
 * GIVEN I am in Home page
 * WHEN I click on "My Account" text on the top right of the page
 * AND I am taken to the login screen with a "Register" link
 * AND I click "Register"
 * THEN I see the following lebels
 * </pre>
 */
@Test (
  groups = {"ClearSky", "Scenario"},
  description = ""
)
@ClearSkyTest (
  id = "",
  scenario = "ToolsQA Automation"
)
public class ToolsqaAutomation extends AbstractClearSkyTest {

  /**
   * The {@code Logger} to use in cooperation with all test instances.
   */
  private static final Logger LOG = LoggerFactory.getLogger(ToolsqaAutomation.class);

  /**
   * GIVEN I am in Home page
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "GIVEN I am in Home page"
  )
  @ClearSkyTestMethod (stepNumber = 1)
  public void GIVEN_I_am_in_Home_page_0001(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[ToolsQA Automation], Step[0 : GIVEN I am in Home page]");
    throw new NotYetImplementedException();
  }

  /**
   * WHEN I click on "My Account" text on the top right of the page
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "GIVEN_I_am_in_Home_page_0001",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "WHEN I click on \"My Account\" text on the top right of the page"
  )
  @ClearSkyTestMethod (stepNumber = 2)
  public void WHEN_I_click_on_My_Account_text_on_the_top_right_of_the_page_0002(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[ToolsQA Automation], Step[1 : WHEN I click on \"My Account\" text on the top right of the page]");
    throw new NotYetImplementedException();
  }

  /**
   * AND I am taken to the login screen with a "Register" link
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "WHEN_I_click_on_My_Account_text_on_the_top_right_of_the_page_0002",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "AND I am taken to the login screen with a \"Register\" link"
  )
  @ClearSkyTestMethod (stepNumber = 3)
  public void AND_I_am_taken_to_the_login_screen_with_a_Register_link_0003(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[ToolsQA Automation], Step[2 : AND I am taken to the login screen with a \"Register\" link]");
    throw new NotYetImplementedException();
  }

  /**
   * AND I click "Register"
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "AND_I_am_taken_to_the_login_screen_with_a_Register_link_0003",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "AND I click \"Register\""
  )
  @ClearSkyTestMethod (stepNumber = 4)
  public void AND_I_click_Register_0004(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[ToolsQA Automation], Step[3 : AND I click \"Register\"]");
    throw new NotYetImplementedException();
  }

  /**
   * THEN I see the following lebels
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "AND_I_click_Register_0004",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "THEN I see the following lebels"
  )
  @ClearSkyTestMethod (stepNumber = 5)
  public void THEN_I_see_the_following_lebels_0005(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[ToolsQA Automation], Step[4 : THEN I see the following lebels]");
    throw new NotYetImplementedException();
  }
}
