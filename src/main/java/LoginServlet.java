import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String firstName = req.getParameter("first");
        String lastName = req.getParameter("last");
        /*if (firstName.equals("admin") && lastName.equals("password")) {

        }*/
        out.println("<form>\n" +
                "<label for=\"firstName\">name of product:</label><br>\n" +
                "  <input type=\"text\" id=\"firstName\" name=\"firstName\"><br>\n" +
                "  <label for=\"lastName\">amount:</label><br>\n" +
                "  <input type=\"text\" id=\"lastName\" name=\"lastName\">\n" +
                "  <br><input type=\"submit\" value=\"Submit\">" +
                "</form>");
    }
}
