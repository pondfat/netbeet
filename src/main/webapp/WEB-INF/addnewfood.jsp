<%-- 
    Document   : addnewfood
    Created on : Aug 21, 2022, 2:11:42 PM
    Author     : supha
--%>

<%@page import="model.food"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>food</title>
    </head>
    <body bgcolor ='D8BFD8'>
        <div class="frem">
            <p>เพิ่มข้อมูลสำเร็จ</p>
              <%
                food food = (food) session.getAttribute("food");
            %>
            ชื่อ : <%= food.getfoodName()%><br/>
            ประเภท : <%=food.getfoodType()%><br/>
            สารอาหาร: <%=food.getfoodnutrient()%><br/>
            ระดับเผ็ด : <%=food.getfoodhotLevel()%><br/>
            ราคา : <%=food.getfoodPrice()%><br>
            <br/>
            <a href="upDateMovie.jsp">แก้ไข</a>
            <br>
            <h1 align="center"><a href="index.html">Home</a></h1><br/>
            <br/>
            <a href="upDatefood.jsp">แก้ไข</a>>
    </body>
</html>
