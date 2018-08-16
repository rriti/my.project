package screensForTestFifth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage5 {
    WebDriver driver;
    @FindBy(how = How.XPATH, using = "//*[@id='search_query_top']")
    private WebElement searchButton;
    @FindBy(how = How.XPATH, using = "//button[@name='submit_search']")
    private WebElement submitSearch;

    public HomePage5(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public HomePage5 clickToSearchBox(){
        searchButton.click();
        return this;
    }
    public HomePage5 fillSearchBox(String search){
        searchButton.sendKeys(search);
        return this;
    }
    public SearchResultsPage goToSearchResultsPage(){
        submitSearch.click();
        return new SearchResultsPage(driver);
    }
}
