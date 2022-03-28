import base.BaseTests;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.SearchPage;
import pages.SortableDataTablesPage;

public class SearchTests extends BaseTests {

    private SearchPage page = new SearchPage(driver);

    @BeforeClass
    public static void startVisualTestSuite(){
        eyesManager.setBatchName("Search Title");
        driver.get(System.getProperty("site.bookstore.url"));
    }


    @Test
    public void testSearchByFullTitle(){
        String title = "Agile testing";
        page.search(title);
        //Assert.assertTrue(title+"is not visible", page.isBookVisible(title));
        eyesManager.validateWindow();
    }

    @Test
    public void testSearchByFullTitle_Element(){
        String title = "Agile testing";
        page.search(title);
        eyesManager.validateElement(By.id("pid3"));
        Assert.assertEquals("Number of books returned ", 1, page.getNumberOfVisibleBooks());
    }
}
