/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/TagHandler.java to edit this template
 */
package mytag;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.JspFragment;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author fpt
 */
public class DateFormatTag extends SimpleTagSupport {
    	private String format;
	private String number;
        
	public void setFormat(String format) {
		this.format = format;
	}

	public void setNumber(String number) {
		this.number = number;
	}
    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException, IOException {
        
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            SimpleDateFormat outputDateFormat = new SimpleDateFormat("ddMMyyyy");
            Date date = dateFormat.parse(number);
            System.out.println(outputDateFormat.format(date));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
