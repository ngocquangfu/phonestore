/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.DaoAccount;
import dal.DaoItem;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Order;

/**
 *
 * @author mynameis
 */
public class ServletMyOrder extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletMyOrder</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletMyOrder at " + request.getContextPath() + "</h1>");
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
        String user = "";
        Cookie[] listCookies = request.getCookies();
        if (listCookies == null) {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            for (Cookie listCooky : listCookies) {
                if (listCooky.getName().equals("user")) {
                    user = listCooky.getValue();
                }
            }
        }

        DaoItem di = new DaoItem();
        DaoAccount da = new DaoAccount();
        int oid = da.getIdByUser(user);
        List<Order> list = di.getAllOrder(oid);
        int total = 0;
        for (Order order : list) {
            total += order.getTotalPrice();
            
        }
        int ship=0;
        if(total>100){
            ship=0;
        }
        else{
            ship=2;
        }
        request.setAttribute("total", total);
        request.setAttribute("ship", ship);
        request.setAttribute("all", total+ship);

        
        //request.getRequestDispatcher("test.jsp").forward(request, response);

        request.setAttribute("myorder", list);
        request.getRequestDispatcher("ShowCart.jsp").forward(request, response);

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
