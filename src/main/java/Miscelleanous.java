import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;


public class Miscelleanous {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("http://google.com");

        // Capture a screenshot of the current web page and saves it to a File object
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshotFilePath = "screenshot.png";

        // Copy the contents of screenshotFile to a new file at the path screenshotFilePath, replacing any existing file
        Files.copy(screenshotFile.toPath(), new File(screenshotFilePath).toPath(), StandardCopyOption.REPLACE_EXISTING);


    }
}
