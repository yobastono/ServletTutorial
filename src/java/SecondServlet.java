/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author root
 */
public class SecondServlet extends HttpServlet {
    
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        
        
        HttpSession session = req.getSession();
        
        Cookie[]cookies = req.getCookies();
        // Client sends req to FirstServlet with t1
        // FirstServlet sends res to client
        // Client sends another req to SecondServlet without t1
        // so use session, with session 
        String str = session.getAttribute("t1").toString();
        System.out.println(str);
        
        for(Cookie c : cookies){
            str = c.getValue();
        }
        PrintWriter out = res.getWriter();
        out.print("Welcome " + str);
        
        

    }
}
