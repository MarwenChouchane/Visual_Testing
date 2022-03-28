import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.selenium.Eyes;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SearchPage;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class BaseTests {
    protected static WebDriver driver;
    protected static SearchPage page;
    protected static Eyes eyes;

    @BeforeClass
    public static void setUp() {
        Properties props = System.getProperties();
        try {
            props.load(new FileInputStream(new File("ressource/test.properties")));
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }

        driver = new ChromeDriver();
        initiateEyes();

        //Change this to your own directory
        driver.get("C:\\Users\\Administrator\\IdeaProjects\\Visual_Testing\\website\\index.html");
        page = new SearchPage(driver);
        //driver.get("https://the-internet.herokuapp.com/large");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
        eyes.abortIfNotClosed();
    }

    private static void initiateEyes() {
        eyes = new Eyes();
        eyes.setApiKey(System.getProperty("applitouls.api.key"));
    }

    public void validateWindow(){
        //eyes.open(driver, "Automation Bookstore", Thread.currentThread().getStackTrace()[2].getMethodName());
        eyes.open(driver, "The internet", Thread.currentThread().getStackTrace()[2].getMethodName());
        eyes.setMatchLevel(MatchLevel.LAYOUT);  //MatchLevel = .Strict : default (on peut l'eliminer) ;
        // .content : ne prend pas les couleurs ;.layout : ne prend pas le contenu dynamic (mais meme structure)
        // eyes.setForceFullPageScreenshot(true);  pour scroller vertical et horizental
        eyes.checkWindow();
        eyes.close();
    }

    public void validateElement(By locator){
        eyes.open(driver, "Automation Bookstore", Thread.currentThread().getStackTrace()[2].getMethodName());
        eyes.checkElement(locator);
        eyes.close();
    }
}
