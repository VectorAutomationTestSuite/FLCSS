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
 * 
 *
 * <br /><br />
 *
 * The full Gherkin for this scenario is as follows:
 * <pre style="margin-top: 5px;">
 * THEN Postpaid Government account is created successfully
 * WHEN We enter the required fields and create the account
 * </pre>
 */
@Test (
  groups = {"ClearSky", "Scenario"},
  description = ""
)
@ClearSkyTest (
  id = "",
  scenario = "Postpaid Government account creation"
)
public class PostpaidGovernmentAccountCreation extends AbstractClearSkyTest {

  /**
   * The {@code Logger} to use in cooperation with all test instances.
   */
  private static final Logger LOG = LoggerFactory.getLogger(PostpaidGovernmentAccountCreation.class);

  /**
   * THEN Postpaid Government account is created successfully
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "THEN Postpaid Government account is created successfully"
  )
  @ClearSkyTestMethod (stepNumber = 1)
  public void THEN_Postpaid_Government_account_is_created_successfully_0001(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Postpaid Government account creation], Step[0 : THEN Postpaid Government account is created successfully]");
    throw new NotYetImplementedException();
  }

  /**
   * WHEN We enter the required fields and create the account
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "THEN_Postpaid_Government_account_is_created_successfully_0001",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "WHEN We enter the required fields and create the account"
  )
  @ClearSkyTestMethod (stepNumber = 2)
  public void WHEN_We_enter_the_required_fields_and_create_the_account_0002(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Postpaid Government account creation], Step[1 : WHEN We enter the required fields and create the account]");
    throw new NotYetImplementedException();
  }
}
