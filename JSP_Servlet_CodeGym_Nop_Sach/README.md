# CodeGym JSP / Servlet Demo — Mã nguồn nộp bài

Dự án Maven WAR, Java 17+, Jakarta Servlet API 6.0, triển khai trên Apache Tomcat 10.1.

## Các tệp nguồn bắt buộc (click để xem trực tiếp trên GitHub)

- [pom.xml](pom.xml) — khai báo Maven groupId, artifactId, packaging và Jakarta Servlet/JSP API.
- [index.jsp](src/main/webapp/index.jsp) — trang chủ hiển thị thời gian máy chủ.
- [web.xml](src/main/webapp/WEB-INF/web.xml) — cấu hình Jakarta web app.
- [HelloServlet.java](src/main/java/com/codegym/HelloServlet.java) — servlet ở `/hello`.
- [styles.css](src/main/webapp/assets/styles.css) — giao diện.

## Chạy dự án

1. Mở terminal ngay tại thư mục chứa `pom.xml`, chạy `mvn clean package`.
2. Chép `target/jsp-servlet-demo.war` vào `webapps/` của Tomcat 10.1; khởi động Tomcat.
3. Mở `http://localhost:8080/jsp-servlet-demo/` và `http://localhost:8080/jsp-servlet-demo/hello`.

## Minh chứng

Thư mục `screenshots/` chứa ảnh người học cung cấp. Những ảnh này không thay thế việc cung cấp mã nguồn.

**Lưu ý:** Chỉ upload *nội dung* của ZIP này vào **thư mục gốc** của một repository GitHub public dành riêng cho bài JSP/Servlet. Không upload mỗi file `.zip`, không upload `target/`, không nộp repository chứa bài không liên quan.
