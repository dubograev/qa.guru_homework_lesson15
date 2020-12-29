package tests.files;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.FileUtils.readXlsxFromFile;

public class XlsTests {

    @Test
    void verifyContentInXlsTest() {
        String actualFilePath = "src/test/resources/html/1.xls";
        String expectedFileText = "xls with qa.guru";

        File actualFile = new File(actualFilePath);
        XLS xls = new XLS(actualFile);

        assertThat(xls, XLS.containsText(expectedFileText));
    }

    @Test
    void verifyContentInXlsxTest() {
        String actualFilePath = "src/test/resources/html/1.xlsx";
        String expectedFileText = "xls with qa.guru";

        String actualFileText = readXlsxFromFile(actualFilePath);
        System.out.println(actualFileText);

        assertTrue(actualFileText.contains(expectedFileText));
    }
}
