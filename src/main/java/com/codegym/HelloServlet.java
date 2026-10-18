package com.codegym;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        try (PrintWriter out = response.getWriter()) {
            out.println("<!doctype html><html lang='vi'><head><meta charset='UTF-8'>");
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1'>");
            out.println("<title>Hello Servlet</title></head>");
            out.println("<body style='font-family:Arial,sans-serif;text-align:center;padding:60px 16px;background:#f8fafc'>");
            out.println("<h1 style='color:#1b2a7a'>Chào mừng bạn đến với Servlet đầu tiên!</h1>");
            out.println("<p>Thời gian hiện tại của máy chủ: <strong>" + now + "</strong></p>");
            out.println("<a href='index.jsp'>Quay lại trang chủ JSP</a>");
            out.println("</body></html>");
        }
    }
}
