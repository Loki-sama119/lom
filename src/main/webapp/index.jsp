<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.time.LocalDateTime,java.time.format.DateTimeFormatter" %>
<%
    String serverTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
%>
<!doctype html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>CodeGym JSP Servlet Demo</title>
    <link rel="stylesheet" href="assets/styles.css">
</head>
<body>
    <main class="card">
        <p class="tag">JAVA WEB · JSP / SERVLET</p>
        <h1>Chào mừng tới lớp học Java Web!</h1>
        <p>Đây là trang JSP động được xử lý bởi Tomcat.</p>
        <p class="time-label">Thời gian máy chủ hiện tại</p>
        <p class="time" id="serverTime"><%= serverTime %></p>
        <p class="hint">Tải lại trang để cập nhật thời gian từ máy chủ.</p>
        <a class="button" href="hello">Mở HelloServlet →</a>
    </main>
</body>
</html>
