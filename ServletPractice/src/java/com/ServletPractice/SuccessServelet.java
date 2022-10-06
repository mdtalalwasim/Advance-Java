
package com.ServletPractice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Md. Talal Wasim
 */
public class SuccessServelet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("This is SuccessServlet");
        out.println("<h1>Successfully Registerd...</h1>");
        
        
    }
    
    
}
