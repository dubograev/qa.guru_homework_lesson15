package tests.files;

import org.junit.jupiter.api.Test;
import utils.ZipUtils;

import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.FileUtils.readStringFromFile;

public class ZipTests {

    @Test
    void verifyContentInZipTest() {
        String source = "src/test/resources/html/1.zip";
        String destination = "src/test/resources/html/unzip";

        String expectedFileText = "hello from qa.guru";

        new ZipUtils().unzip(source, destination);
        sleep(1000);

        String actualFileText = readStringFromFile(destination + "/1.txt");
        System.out.println("Actual text from file: \n" + actualFileText);

        assertTrue(actualFileText.contains(expectedFileText));

    }
}
