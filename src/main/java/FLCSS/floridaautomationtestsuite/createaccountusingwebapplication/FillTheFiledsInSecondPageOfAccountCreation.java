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
 * THEN User is navigated to third page
 * WHEN Enter the required data in second page
 * </pre>
 */
@Test (
  groups = {"ClearSky", "Scenario"},
  description = ""
)
@ClearSkyTest (
  id = "",
  scenario = "Fill the fileds in second page of Account creation"
)
public class FillTheFiledsInSecondPageOfAccountCreation extends AbstractClearSkyTest {

  /**
   * The {@code Logger} to use in cooperation with all test instances.
   */
  private static final Logger LOG = LoggerFactory.getLogger(FillTheFiledsInSecondPageOfAccountCreation.class);

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
    LOG.info("Test Execution : Scenario[Fill the fileds in second page of Account creation], Step[0 : THEN User is navigated to third page]");
    throw new NotYetImplementedException();
  }

  /**
   * WHEN Enter the required data in second page
   * @param baseUrl the {@code BaseUrl} to navigate to during execution
   * @param dataTable the {@code DataTable} to pull form and other data from
   * @param settings the {@code Settings} currently active for this test
   */
  @Test (
    dependsOnMethods = "THEN_User_is_navigated_to_third_page_0001",
    dataProvider = "getStepParameters",
    dataProviderClass = ClasspathDataProvider.class,
    description = "WHEN Enter the required data in second page"
  )
  @ClearSkyTestMethod (stepNumber = 2)
  public void WHEN_Enter_the_required_data_in_second_page_0002(BaseUrl baseUrl, DataTable dataTable, Settings settings) {
    LOG.info("Test Execution : Scenario[Fill the fileds in second page of Account creation], Step[1 : WHEN Enter the required data in second page]");
    throw new NotYetImplementedException();
  }
}
