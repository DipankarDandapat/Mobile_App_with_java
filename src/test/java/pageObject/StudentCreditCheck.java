package pageObject;
import com.automate.enums.WaitStrategy;
import pageObject.screen.ScreenActions;
import com.automate.entity.LoginData;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public final class StudentCreditCheck extends ScreenActions{
    @AndroidFindBy(xpath = "//*[@resource-id='com.mpokket.app:id/tv_desc']")
    private static MobileElement creditIncreaseBanner;

    @AndroidFindBy(xpath = "//*[@resource-id='com.mpokket.app:id/tv_getCash']")
    private static MobileElement getCash;


    @AndroidFindBy(xpath = "//*[@resource-id='com.mpokket.app:id/tv_title']")
    private static MobileElement creditCheck_Label;

    //Message: Share following information to get higher borrowing limit
    @AndroidFindBy(xpath = "//*[@resource-id='com.mpokket.app:id/tv_desc']")
    private static MobileElement creditCheck_Description;

    @AndroidFindBy(xpath = "//*[@resource-id='com.mpokket.app:id/tv_cash']")
    private static MobileElement creditCheck_Income;

    @AndroidFindBy(xpath = "//*[@resource-id='com.mpokket.app:id/tv_residence']")
    private static MobileElement creditCheck_Residence;

    @AndroidFindBy(xpath = "//*[@resource-id='com.mpokket.app:id/tv_asset']")
    private static MobileElement creditCheck_Assets;

    @AndroidFindBy(xpath = "//*[@resource-id='com.mpokket.app:id/tv_additional']")
    private static MobileElement creditCheck_Contactinfo;

    @AndroidFindBy(xpath = "//*[@resource-id='com.mpokket.app:id/bt_proceed']")
    private static MobileElement creditCheck_GetStarted_Button;

    //Message:How much pocket money do you get every month from your parents
    @AndroidFindBy(xpath = "//*[@resource-id='com.mpokket.app:id/tv_pocket_money']")
    private static MobileElement creditCheck_Pocket_Money_Description;

    @AndroidFindBy(xpath = "//*[@resource-id='com.mpokket.app:id/et_pocket_money']")
    private static MobileElement creditCheck_Enter_Pocket_Money;

    @AndroidFindBy(xpath = "//*[@resource-id='com.mpokket.app:id/tv_next']")
    private static MobileElement creditCheck_Next_Button;









    public boolean isgetCashdisplay() {
        return isElementDisplayed(getCash,WaitStrategy.VISIBLE);
    }
    public void clickCreditCheckBanner(){
        click(creditIncreaseBanner,"Banner");
    }
    public String getBannerText() {
        return getText(creditIncreaseBanner, WaitStrategy.VISIBLE);
    }

    public boolean isCreditCheckLabelDisplay() {
        return isElementDisplayed(creditCheck_Label,WaitStrategy.VISIBLE);
    }

    public String getCreditCheckDescriptionText() {
        return getText(creditCheck_Description, WaitStrategy.VISIBLE);
    }

    public boolean isCreditCheckIncomeDisplay() {
        return isElementDisplayed(creditCheck_Income,WaitStrategy.VISIBLE);
    }

    public boolean isCreditCheckResidenceDisplay() {
        return isElementDisplayed(creditCheck_Residence,WaitStrategy.VISIBLE);
    }

    public boolean isCreditCheckAssetsDisplay() {
        return isElementDisplayed(creditCheck_Assets,WaitStrategy.VISIBLE);
    }

    public boolean isCreditCheckContactinfoDisplay() {
        return isElementDisplayed(creditCheck_Label,WaitStrategy.VISIBLE);
    }


    public void clickCreditCheckGetStartedButton(){
        click(creditCheck_GetStarted_Button,"GetStarted Button");
    }


}

