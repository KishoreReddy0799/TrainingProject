import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","/Users/kaizzer/Downloads/chromedriver-mac-x64/chromedriver");
        WebDriver driver=new ChromeDriver();
        
        driver.get("http://www.facebook.com");
        
        System.out.println(driver.getTitle());
        
        driver.close();
        
    }
}
