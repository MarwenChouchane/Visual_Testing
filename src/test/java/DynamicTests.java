import base.BaseTests;
import org.junit.BeforeClass;
import org.junit.Test;

public class DynamicTests extends BaseTests {

    @BeforeClass
    public static void startVisualTestSuite(){
        eyesManager.setBatchName("Dynamic content");
        driver.get(System.getProperty("site.dynamic.url"));
    }

    @Test
    public void testDynamicContent(){
        eyesManager.validateWindow();
    }
}
