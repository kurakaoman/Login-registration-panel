package com.logger.homepage;

import com.logger.user.User;
import com.logger.user.UserDaoMock;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Optional;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    private static String invalidLogin = "Invalid username or email .\n" +
            "Need a reminder? Reset your password.";
    private static String invalidPassword = "Invalid password .\n" +
            "Need a reminder? Reset your password.";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        Optional<User>  userByCredentials = UserDaoMock.getUserByUserNameAndPassword(userName,password);
        if (UserDaoMock.getUserByUserName(userName).isPresent()){
            if(UserDaoMock.getUserByUserNameAndPassword(userName,password).isPresent()){
                HttpSession session = req.getSession();
                session.setAttribute("user",userByCredentials.get()); // .get()!! wtf?!
            } else {
                req.setAttribute("passwordError",invalidPassword);
                resp.sendRedirect("/login");
            }
        } else {
            req.setAttribute("loginError",invalidLogin);
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
    }
}
