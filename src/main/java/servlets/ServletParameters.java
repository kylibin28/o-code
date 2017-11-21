package servlets;

import bullGame.model.Users;
import bullGame.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by Макс on 21.11.2017.
 */
//@RunWith(SpringRunner.class)
//@SpringBootApplication
//@Controller
public class ServletParameters extends HttpServlet {

    @Autowired
    private UserService userService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        this.process(request, response);
    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        this.process(request, response);
//    }



    private void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        response.setStatus(200);

        String login = request.getParameter("inputLogin");
        String password = request.getParameter("inputPassword");
        if (login != null && password == null) {
            System.out.println("Input password");

        } else if (password != null) {
            List<Users> usersList = userService.findAllUsers();
            for (Users user : usersList) {
                if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                    System.out.println("OK");
                    RequestDispatcher requestDispatcher = request.getRequestDispatcher("Registration.jsp");
                    requestDispatcher.forward(request, response);
                }
            }
        }
    }
}
