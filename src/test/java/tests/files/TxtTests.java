package tests.files;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.FileUtils.readStringFromFile;

public class TxtTests {

    @Test
    @Disabled(" // todo inspect download files")
    void verifyContentInTxtDownloadTest() throws FileNotFoundException {

        File file = new File("src/test/resources/html/index.html");
        String filePath = file.getAbsolutePath();

        open(filePath);
        assertTrue(title().equals("QA.GURU examples"));

        File a = $("#zip").download();

    }

    @Test
    void verifyContentInTxtTest() {
        String expectedFileText = "hello from qa.guru";

        String actualFileText = readStringFromFile("src/test/resources/html/1.txt");
        System.out.println(actualFileText);

        assertTrue(actualFileText.contains(expectedFileText));
    }
}
