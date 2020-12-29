package tests.files;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;

public class PdfTests {

    @Test
    void verifyContentInPdfTest() throws IOException {
        String actualFilePath = "src/test/resources/html/1.pdf";
        String expectedFileText = "Workspace of files_job on мастер1";

        File actualFile = new File(actualFilePath);
        PDF pdf = new PDF(actualFile);

        assertThat(pdf, PDF.containsText(expectedFileText));
    }
}
