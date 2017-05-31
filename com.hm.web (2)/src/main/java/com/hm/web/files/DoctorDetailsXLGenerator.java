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

import com.hm.web.model.DoctorBean;

public class DoctorDetailsXLGenerator  extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workBook, HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
	
		List<DoctorBean> doctor = (List<DoctorBean>) model.get("doctors");
		
		// create a new Excel sheet
        HSSFSheet sheet = workBook.createSheet("Doctors List");
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
       
        header.createCell(0).setCellValue("Did");
        header.getCell(0).setCellStyle(style);
         
        header.createCell(1).setCellValue("Image");
        header.getCell(1).setCellStyle(style);
        
        header.createCell(2).setCellValue("Name");
        header.getCell(2).setCellStyle(style);
      
        header.createCell(3).setCellValue("Email");
        header.getCell(3).setCellStyle(style);
         
        header.createCell(4).setCellValue("Address");
        header.getCell(4).setCellStyle(style);
         
        header.createCell(5).setCellValue("Phone");
        header.getCell(5).setCellStyle(style);
        
        header.createCell(6).setCellValue("Department");
        header.getCell(6).setCellStyle(style);
        
        header.createCell(7).setCellValue("Profile");
        header.getCell(7).setCellStyle(style);
        
        // create data rows
        int rowCount = 1;
       
        for (DoctorBean dlist : doctor) {
        
            HSSFRow aRow = sheet.createRow(rowCount++);
           
            aRow.createCell(0).setCellValue(dlist.getDid());
         
            aRow.createCell(1).setCellValue(dlist.getImages());
          
            aRow.createCell(2).setCellValue(dlist.getName());
            aRow.createCell(3).setCellValue(dlist.getEmail());
            aRow.createCell(4).setCellValue(dlist.getAddress());
            aRow.createCell(5).setCellValue(dlist.getPhone());
            aRow.createCell(6).setCellValue(dlist.getDept());
            aRow.createCell(7).setCellValue(dlist.getProfile());
           
        }
       
	}
}
