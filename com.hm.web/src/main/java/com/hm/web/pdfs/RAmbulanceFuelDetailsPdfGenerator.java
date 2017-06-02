package com.hm.web.pdfs;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.hm.web.model.ReceptionistBean;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class RAmbulanceFuelDetailsPdfGenerator extends AbstractPdfView {
	@Override
	 protected void buildPdfDocument(Map model,
	   Document document, PdfWriter writer, HttpServletRequest req,
	   HttpServletResponse resp) throws Exception {
		
		
		Paragraph header = new Paragraph(new Chunk("Ambulance Details",FontFactory.getFont(FontFactory.HELVETICA, 30)));
		  document.add(header);
		 

			List<ReceptionistBean> rlist = (List<ReceptionistBean>) model.get("fueldet");
			
			
		 PdfPTable table = new PdfPTable(5); // 3 columns.
	        table.setWidthPercentage(100); //Width 100%
	        table.setSpacingBefore(20f); //Space before table
	        table.setSpacingAfter(10f); //Space after table
	 
	        //Set Column widths
	        float[] columnWidths = {1f, 1f, 1f, 1f, 1f,1f};
	        table.setWidths(columnWidths);
	        
	        
	        PdfPCell cell = new PdfPCell();
	        
	        cell.setPaddingLeft(10);
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
	        
	       
	        
	        
	        cell.setPhrase(new Phrase("AMBULANCE ID"));
	        table.addCell(cell);

	        
	        
	        cell.setPhrase(new Phrase("AMBULANCE NUMBER"));
	        table.addCell(cell);
	        
	        cell.setPhrase(new Phrase("DRIVER"));
	        table.addCell(cell);
	        
	        cell.setPhrase(new Phrase("Fuel Date"));
	        table.addCell(cell);
	        
	        cell.setPhrase(new Phrase("Quantity"));
	        table.addCell(cell);
	        
	        cell.setPhrase(new Phrase("Amount"));
	        table.addCell(cell);
	        
	        
	        
	         	 
	       for(ReceptionistBean bean:rlist) {
	       
	    	PdfPCell rowcell = new PdfPCell();
	    	rowcell.setPaddingLeft(10);
	    	rowcell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    	rowcell.setVerticalAlignment(Element.ALIGN_MIDDLE);
	    	
	    	rowcell.setPhrase(new Phrase(bean.getAmbulanceid()));
	        table.addCell(rowcell);
	        
	        
	        
	        rowcell.setPhrase(new Phrase(bean.getAmbulancenumber()));
	        table.addCell(rowcell);
	        
	        rowcell.setPhrase(new Phrase(bean.getDriver()));
	        table.addCell(rowcell);
	        
	        rowcell.setPhrase(new Phrase(bean.getFueldate()));
	        table.addCell(rowcell);
	        
	        rowcell.setPhrase(new Phrase(bean.getFuelquantity()));
	        table.addCell(rowcell);
	        
	        rowcell.setPhrase(new Phrase(bean.getFuelamount()));
	        table.addCell(rowcell);
	        
	        
	        
	        
	       
	        
	        }
	  
	 
	        document.add(table);
	  
	      
	
	 
	}
}