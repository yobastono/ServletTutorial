
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class VisitCounter extends HttpServlet{
    
    public static int i = 0;
    
    public void init(){
        i = 1;
    }
    
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
        
        i++;
        
        
        PrintWriter out = res.getWriter();
        out.print(i);
    }
}