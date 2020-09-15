import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


@WebServlet(name = "HelloWorldServlet", urlPatterns = "/")
public class HelloWorldServlet extends HttpServlet {


    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String firstName = req.getParameter("first");
        String lastName = req.getParameter("last");
        if (firstName == null && lastName == null) {
            firstName = "John";
            lastName = "Doe";
        }
        out.println("<h1>Hello, " + firstName + lastName + "</h1>");

        int count = 1;


    }


}
