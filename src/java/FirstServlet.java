/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author root
 */
public class FirstServlet extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

        
        // Sending request to the second Servlet and client doesn't know -> see url bar
        //RequestDispatcher rd = req.getRequestDispatcher("SecondServlet");
        //rd.forward(req, res);
        
        // letting the client know that the request went to the second servlet
        String str = req.getParameter("t1");
        
        // With HttpSession I can now transfer the data to SecondServlet
        HttpSession session = req.getSession();
        session.setAttribute("t1", str);
        res.sendRedirect("SecondServlet");
    }
}
