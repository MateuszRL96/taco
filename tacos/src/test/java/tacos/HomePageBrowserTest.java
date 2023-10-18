package tacos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;




@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class HomePageBrowserTest {

  @LocalServerPort
  private int port;
  private static HtmlUnitDriver browser;

    @BeforeAll
    static void setup() {
    browser = new HtmlUnitDriver();
    
    browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

    @AfterAll
    static void teardown() {
    browser.quit();
  }

    @Test
    void testHomePage() {
    String homePage = "http://localhost:" + port;
    browser.get(homePage);
    
    String titleText = browser.getTitle();
    assertEquals("Taco Cloud", titleText);
    
    WebElement h1Text = browser.findElement(By.tagName("h1"));

    assertEquals("Welcome to...", h1Text);
    
    String imgSrc = browser.findElement(By.tagName("img")).getAttribute("src");
    assertEquals(homePage + "/images/TacoCloud.png", imgSrc);
  }
  
  
}
