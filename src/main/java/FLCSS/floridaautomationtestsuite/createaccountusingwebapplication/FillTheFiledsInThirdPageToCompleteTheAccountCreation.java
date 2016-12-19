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
 * WHEN Enter the required data in third page
 * THEN Account Creation is completed successfully
 * AND Click Order completion button
 * </pre>
 */
@Test (
  groups = {"ClearSky", "Scenario"},
  description = ""
)
@ClearSkyTest (
  id = "",
  scenario = "Fill the fileds in third page to complete the account creation"
)
public class FillTheFiledsInThirdPageToCompleteTheAccountCreation extends AbstractClearSkyTest {

  /**
   * The {@code Logger} to use in cooperation with all test instances.
   */
  private static final Logger LOG = LoggerFactory.getLogger(FillTheFiledsInThirdPageToCompleteTheAccountCreation.class);

  /**
   * WHEN Enter the required data in third page
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "WHEN Enter the required data in third page"
  )
  @ClearSkyTestMethod (stepNumber = 1)
  public void WHEN_Enter_the_required_data_in_third_page_0001(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Fill the fileds in third page to complete the account creation], Step[0 : WHEN Enter the required data in third page]");
    throw new NotYetImplementedException();
  }

  /**
   * THEN Account Creation is completed successfully
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "WHEN_Enter_the_required_data_in_third_page_0001",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "THEN Account Creation is completed successfully"
  )
  @ClearSkyTestMethod (stepNumber = 2)
  public void THEN_Account_Creation_is_completed_successfully_0002(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Fill the fileds in third page to complete the account creation], Step[1 : THEN Account Creation is completed successfully]");
    throw new NotYetImplementedException();
  }

  /**
   * AND Click Order completion button
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "THEN_Account_Creation_is_completed_successfully_0002",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "AND Click Order completion button"
  )
  @ClearSkyTestMethod (stepNumber = 3)
  public void AND_Click_Order_completion_button_0003(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Fill the fileds in third page to complete the account creation], Step[2 : AND Click Order completion button]");
    throw new NotYetImplementedException();
  }
}
