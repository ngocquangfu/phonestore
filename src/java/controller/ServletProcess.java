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
import model.Item;
import model.Order;

/**
 *
 * @author mynameis
 */
public class ServletProcess extends HttpServlet {

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
            out.println("<title>Servlet ServletProcess</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletProcess at " + request.getContextPath() + "</h1>");
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
        int id =0;
        int num=0;
        try {
            id=Integer.parseInt(request.getParameter("id"));
            num =Integer.parseInt(request.getParameter("num"));
            
            
        } catch (Exception e) {
        }
        DaoItem di =new DaoItem();
        //
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

       
        DaoAccount da = new DaoAccount();
        int oid = da.getIdByUser(user);
        List<Order> list = di.getAllMycart(oid,id);
        int quantity=0;
        double price =0;
        double count=0;
        for (Order order : list) {
            quantity=order.getQuantity();
            price=order.getTotalPrice();
        }
          count=price/quantity;
        if(num==-1){
            quantity-=1;
            
            
        }
        if(num==1){
            quantity+=1;
           
        }
        if(quantity<1){
            di.Delete(id);
        }
        
        double totalPrice =quantity*count;
        request.setAttribute("quantity", quantity);
        request.setAttribute("price", price);
        request.setAttribute("", oid);
        

        di.updateCartToDB(new Item(quantity, totalPrice, oid, id) , oid, id);
        //request.getRequestDispatcher("MyOrder.jsp").forward(request, response);
       response.sendRedirect("myorder");
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
