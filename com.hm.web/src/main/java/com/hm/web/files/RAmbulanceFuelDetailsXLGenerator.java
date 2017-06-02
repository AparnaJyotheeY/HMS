package com.hm.web.files;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.hm.web.model.ReceptionistBean;

public class RAmbulanceFuelDetailsXLGenerator extends AbstractExcelView{

	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workBook, HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
	
		List<ReceptionistBean> amb = (List<ReceptionistBean>) model.get("fueldet");
		
		// create a new Excel sheet
        HSSFSheet sheet = workBook.createSheet("Ambulance Details List");
        sheet.setDefaultColumnWidth(30);
         
        // create style for header cells
        CellStyle style = workBook.createCellStyle();
        HSSFFont font = workBook.createFont();
        font.setFontName("Arial");
        style.setFillForegroundColor(HSSFColor.LIME.index);
        style.setFillPattern(CellStyle.SOLID_FOREGROUND);
        style.setAlignment(CellStyle.ALIGN_CENTER);
        style.setFillBackgroundColor(CellStyle.BORDER_THICK);
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);        
        font.setColor(HSSFColor.WHITE.index);
        style.setFont(font);
        
         
        // create header row
        HSSFRow header = sheet.createRow(0);
       
        header.createCell(0).setCellValue("Ambulance Id");
        header.getCell(0).setCellStyle(style);
         
        header.createCell(1).setCellValue("Ambulance Number");
        header.getCell(1).setCellStyle(style);
        
        header.createCell(2).setCellValue("Driver");
        header.getCell(2).setCellStyle(style);
      
        header.createCell(3).setCellValue("Fuel Date");
        header.getCell(3).setCellStyle(style);
         
        header.createCell(4).setCellValue("Fuel quantity");
        header.getCell(4).setCellStyle(style);
         
        header.createCell(5).setCellValue("Fuel amount");
        header.getCell(5).setCellStyle(style);
        
        
        // create data rows
        int rowCount = 1;
       
        for (ReceptionistBean alist : amb) {
        
            HSSFRow aRow = sheet.createRow(rowCount++);
           
            aRow.createCell(0).setCellValue(alist.getAmbulanceid());
         
            aRow.createCell(1).setCellValue(alist.getAmbulancenumber());
          
            aRow.createCell(2).setCellValue(alist.getDriver());
            aRow.createCell(3).setCellValue(alist.getFueldate());
            aRow.createCell(4).setCellValue(alist.getFuelquantity());
            aRow.createCell(5).setCellValue(alist.getFuelamount());
           
        }
       
	}
	
}
