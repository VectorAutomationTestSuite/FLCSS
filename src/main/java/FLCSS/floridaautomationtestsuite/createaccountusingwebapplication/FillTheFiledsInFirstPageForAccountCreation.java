package FLCSS.floridaautomationtestsuite.createaccountusingwebapplication;

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
 * WHEN Enter the required data in first page
 * GIVEN I have launched the web application
 * THEN User is navigated to second page
 * AND Click on "NEXT:TOLL TAGS & VEHICLES" button
 * </pre>
 */
@Test (
  groups = {"ClearSky", "Scenario"},
  description = ""
)
@ClearSkyTest (
  id = "",
  scenario = "Fill the fileds in first page for Account creation"
)
public class FillTheFiledsInFirstPageForAccountCreation extends AbstractClearSkyTest {

  /**
   * The {@code Logger} to use in cooperation with all test instances.
   */
  private static final Logger LOG = LoggerFactory.getLogger(FillTheFiledsInFirstPageForAccountCreation.class);

  /**
   * WHEN Enter the required data in first page
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "WHEN Enter the required data in first page"
  )
  @ClearSkyTestMethod (stepNumber = 1)
  public void WHEN_Enter_the_required_data_in_first_page_0001(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Fill the fileds in first page for Account creation], Step[0 : WHEN Enter the required data in first page]");
    throw new NotYetImplementedException();
  }

  /**
   * GIVEN I have launched the web application
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "WHEN_Enter_the_required_data_in_first_page_0001",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "GIVEN I have launched the web application"
  )
  @ClearSkyTestMethod (stepNumber = 2)
  public void GIVEN_I_have_launched_the_web_application_0002(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Fill the fileds in first page for Account creation], Step[1 : GIVEN I have launched the web application]");
    throw new NotYetImplementedException();
  }

  /**
   * THEN User is navigated to second page
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "GIVEN_I_have_launched_the_web_application_0002",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "THEN User is navigated to second page"
  )
  @ClearSkyTestMethod (stepNumber = 3)
  public void THEN_User_is_navigated_to_second_page_0003(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Fill the fileds in first page for Account creation], Step[2 : THEN User is navigated to second page]");
    throw new NotYetImplementedException();
  }

  /**
   * AND Click on "NEXT:TOLL TAGS & VEHICLES" button
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "THEN_User_is_navigated_to_second_page_0003",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "AND Click on \"NEXT:TOLL TAGS & VEHICLES\" button"
  )
  @ClearSkyTestMethod (stepNumber = 4)
  public void AND_Click_on_NEXTXTOLL_TAGS_X_VEHICLES_button_0004(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Fill the fileds in first page for Account creation], Step[3 : AND Click on \"NEXT:TOLL TAGS & VEHICLES\" button]");
    throw new NotYetImplementedException();
  }
}
