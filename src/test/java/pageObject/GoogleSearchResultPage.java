package pageObject;

import com.automate.driver.manager.DriverManager;
import pageObject.screen.ScreenActions;

public final class GoogleSearchResultPage extends ScreenActions {

	public String getSearchResultsPageTitle() {
		return DriverManager.getDriver().getTitle();
	}

}
