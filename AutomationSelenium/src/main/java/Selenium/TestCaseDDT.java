package Selenium;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class TestCaseDDT
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
FileInputStream  f1 = new FileInputStream("E:\\MKTProject\\ParallelTesting\\Selenium_TestNg\\DDT\\login.xlsx");
				Workbook w1= WorkbookFactory.create(f1);
				Sheet  s1= w1.getSheet("Credentails");
				String un=		s1.getRow(0).getCell(1).getStringCellValue();
				System.out.println(un);
				String pwd=		s1.getRow(1).getCell(1).getStringCellValue();
System.out.println(pwd);

		}
}