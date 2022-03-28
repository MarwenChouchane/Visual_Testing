import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class SearchTests extends BaseTests{

    @Test
    public void testSearchByFullTitle(){
        String title = "Agile testing";
        page.search(title);
        //Assert.assertTrue(title+"is not visible", page.isBookVisible(title));
        validateWindow();
    }

    @Test
    public void testSearchByFullTitle_Element(){
        String title = "Agile testing";
        page.search(title);
        validateElement(By.id("pid3"));
        Assert.assertEquals("Number of books returned ", 1, page.getNumberOfVisibleBooks());
    }
}
