package pdf_Read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Pdf_Read 
{
	public static void main(String[] args) throws IOException
  {
	  FileInputStream obj = new FileInputStream("E:\\All pdf Files\\offer_Letter.pdf");
	  PDDocument objDoc = PDDocument.load(obj);
	  PDFTextStripper objPDFStrip = new PDFTextStripper();
	 String pdfContent = objPDFStrip.getText(objDoc);
	 System.out.println(pdfContent);
	 
  }
}
