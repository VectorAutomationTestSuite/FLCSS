package FLCSS.floridaautomationtestsuite.siebelaccountcreation;

import FLCSS.floridaautomationtestsuite.libraries.FunctionLibrary;
import com.vrds.clearsky.api.AbstractClearSkyTest;
import com.vrds.clearsky.api.ClearSkyTest;
import com.vrds.clearsky.api.ClearSkyTestMethod;
import com.vrds.clearsky.api.dataprovider.ClasspathDataProvider;
import com.vrds.clearsky.api.parameters.BaseUrl;
import com.vrds.clearsky.api.parameters.DataTable;
import com.vrds.clearsky.api.parameters.Settings;
import org.joda.time.DateTime;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
        id = "10002",
        scenario = "Siebel Account Creation", tags = {"@ID=10002"}
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
    FunctionLibrary.ObjDriver = browser;
    System.out.println("Siebel account creation test is started");
    //Launching browser and opening siebel application
    FunctionLibrary.launchBrowser(baseUrl.getUrl(BaseUrl.NONE).toString(), "Launching siebel app");

    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[0 : GIVEN Launch the siebel application]");
    // throw new NotYetImplementedException();
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
    //Enter user name
    FunctionLibrary.setText("id=s_swepi_1",dataTable.get("UserId"), "Entering username");
    //Enter password
    FunctionLibrary.setText("id=s_swepi_2",dataTable.get("Password"), "Entering password");
    //Click login button
    FunctionLibrary.clickObject("id=s_swepi_22", "", "Click sign in button");

    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[1 : WHEN Enter the UserId, Password and click Login button]");
//   throw new NotYetImplementedException();
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
    //Loading dashboard is taking 1minute to 2 minutes. so used WebDriverWait
    WebDriverWait wait = new WebDriverWait(browser,120);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//div[@class='Welcome'])[1]")));

    assert FunctionLibrary.verifyWebElementExist("xpath=(.//div[@class='Welcome'])[1]","Verify Account Opening element");

    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[2 : THEN Home page should be displayed]");
//   throw new NotYetImplementedException();
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
    //Clicking Account opening Tab
    FunctionLibrary.clickObject("xpath=//*[contains(text(),'Account Opening') and @class='ui-tabs-anchor']","","Clicking new button");
    //Clicking New button
    FunctionLibrary.clickObject("xpath=.//*[@title='Private:New']","","Clicking new button");

    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[3 : WHEN Click on Account Opening button followed by New button]");
//   throw new NotYetImplementedException();
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

    assert FunctionLibrary.verifyWebElementExist("xpath=.//*[@aria-label='Agency']","Account opening page is opened");
    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[4 : THEN Account Opening page should be displayed]");
//   throw new NotYetImplementedException();
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

    //entering agency
    FunctionLibrary.setText("xpath=.//*[@aria-label='Agency']",dataTable.get("Agency"),"Entering Agency");
    //entering pin
    FunctionLibrary.setText("xpath=.//*[@aria-labelledby='VAT_registration_number_Label']",dataTable.get("Pin"),"Enter PAN");
    //clicking Security question dropdown icon
    FunctionLibrary.clickObject("xpath=.//*[@aria-labelledby='VehicleCount_Label']//following::span[1]","","Clicking Security question drop down");
    //Selecting the security question
    FunctionLibrary.clickObject("xpath=(//*[contains(text(),'"+dataTable.get("SecurityQuestion")+"')])[1]","","Selecting Middle name of youngest child");
    //entering security answer
    FunctionLibrary.setText("xpath=.//*[@aria-labelledby='DeviceSoldCount_Label']",dataTable.get("SecurityAnswer"),"Enter secuirty qestion answer");
    //entering email id
    FunctionLibrary.setText("xpath=.//*[@aria-label='Email Address']",dataTable.get("Email"),"Enter email");
    //entering statement type
    FunctionLibrary.setText("xpath=.//*[@aria-labelledby='Statement_Delivery_Frequency_Label']",dataTable.get("StatementFreq"),"Statement type");
    //entering preferred language
    FunctionLibrary.setText("xpath=.//*[@aria-labelledby='Correspondence_Language_Preference_Label']",dataTable.get("LanguagePref"),"Select language preference");
    //save the personal details
    FunctionLibrary.clickObject_With_Wait("xpath=.//*[@title='Private:Save']","10","Clicking Save button");

    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[5 : WHEN Enter Account Type and Access Information details and save the application]");
//   throw new NotYetImplementedException();
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

    WebDriverWait wait = new WebDriverWait(browser,60);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='s_3_rc' and contains(text(),'1 of 1+')]")));

    assert FunctionLibrary.verifyWebElementExist("xpath=.//*[@id='s_3_rc' and contains(text(),'1 of 1+')]","Verify row is added or not for contacts");

    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[6 : THEN Account type and Access Infromation section should be saved]");
//   throw new NotYetImplementedException();
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

    //clicking the New button in contacts section
    FunctionLibrary.clickObject("xpath=.//*[@title='Contacts:New']","","Clicking Contact new button");
    //entering lastname, firstname and phone number then click save button
    FunctionLibrary.clickObject("xpath=.//*[@aria-labelledby='s_1_l_Last_Name']","","Clicking last name field");
    FunctionLibrary.setText("xpath=.//*[@id='1_Last_Name']",dataTable.get("LastName"),"Enter last name");
    FunctionLibrary.clickObject("xpath=.//*[@aria-labelledby='s_1_l_First_Name']","","Clicking frist name field");
    FunctionLibrary.setText("xpath=.//*[@id='1_First_Name']",dataTable.get("FirstName"),"Entering first name");
    FunctionLibrary.clickObject("xpath=.//*[@aria-labelledby='s_1_l_Contact_Phone_Number']","","Clicking phone number filed");
    FunctionLibrary.setText("xpath=.//*[@id='1_Contact_Phone_Number']",dataTable.get("CellPhone"),"Enter phone number");

    //handle the phone number format pop-up alert
    try {
      WebDriverWait wait = new WebDriverWait(browser,15);
      wait.until(ExpectedConditions.alertIsPresent());
      Alert alert = browser.switchTo().alert();
      alert.accept();
    } catch (Exception e) {
      //exception handling
    }

    FunctionLibrary.clickObject("xpath=.//*[@title='Contacts:Save']","","Clicking Save button");
    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[7 : WHEN Click on New button, enter the Contact details and save the application]");
//   throw new NotYetImplementedException();
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

    WebDriverWait wait = new WebDriverWait(browser,60);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='s_1_rc' and contains(text(),'1 - 1 of 1')]")));

    assert FunctionLibrary.verifyWebElementExist("xpath=.//*[@id='s_1_rc' and contains(text(),'1 - 1 of 1')]","Verify row is added or not for contacts");

    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[8 : THEN Contact section should be saved]");
//   throw new NotYetImplementedException();
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

    //Java script executor to check whether page load is completed or not
    JavascriptExecutor js = (JavascriptExecutor)FunctionLibrary.ObjDriver;
    js.executeScript("return document.readyState").toString().equals("complete");///

    //give better solution
    //Java script executor also not working in this case. so added Thread.sleep for 5 seconds
    //FunctionLibrary.ObjDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // click new button for Address section, enter required fields and then click save button
    FunctionLibrary.clickObject("xpath=//button[@title='Addresses:New']","","Click Address new button");
    FunctionLibrary.clickObject("xpath=.//*[@id='1_Address_Type']//following::span[1]","","Clicking Address type drop down");
    FunctionLibrary.clickObject("xpath=(//*[contains(text(),'"+dataTable.get("AddressType")+"')])[1]","","Selecting mailing address type");
    FunctionLibrary.clickObject("xpath=.//*[@id='1_s_2_l_Street_Address']","","Clicking street address1");
    FunctionLibrary.setText("xpath=.//*[@id='1_Street_Address']",dataTable.get("AddressLine1"),"Entering street address1");
    FunctionLibrary.clickObject("xpath=.//*[@id='1_s_2_l_City']","","Clicking city field");
    FunctionLibrary.setText("xpath=.//*[@id='1_City']",dataTable.get("City"),"Enter city");
    FunctionLibrary.clickObject("xpath=.//*[@id='1_s_2_l_Postal_Code']","","Clicking postal code filed");
    FunctionLibrary.setText("xpath=.//*[@id='1_Postal_Code']",dataTable.get("ZipCode"),"Entering postal code");
    FunctionLibrary.clickObject("xpath=.//*[@id='1_s_2_l_State']","","Clicking state field");
    FunctionLibrary.setText("xpath=.//*[@id='1_State']",dataTable.get("State"),"Entering state value");
    FunctionLibrary.clickObject("xpath=.//*[@id='1_s_2_l_Country']","","Clicking country field");
    FunctionLibrary.setText("xpath=.//*[@id='1_Country']",dataTable.get("Country"),"Entering country field");
    FunctionLibrary.clickObject("xpath=.//*[@title='Addresses:Save']","","Clicking address save button");

    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[9 : WHEN Click on New button, enter the Address details and save the application]");
//   throw new NotYetImplementedException();
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


    WebDriverWait wait = new WebDriverWait(browser,60);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='s_2_rc' and contains(text(),'1 - 1 of 1')]")));

    assert FunctionLibrary.verifyWebElementExist("xpath=.//*[@id='s_2_rc' and contains(text(),'1 - 1 of 1')]","Verify row is added or not for address");

    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[10 : THEN Adress section should be saved]");
//   throw new NotYetImplementedException();
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

    WebDriverWait wait = new WebDriverWait(browser,60);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Replenishments')]")));

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    FunctionLibrary.clickObject("xpath=//a[contains(text(),'Replenishments')]","","Clicking Replenishment button");
    FunctionLibrary.clickObject("xpath=.//*[@title='Account Replenishment Info List:New']","","Clicking Replenishment new button");
    FunctionLibrary.setCheckBox("xpath=.//*[@id='IsPrimary']",dataTable.get("IsPrimary"),"Select isPrimary checkbox");
    FunctionLibrary.selectDropDownListByValue("xpath=.//*[@id='PaymentType']",dataTable.get("RebillPayType"),"Select list box Payment type");
    FunctionLibrary.clickObject("xpath=.//*[@id='saveReBlInf']","","Clicking Replenishment save button");

    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[11 : WHEN Click on New button,enter the Replenishment details and save the application]");
//   throw new NotYetImplementedException();
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

    WebDriverWait wait = new WebDriverWait(browser,60);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='s_1_rc' and contains(text(),'1 - 1 of 1')]")));

    assert FunctionLibrary.verifyWebElementExist("xpath=.//*[@id='s_1_rc' and contains(text(),'1 - 1 of 1')]","Verify row is added or not for replenishment");

    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[12 : THEN Replenishment section should be saved]");
//   throw new NotYetImplementedException();
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

    FunctionLibrary.clickObject("xpath=//a[contains(text(),'Vehicles')]","","Clicking vehicles tab");
    FunctionLibrary.clickObject("xpath=.//*[@title='Vehicles:New']","","Clicking vehicles new button");
    FunctionLibrary.setText("xpath=.//*[@id='1_Plate_Number']",dataTable.get("PlateNumber")+ DateTime.now().getMillisOfSecond(),"Entering plate number");
    FunctionLibrary.clickObject("xpath=.//*[@id='1_s_1_l_Plate_State']","","Clicking plate state field");
    FunctionLibrary.setText("xpath=.//*[@id='1_Plate_State']",dataTable.get("PlateState"),"Enter plate stated");
    FunctionLibrary.clickObject("xpath=.//*[@id='1_s_1_l_Plate_Type']","","Clicking plate type");
    FunctionLibrary.setText("xpath=.//*[@id='1_Plate_Type']",dataTable.get("PlateType"),"Enter plate type");
    FunctionLibrary.clickObject("xpath=.//*[@id='1_s_1_l_Plate_Country']","","Clicking plate country");
    FunctionLibrary.setText("xpath=.//*[@id='1_Plate_Country']",dataTable.get("PlateCountry"),"Enter plate country name");
    FunctionLibrary.clickObject("xpath=.//*[@id='1_s_1_l_Vehicle_Type']","","Clicking vehicle type");
    FunctionLibrary.setText("xpath=.//*[@id='1_Vehicle_Type']",dataTable.get("VehicleType"),"Enter vehicle type");
    FunctionLibrary.clickObject("xpath=.//*[@id='1_s_1_l_Year_of_Vehicle']","","Clicking year of vechicle");
    FunctionLibrary.setText("xpath=.//*[@id='1_Year_of_Vehicle']",dataTable.get("YearOfVehicle"),"Entering year of vehicle");
    FunctionLibrary.clickObject("xpath=.//*[@id='1_s_1_l_Vehicle_Make']","","Clicking vehicle make");
    FunctionLibrary.setText("xpath=.//*[@id='1_Vehicle_Make']",dataTable.get("VehicleMake"),"Entering vehicle make");
    FunctionLibrary.clickObject("xpath=.//*[@id='1_s_1_l_Vehicle_Model']","","Clicking vehicle model");
    FunctionLibrary.setText("xpath=.//*[@id='1_Vehicle_Model']",dataTable.get("VehicleModel"),"Enter vehcile modle");
    FunctionLibrary.clickObject("xpath=.//*[@title='Vehicles:Save']","","Clicking vehicle save buttton");

    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[13 : WHEN Click on New button,enter the Vehicle details and save the application]");
//   throw new NotYetImplementedException();
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

    WebDriverWait wait = new WebDriverWait(browser,60);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='s_1_rc' and contains(text(),'1 - 1 of 1')]")));

    assert FunctionLibrary.verifyWebElementExist("xpath=.//*[@id='s_1_rc' and contains(text(),'1 - 1 of 1')]","Verify row is added or not for vechiles");

    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[14 : THEN Vehicle section should  be saved]");
//   throw new NotYetImplementedException();
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

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    FunctionLibrary.clickObject("xpath=//a[contains(text(),'Device Request')]","","Clicking Device Request tab");
    FunctionLibrary.clickObject("xpath=.//*[@title='Device Requests:New']","","Clicking Device Requests new button");
    FunctionLibrary.setText("xpath=//*[@id='1_Smart_Issue_Id']",dataTable.get("DeviceDescription"),"Enter smart issue id");
    FunctionLibrary.clickObject("xpath=.//*[@id='1_s_1_l_Quantity']","","Clicing Quantity field");
    FunctionLibrary.setText("xpath=.//*[@id='1_Quantity']",dataTable.get("VehicleQuantity"),"Entering quantity of tags");
    FunctionLibrary.clickObject("xpath=.//*[@title='Device Requests:Save']","","Clicking Device Requests Save button");

    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[15 : WHEN Click on New button,enter the Device Request details and save the application]");
//   throw new NotYetImplementedException();
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

    WebDriverWait wait = new WebDriverWait(browser,60);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='s_1_rc' and contains(text(),'1 - 1 of 1')]")));

    assert FunctionLibrary.verifyWebElementExist("xpath=.//*[@id='s_1_rc' and contains(text(),'1 - 1 of 1')]","Verify row is added or not for device request");

    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[16 : THEN Device Request section should be saved]");
//   throw new NotYetImplementedException();
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


    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    //Click Plans tab
    FunctionLibrary.clickObject("xpath=//a[contains(text(),'Plans')]","","Clicking the Plans tab");
    FunctionLibrary.clickObject("xpath=.//*[@title='Pay']","","Click on Pay tab");
    FunctionLibrary.clickObject("xpath=.//*[@title='Payments List:New']","","Clicking plans new button");
    FunctionLibrary.selectDropDownListByValue("xpath=.//select[@id='PaymentType']",dataTable.get("ReBillPayType"),"Select Payment type");

    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[17 : WHEN Click on New button,enter the Plan Details and save the application]");
//   throw new NotYetImplementedException();
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

    FunctionLibrary.setText("xpath=.//input[@id='BankNum']",dataTable.get("BankAccountNum"),"Enter bank number");
    FunctionLibrary.setText("xpath=.//input[@id='RoutingNum']",dataTable.get("BankRoutingNum"),"Enter routing number");
    FunctionLibrary.setText("xpath=.//input[@id='CCFirstName']",dataTable.get("FirstName"),"Enter bank account first name");
    FunctionLibrary.setText("xpath=.//input[@id='CCLastName']",dataTable.get("LastName"),"Enter bank account last name");
    FunctionLibrary.setText("xpath=.//input[@id='BlAddress']",dataTable.get("StreetAddress"),"Enter address number");
    FunctionLibrary.setText("xpath=.//input[@id='BlZipCode']",dataTable.get("ZipCode"),"Enter zip code");
    FunctionLibrary.setText("xpath=.//input[@id='BlCity']",dataTable.get("City"),"Enter city name");
    FunctionLibrary.selectDropDownListByValue("xpath=.//select[@id='BlState']",dataTable.get("State"),"Select state");
    FunctionLibrary.selectDropDownListByValue("xpath=.//select[@id='BlCountry']",dataTable.get("Country"),"Select country");
    FunctionLibrary.clickObject("xpath=//button[@id='saveReBlInf']","","Clicking save button");

    //handle the "Do you want to updated the credit card details as primary payment method....." format pop-up alert
    //2 popup: write their  information here

    try {
      WebDriverWait wait1 = new WebDriverWait(FunctionLibrary.ObjDriver,10);
      wait1.until(ExpectedConditions.alertIsPresent());
      Alert alert1 = FunctionLibrary.ObjDriver.switchTo().alert();
      System.out.println("Popup is displayed with text" + alert1.getText());
      alert1.accept();
    } catch (Exception e){
      //System.out.println("Account is not created - Test is failed");
    }

    if(browser.findElement(By.xpath("//button[@id='btn-accept']")).isDisplayed())
    {
      browser.findElement(By.xpath("//button[@id='btn-accept']")).click();
    }

    FunctionLibrary.clickObject("xpath=//button[@title='Payments List:Save']","","Clicking Save button");
    FunctionLibrary.clickObject("xpath=//button[@title='Payments List:Process Pay']","","Clicking Process Pay button");

    if(browser.findElement(By.xpath("//button[@id='btn-accept']")).isDisplayed())
    {
      browser.findElement(By.xpath("//button[@id='btn-accept']")).click();
    }

    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[18 : AND Provides the Payment details and save the application]");
//   throw new NotYetImplementedException();
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

    //handle the "Account created confirmation" pop-up alert
    try {
      WebDriverWait wait = new WebDriverWait(FunctionLibrary.ObjDriver,70);
      wait.until(ExpectedConditions.alertIsPresent());
      Alert alert = FunctionLibrary.ObjDriver.switchTo().alert();
      System.out.println("Popup is displayed with text" + alert.getText());
      alert.accept();
    } catch (Exception e) {
      //exception handling
      System.out.println("Account is not created - Test is failed");
    }

    FunctionLibrary.verifyWebElementExist("xpath=//input[@aria-label='Acct #']","Verify Account  number field");
    int AccountNumber =0;
    AccountNumber = Integer.parseInt(FunctionLibrary.getText("xpath=//input[@aria-label='Acct #']","","Get Account number"));


    System.out.println("Created account number: "+ AccountNumber +".");
    System.out.println("Siebel Account Creation test is completed.");

    LOG.info("Test Execution : Scenario[Siebel Account Creation], Step[19 : THEN Account should be created successfully]");
//   throw new NotYetImplementedException();
  }
}