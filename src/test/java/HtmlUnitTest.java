import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HtmlUnitTest {

    @Test
    public void findElement() {
        WebDriver webDriver = new HtmlUnitDriver(true);
        webDriver.get("https://www.google.com");
        webDriver.findElement(By.name("q"));

}
}
