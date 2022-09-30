<%-- 
    Document   : addnewfood
    Created on : Aug 22, 2022, 2:26:07 PM
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
      <body bgcolor ='D8BFD8'>
          <div class="frem">
         <p>เพิ่มข้อมูลสำเร็จ</p>
            <%
                food food = (food) session.getAttribute("food");
            %>
            ซื่อ : <%=food.getFoodName()%><br/>
            ประเภท : <%=food.getFoodType()%><br/>
            สารอาหาร : <%=food.getFoodnutrient()%><br/>
            ระดับความเผ็ด : <%=food.getFoodhotleve()%><br/>
            ราคา : <%=food.getFoodprice()%><br>
                   <h1 align="center"><a href="addfood">แก้ไข</a>
                <br>
                <h1 align="center"><a href="index.html">Home</a></h1><br/>
        
    </body>
</html>
