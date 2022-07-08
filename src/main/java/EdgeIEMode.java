import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class EdgeIEMode {

    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver", "<<IE-Driver-Path>>");

        InternetExplorerOptions ieOptions = new InternetExplorerOptions();
        ieOptions.attachToEdgeChrome();
        ieOptions.withEdgeExecutablePath("msedge.exe");     // Edge Browser directory path
        ieOptions.addCommandSwitches("--user-data-dir=\"C:\\ChromeBrowser_profiles\\Profile_edge\"");
        WebDriver driver = new InternetExplorerDriver(ieOptions);

        driver.get("https://github.com/");
        driver.close();
    }
}
