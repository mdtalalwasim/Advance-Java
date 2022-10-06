
package com.ServletPractice;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;

import javax.servlet.http.HttpServlet;

/**
 *
 * @author Md. Talal Wasim
 */
public class HttpServletPractice extends HttpServlet{
    
    //get method request sending...
    //provide body of get method..
    
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        
        System.out.println("This is getMethod()...");
        
        //for generate dynamic response in browser...
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>This is getMethod() of my Servlet...</h1>");
        out.println("<h1>This is HttpServlet</h1>");
        out.println(new Date());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
    
      resp.setContentType("text/html");
      PrintWriter out = resp.getWriter();
      out.println("<h1>DoPost Method!...</h1>");
        
    }
    
    
    
}
