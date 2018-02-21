package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
		String time = dateFormat.format(now);
		writeDataInExcel("D:\\data.xls",time,"PR1","R34567PAYREQ890","FAIL");
		System.out.println(time);
	}
	
	public static void writeDataInExcel(String FileName, String sheet_name, String Data1,String Data2,String Result) throws IOException {
		
		FileInputStream fis = new FileInputStream(new File(FileName));
		HSSFWorkbook workBook = new HSSFWorkbook(fis);
		int a=0,lastRowNumber;
		HSSFSheet sheet;
	
		 a=workBook.getSheetIndex(sheet_name);
		// Create sheet
		if ( a == -1){
			 sheet = workBook.createSheet(sheet_name);
			 lastRowNumber = sheet.getLastRowNum();
		}
         else {
        	  sheet = workBook.getSheet(sheet_name);
        	  lastRowNumber = sheet.getLastRowNum()+1;
         }
		
		CellStyle style = workBook.createCellStyle();
		Font font = workBook.createFont();
		style.setAlignment(style.ALIGN_CENTER);
		
		int columnCount = 0;
		HSSFRow row = null;
		// Create Row
		if (lastRowNumber <= 0) {
			row = sheet.createRow(lastRowNumber);
		} else {
			row = sheet.createRow(lastRowNumber);
			//columnCount = row.getLastCellNum();
		}
		// Create cell
		HSSFCell cell = row.createCell(columnCount);
		cell.setCellStyle(style);
		cell.setCellValue(Data1);
		HSSFCell cell2 = row.createCell(columnCount+1);
		//cell2.setCellStyle(style);
		cell2.setCellValue(Data2);
		HSSFCell cell3 = row.createCell(columnCount+2);
		CellStyle style1 = workBook.createCellStyle();
		if (Result.equals("PASS")){
			style1.setFillForegroundColor(IndexedColors.GREEN.getIndex());
			style1.setFillPattern(CellStyle.SOLID_FOREGROUND);
			style1.setAlignment(style.ALIGN_CENTER);
			font.setBold(true);
			style1.setFont(font);
			}
		else if (Result.equals("FAIL")){
			style1.setFillForegroundColor(IndexedColors.RED.getIndex());
			style1.setFillPattern(CellStyle.SOLID_FOREGROUND);
			style1.setAlignment(style.ALIGN_CENTER);
			font.setBold(true);
			style1.setFont(font);
			}
		cell3.setCellStyle(style1);
		cell3.setCellValue(Result);

		FileOutputStream fos = new FileOutputStream(new File(FileName));

		workBook.write(fos);

		fos.close();

		workBook.close();
		
	}


}
