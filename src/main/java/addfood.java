
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.food;

/**
 *
 * @author supha
 */
@WebServlet(urlPatterns = {"/addfood"})
public class addfood extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter())
        { HttpSession session = request.getSession();
                 food food = (food) session.getAttribute("food");
                 
                 
 if (food == null) {
     
            String foodName = request.getParameter("foodName");
            String foodType = request.getParameter("foodType");
            String foodnutrient = request.getParameter("foodnutrient");
            String  foodhotlevel = request.getParameter("foodhotlevel");
            int foodprice= Integer.parseInt(request.getParameter("foodprice"));
        
                food = new food();
              food.setFoodName(foodName);
              food.setFoodType(foodType);
              food.setFoodnutrient(foodnutrient);
             food.setFoodhotleve(foodhotlevel);
             food.setFoodprice(foodprice);
            
             session.setAttribute("food", food);
             response.sendRedirect("addnewfood.jsp");
                out.println("<html><body><h1>ข้อมูล food<h1>");
                out.println("<form action=''addfood>");
                out.println("ชื่อ : " + food.getFoodName() + "<br/>");
                out.println("ประเภท : " + food.getFoodType()+ "<br/>");
                out.println("สารอาหาร : " + food.getFoodnutrient()+ "<br/>");
                out.println("ระดับเผ็ด : " +food.getFoodhotleve()+ "<br/>");
                out.println("ราคา : " + food.getFoodprice()+ "<br/>");
                out.println("<input type='submit' value='แก้ไข'>");
                out.println("</form></body></html>");
                
 }else{
                
                out.println("<html><body><h1>แก้ไขข้อมูล <h1>");
                out.println("<form action='addfood'>");
                out.println("ชื่อ : <input type='text' name='foodName' value='"
                                            +food.getFoodName()+ "'><br/>");
                out.println("ประเภท: : <input type='text' name='foodType' value='"
                        +  food.getFoodType()+ "'><br/>");
                out.println("สารอาหาร: <input type='text' name='foodnutrient' value='"
                        +  food.getFoodnutrient() + "'><br/>");
                out.println("ระดับเผ็ด : <input type='text' name='foodhotLevel' value='"
                        +food.getFoodhotleve()+ "'><br/>");
                out.println("ราคา : <input type='text' name='foodPrice' value='"
                        +  food.getFoodprice() + "'><br/>");
                out.println("<input type='submit' value='แก้ไข'>");
                out.println("</form></body></html>");
                
                                 
                session.removeAttribute("food");
                 }

        }
           
    }     

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
