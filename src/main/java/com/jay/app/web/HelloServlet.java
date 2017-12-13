package com.jay.app.web;

import com.jay.app.web.ejb.HelloEJB;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @EJB private HelloEJB helloEJB;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (PrintWriter out = resp.getWriter()) {
            out.println(helloEJB.sayHello("Jatinder Pal Singh"));
        }
    }
}
