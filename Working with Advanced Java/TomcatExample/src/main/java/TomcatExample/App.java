package TomcatExample;

/**
 * Hello world!
 */

// Import required Java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public final class App extends HttpServlet {

    private String message;

    private App() {
    }

    public void init() throws ServletException {
        // Do required initialization
        message = "Hello World";
        System.out.println("Servlet " + this.getServletName() + " has started");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
    }

    public void destroy(){
        // do nothing
        System.out.println("Servlet " + this.getServletName() + " has stopped");
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        System.out.println("Hello World!");
    }
}
