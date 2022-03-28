import org.junit.Assert;
import org.junit.Test;

public class SearchTests extends BaseTests{

    @Test
    public void testSearchByFullTitle(){
        String title = "test";
        page.search(title);
        //Assert.assertTrue(title+"is not visible", page.isBookVisible(title));
        validateWindow();
    }
}
