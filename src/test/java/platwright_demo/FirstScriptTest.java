package platwright_demo;

import org.testng.annotations.Test;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class FirstScriptTest {

    @Test
    public void firstTest() {
        Playwright playwright =  Playwright.create();
        Browser browser;
        Page page;
            browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            page = browser.newPage();
            page.navigate("http://playwright.dev");
                System.out.println("Completed");
                browser.close();
    }
    
}
