
package com.ServletPractice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Wasim Ahmed
 */
public class RegisterServlet extends HttpServlet{

    //override doPost() because form method is post... if form method is get.. we need to override doGet() method.
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
        resp.setContentType("text/html");
        PrintWriter out= resp.getWriter();
        out.println("<h1>WELCOME!</h1>");
        
        String name = req.getParameter("user_name");
        String password = req.getParameter("user_password");
        String email = req.getParameter("user_email");
        String gender = req.getParameter("user_gender");
        String course = req.getParameter("user_course");
        String condition  = req.getParameter("condition");
        //out.println(condition);
        
        if (condition!=null) {
            
            if (condition.equals("checked")) {
            out.println("<h2> Name :"+name+"</h2>");
            out.println("<h2> Password :"+password+"</h2>");
            out.println("<h2> Email :"+email+"</h2>");
            out.println("<h2> Gender :"+gender+"</h2>");
            out.println("<h2> Course :"+course+"</h2>");
            
            
            //You can connect JDBC here and Store data in DB...
            //lets assume We can create jdbc and stored data into database...
            
            //now we want to show "Data Stored Successful" msg via SuccessServelt including forward() message
            // of RequestDispatcher...
            RequestDispatcher rd = req.getRequestDispatcher("success");
            rd.forward(req, resp);
            
            
        }
        else{
            out.println("<h2> Please Agree with Term and Condition</h2>");
        }
      }
    else{
             out.println("<h2> Please agree with Term and Condition</h2>");
             
             //include index page output 
             
             //get the request of RequestDispatcher
             
             RequestDispatcher rd = req.getRequestDispatcher("index.html");//object
             rd.include(req, resp);
                     
             
             
             
             
             
        }
            
        }
        
        
        
        
        
        //out.println("Name :"+req.getParameter("user_name"));
        
        
        
        
        
        }
    
    
    
    
    

