package com.logger.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "AccountServlet",value = "/account")
public class AccountServlet extends HttpServlet {
    public boolean isUserLoggedIn(HttpSession session){ return session.getAttribute("user") !=null;}

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if(isUserLoggedIn(session)){
            req.getRequestDispatcher("account.jsp");
        }else {
            req.getRequestDispatcher("login.jsp");
        }
    }
}
