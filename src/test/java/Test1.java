import de.redsix.pdfcompare.PdfComparator;

import java.io.IOException;

public class Test1 {

    public static void main(String[] args) throws IOException {

        String file1 = "C:\\Users\\mohamedk\\IdeaProjects\\PDFComparison\\target\\PDFDatei\\file1.pdf";
        String file2 = "C:\\Users\\mohamedk\\IdeaProjects\\PDFComparison\\target\\PDFDatei\\file2.pdf";
        String resultFile = "C:\\Users\\mohamedk\\IdeaProjects\\PDFComparison\\target\\PDFDatei\\Results\\result";

        new PdfComparator(file1, file2).compare().writeTo(resultFile);

        System.out.println("Process Completed");

    }
}
