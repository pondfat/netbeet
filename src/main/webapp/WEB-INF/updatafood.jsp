<%-- 
    Document   : updatafood
    Created on : Aug 21, 2022, 2:09:21 PM
    Author     : supha
--%>

<%@page import="model.food"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>เพิ่มข้อมูลสำเร็จ</p>
        <%
                food food = (food) session.getAttribute("food");
            %>
            ชื่อเรื่อง : <%= food.getfoodName()%><br/>
            ประเภทหนัง : <%=food.getfoodType()%><br/>
            สารอาหาร : <%=food.getfoodnutrient()%><br/>
            ระดับเผ็ด : <%=food.getfoodhotLevel()%><br/>
            ราคา : <%=food.getfoodPrice()%><br>
                <h1 align="center"><a href="index.html">Home</a></h1><br/>
            </form>
            <% session.removeAttribute("food");%>
    </body>
</html>
