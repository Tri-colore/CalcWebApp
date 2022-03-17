/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author io
 */
@WebServlet(urlPatterns = {"/CalcServlet"})
public class CalcServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            
            String number1 = request.getParameter("number1");
            String number2 = request.getParameter("number2");
           
          
            
            double num1 = Double.parseDouble(number1);
             double num2 = Double.parseDouble(number2);
             double result = 0;
             
             
            
            
                 
                 
             
             
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcServlet</title>");            
            out.println("</head>");
            
            out.println("<body>");
            
              String btnValue = request.getParameter("action");
              
             if(btnValue.equals("Add")){
                double add = num1 + num2;
                out.println("The Add result is " + add);
             }
             
             else if(btnValue.equals("Sub")){
                 double sub = num1-num2;
                  out.println("The Add result is " + sub);
             }
             else if(btnValue.equals("Divide")){
                 double divide = num1/num2;
                  out.println("The Add result is " + divide);
             }
             else if (btnValue.equals("Multiply")){
                 double mul = num1* num2;
                  out.println("The Add result is " + mul);
             }
             
             
            out.println(" <form action =\"CalcServlet\" method=\"GET\">\n" +
"            <br>Number1:<input type =\"Text\" size=\"20\" name =\"number1\" value=" + num1 + " >\n" +
"            <br>Number2:<input type =\"Text\" size=\"20\" name =\"number2\" value=" + num2 + "  >\n" +
"            <br>Result:\n" +
"            <input type=\"submit\" name =\"action\" value=\"Add\">\n" +
"            <input type=\"submit\" name =\"action\" value=\"Sub\">\n" +
"            <input type=\"submit\" name =\"action\" value=\"Divide\">\n" +
"            <input type=\"submit\" name =\"action\" value=\"Multiply\">\n" +
"        </form>");
            out.println();
            out.println();
            out.println("</body>");
            
            out.println("</html>");
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
