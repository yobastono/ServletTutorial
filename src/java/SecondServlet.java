/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author root
 */
public class SecondServlet extends HttpServlet {
    
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
                PrintWriter out = res.getWriter();
                out.print("In second servlet");

    }
}
