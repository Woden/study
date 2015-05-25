package auto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class BuildDoc {

	public static void main(String[] args) {
		POIFSFileSystem fs;
		try {
			fs = new POIFSFileSystem(new FileInputStream("d:\test.xls"));
			HSSFWorkbook wb = new HSSFWorkbook(fs); 
			HSSFSheet sheet = wb.getSheetAt(0); 
			HSSFRow row = sheet.getRow(0); 
			HSSFCell cell = row.getCell(0);
			String msg = cell.getStringCellValue(); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

}
