package pages.demoqaPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BuyMacPage;
import utils.Printer;
import utils.WebUtilities;
import java.util.List;

public class AutomationPractisePage extends WebUtilities {
    Printer log = new Printer(BuyMacPage.class);

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "userEmail")
    public WebElement email;

    @FindBy(css = "[for=\"gender-radio-1\"]")
    public WebElement male;

    @FindBy(css = "[for=\"gender-radio-2\"]")
    public WebElement female;

    @FindBy(css = "[for=\"gender-radio-3\"]")
    public WebElement other;

    @FindBy(id = "userNumber")
    public WebElement phoneNumber;

    @FindBy(id = "dateOfBirthInput")
    public WebElement dateOfBirth;

    @FindBy(css = ".react-datepicker__month-select option")
    public List<WebElement>  monthList;

    @FindBy(css = ".react-datepicker__year-select option")
    public List<WebElement> yearList;

    @FindBy(xpath = "//div[contains(@class, \"react-datepicker__day--\") and not(contains(@class, \"outside-month\"))]")
    public List<WebElement> dayList;

    @FindBy(id = "subjectsInput")
    public WebElement subjects;

    @FindBy(xpath = "//div[contains(@id, \"react-select-3\")]")
    public List<WebElement> stateList;

    @FindBy(xpath = "//div[contains(@id, \"react-select-4\")]")
    public List<WebElement> cityList;

    @FindBy(id = "react-select-2-option-0")
    public WebElement subjectOption;

    @FindBy(css = "path[xpath=\"1\"]")
    public WebElement adsBannerOnFooter;

    @FindBy(css = "[for=\"hobbies-checkbox-1\"]")
    public WebElement sports;

    @FindBy(id = "uploadPicture")
    public WebElement uploadPicture;

    @FindBy(id = "hobbies-checkbox-2")
    public WebElement reading;

    @FindBy(id = "hobbies-checkbox-3")
    public WebElement music;

    @FindBy(id = "currentAddress")
    public WebElement address;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "state")
    public WebElement state;

    @FindBy(id = "submit")
    public WebElement submit;

}
