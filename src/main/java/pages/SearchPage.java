package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.stream.Collectors;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfElementsToBe;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class SearchPage {
    private WebDriver driver;
    private By searchBar = By.id("searchBar");
    private By visibleBooks = By.xpath("//li[not(contains(@class, 'ui-screen-hidden'))]");
    private By hiddenBooks = By.xpath("//li[contains(@class, 'ui-screen-hidden')]");
    private By titleAttribute = By.tagName("h2");

    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

    public void search(String text) {
        search(text, true);
    }

    public void search(String text, boolean waitForHidden) {
        clearSearch();
        driver.findElement(searchBar).sendKeys(text);

        if(waitForHidden) {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(presenceOfElementLocated(hiddenBooks));
        }
    }

    public void clearSearch() {
        driver.findElement(searchBar).clear();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(numberOfElementsToBe(hiddenBooks, 0));
    }

    public int getNumberOfVisibleBooks() {
        return findVisibleBooks().size();
    }

    public boolean isBookVisible(String title){
        List<WebElement> books = findVisibleBooks();

        for (WebElement book : books){
            if (title.equalsIgnoreCase(book.findElement(titleAttribute).getText())){
                System.out.println(book.findElement(titleAttribute).getText());
                return true;
            }
        }
        return false;
    }

    private List<WebElement> findVisibleBooks(){
        return driver.findElements(visibleBooks);
    }

}
