package FLCSS;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * A simple sanity check that is intended to make sure that the environment is set
 * up properly for the ClearSky tests to actually execute.  This is a basic class
 * that also provides a sample showing how you can add additional classes and some
 * classes of your own to make working with the project easier as you go along.  You
 * should always separate your core logic from your tests, even in these scenarios.
 *
 * <br><br>
 *
 * Please leave this class in place so we have at least one test to run that will
 * succeed in the project.  Even if you have no other features, this will allow for
 * you to build &amp; submit the project to the ClearSky execution framework in
 * order to make sure things are configured properly.
 */
@Test (
  groups = {"ClearSky", "Hello, Sanity", "Hello, Sample!"},
  description = "A sample test that will run on the the ClearSky system."
)
public class ClearSkySanityTest {

  /**
   * The {@code Logger} to use in cooperation with all test instances.
   */
  private static final Logger LOG = LoggerFactory.getLogger(ClearSkySanityTest.class);

  /**
   * Tests our saying of "<em>Hello</em>" to various names in a successful fashion.
   * This provides an example of a {@code @DataProvider} implementation as well as
   * some of the basics for the TestNG framework operations.  It's a little overly
   * complex, but it illustrates some of the capabilities in the system even on such
   * a simple task.
   */
  @Test(
    threadPoolSize = 5,
    dataProvider = "getValidNames",
    description = "Tests our saying of \"Hello<\" to various names in a successful fashion."
  )
  public void testHelloSuccess(final String name, final String expected) {
    long timeStart = System.currentTimeMillis();
    String actual = new ClearSkySanity().getHello(name);
    Assert.assertEquals(actual, expected, "Invalid \"Hello\" message was generated!");

    long duration = System.currentTimeMillis() - timeStart;
    LOG.info(String.format("ClearSky Sanity Test : Hello : Duration[%s ms], Message[\"%s\"]", duration, actual));
  }

  /**
   * Tests the handling of failures when we provide invalid data to our test method.
   * Basically we are showing how we can test negative scenarios in the snazzy test
   * framework we are using (TestNG).  This sample allows you to see how to use some
   * basic data to test these and expect an exception.
   * @param failureString the string that we are sure will result in failure
   */
  @Test (
    expectedExceptions = IllegalArgumentException.class,
    dataProvider = "getInvalidNames",
    description = "Shows how we can test negative scenarios in the TestNG framework."
  )
  public void testHelloFailure(final String failureString) {
    new ClearSkySanity().getHello(failureString);
  }

  /**
   * Retrieves a list of valid name pairs that we expect our "happy path" test to be
   * able to handle.  This includes some oddities in the names so that you can see
   * that the function is actually working in the class.  We also provide the
   * expected result so that you can see what is going to happen side-by-side in our
   * example.
   * @return a list of valid name pairs that we expect our "happy path" test to be
   * able to handle
   */
  @DataProvider (name = "getValidNames", parallel = true)
  public static Object[][] getValidNames() {
    return new Object[][] {
      {"Woodrow     Weld    ", "Hello, WOODROW WELD!"},
      {"\tDeNiTa      \n    LeIB", "Hello, DENITA LEIB!"},
      {"Marlin Monarrez", "Hello, MARLIN MONARREZ!"},
      {"Candis Wolpert", "Hello, CANDIS WOLPERT!"},
      {"Darla Concannon", "Hello, DARLA CONCANNON!"},
      {"Carter Councill", "Hello, CARTER COUNCILL!"},
      {"Venessa Schatz", "Hello, VENESSA SCHATZ!"},
      {"Lourie Bleau", "Hello, LOURIE BLEAU!"},
      {"Brittni Lamacchia", "Hello, BRITTNI LAMACCHIA!"},
      {"Paulita Goehring", "Hello, PAULITA GOEHRING!"},
      {"Ardell Desai", "Hello, ARDELL DESAI!"},
      {"Corrina Knaub", "Hello, CORRINA KNAUB!"},
      {"Trula Strite", "Hello, TRULA STRITE!"},
      {"Mckinley Albertini", "Hello, MCKINLEY ALBERTINI!"},
      {"Velma Laurich", "Hello, VELMA LAURICH!"},
      {"Dinah Ciulla", "Hello, DINAH CIULLA!"},
      {"Pam Delapp", "Hello, PAM DELAPP!"},
      {"Ardis Rhoden", "Hello, ARDIS RHODEN!"},
      {"Edith Woltz", "Hello, EDITH WOLTZ!"},
      {"Eloise Coombs", "Hello, ELOISE COOMBS!"},
      {"Clyde Prichard", "Hello, CLYDE PRICHARD!"},
      {"Brittny Buttram", "Hello, BRITTNY BUTTRAM!"},
      {"Ghislaine Osby", "Hello, GHISLAINE OSBY!"},
      {"Emeline Speegle", "Hello, EMELINE SPEEGLE!"},
      {"Ronald Jasso", "Hello, RONALD JASSO!"},
      {"Shantae Wax", "Hello, SHANTAE WAX!"},
      {"Consuela Farner", "Hello, CONSUELA FARNER!"},
      {"Rowena Devera", "Hello, ROWENA DEVERA!"},
      {"Maria Thibeault", "Hello, MARIA THIBEAULT!"},
      {"Lashaunda Mumford", "Hello, LASHAUNDA MUMFORD!"},
      {"Darlena Reagan", "Hello, DARLENA REAGAN!"},
      {"Angel Hisle", "Hello, ANGEL HISLE!"},
      {"Danika Groen", "Hello, DANIKA GROEN!"},
      {"Claude Kole", "Hello, CLAUDE KOLE!"},
      {"Numbers Pulsifer", "Hello, NUMBERS PULSIFER!"},
      {"Latanya Croswell", "Hello, LATANYA CROSWELL!"},
      {"Verlene Anastasio", "Hello, VERLENE ANASTASIO!"},
      {"Nathanial Santistevan", "Hello, NATHANIAL SANTISTEVAN!"},
      {"Sari Coman", "Hello, SARI COMAN!"},
      {"Troy Dufresne", "Hello, TROY DUFRESNE!"},
      {"Katheryn Collard", "Hello, KATHERYN COLLARD!"},
      {"Bo Kelson", "Hello, BO KELSON!"},
      {"Celestine Kight", "Hello, CELESTINE KIGHT!"},
      {"Florene Sloss", "Hello, FLORENE SLOSS!"},
      {"Betsy Brunton", "Hello, BETSY BRUNTON!"},
      {"Niki Bryce", "Hello, NIKI BRYCE!"},
      {"Mi Walley", "Hello, MI WALLEY!"},
      {"Karlyn Darling", "Hello, KARLYN DARLING!"},
      {"Chantal Chapple", "Hello, CHANTAL CHAPPLE!"},
      {"Jermaine Mizzell", "Hello, JERMAINE MIZZELL!"},
      };
  }

  /**
   * Retrieves a list of names that we know to be invalid that will cause errors.
   * @return a list of names that we know to be invalid that will cause errors
   */
  @DataProvider (name = "getInvalidNames")
  public static Object[][] getInvalidNames() {
    return new Object[][]{{null}, {" "}, {"\t\t\n\r\n"}};
  }
}
