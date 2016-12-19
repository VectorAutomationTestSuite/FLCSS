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
 * Prepaid private account creation for a new user
 *
 * <br /><br />
 *
 * The full Gherkin for this scenario is as follows:
 * <pre style="margin-top: 5px;">
 * WHEN Enter the required fields  and  click on create account button
 * THEN Prepaid Private Account is created successfully
 * </pre>
 */
@Test (
  groups = {"ClearSky", "Scenario"},
  description = "Prepaid private account creation for a new user"
)
@ClearSkyTest (
  id = "",
  scenario = "Prepaid private account creation"
)
public class PrepaidPrivateAccountCreation extends AbstractClearSkyTest {

  /**
   * The {@code Logger} to use in cooperation with all test instances.
   */
  private static final Logger LOG = LoggerFactory.getLogger(PrepaidPrivateAccountCreation.class);

  /**
   * WHEN Enter the required fields  and  click on create account button
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "WHEN Enter the required fields  and  click on create account button"
  )
  @ClearSkyTestMethod (stepNumber = 1)
  public void WHEN_Enter_the_required_fields_and_click_on_create_account_button_0001(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Prepaid private account creation], Step[0 : WHEN Enter the required fields  and  click on create account button]");
    throw new NotYetImplementedException();
  }

  /**
   * THEN Prepaid Private Account is created successfully
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "WHEN_Enter_the_required_fields_and_click_on_create_account_button_0001",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "THEN Prepaid Private Account is created successfully"
  )
  @ClearSkyTestMethod (stepNumber = 2)
  public void THEN_Prepaid_Private_Account_is_created_successfully_0002(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Prepaid private account creation], Step[1 : THEN Prepaid Private Account is created successfully]");
    throw new NotYetImplementedException();
  }
}
