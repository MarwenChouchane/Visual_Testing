import base.BaseTests;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.SortableDataTablesPage;

public class ScrollTests extends BaseTests {

    @BeforeClass
    public static void startVisualTestSuite(){
        eyesManager.setBatchName("Large dom");
        driver.get(System.getProperty("site.largedom.url"));
    }

    @Test
    public void testLargeDom(){
        eyesManager.validateWindow();
    }
}
