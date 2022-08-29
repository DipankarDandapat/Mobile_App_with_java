package testScripts;

import base.BaseTest;
import com.automate.constants.StringConstants;
import com.automate.customannotations.FrameworkAnnotation;
import com.automate.enums.CategoryType;
import pageObject.StudentCreditCheck;
import com.automate.entity.TestData;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class StudentCreditCheckTest extends BaseTest{

    StudentCreditCheck creditCheck;


    @BeforeMethod
    public void initialize() {
        creditCheck = new StudentCreditCheck();
    }

    @FrameworkAnnotation(author = "User-1", category = {CategoryType.REGRESSION, CategoryType.SMOKE})
    @Test(description = "creditBanner")
    public void creditBannerTest(TestData data) {
        String BannerMessage=creditCheck.getBannerText();
        Assert.assertEquals(BannerMessage, StringConstants.Credit_Check_Banner_TITLE, "Assertion for Banner Message");
        creditCheck.isgetCashdisplay();
        creditCheck.clickCreditCheckBanner();
        creditCheck.isCreditCheckLabelDisplay();
        String CreditCheckDescriptionText=creditCheck.getCreditCheckDescriptionText();
        Assert.assertEquals(CreditCheckDescriptionText, StringConstants.Credit_Check_Description, "Assertion for Credit Check Description");
        creditCheck.isCreditCheckIncomeDisplay();
        creditCheck.isCreditCheckResidenceDisplay();
        creditCheck.isCreditCheckAssetsDisplay();
        creditCheck.isCreditCheckContactinfoDisplay();
        creditCheck.clickCreditCheckGetStartedButton();





    }


}


