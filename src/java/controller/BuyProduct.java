/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.DaoAccount;
import dal.DaoBuy;
import dal.DaoItem;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CustomerDetail;

/**
 *
 * @author mynameis
 */
public class BuyProduct extends HttpServlet {

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
            out.println("<title>Servlet BuyProduct</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BuyProduct at " + request.getContextPath() + "</h1>");
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
        String fullname =request.getParameter("fullname");
        String sdt = request.getParameter("sdt");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String note = request.getParameter("note");
        String bankString =request.getParameter("bank");
        request.setAttribute("bank", bankString);
        request.setAttribute("email", email);
        request.setAttribute("fullname", fullname);
        request.setAttribute("bank", bankString);
        request.setAttribute("bank", bankString);

        String bank ="";
        if(bankString.equals("0")){
            bank="TechComBank";
        }
        else if(bankString.equals("1")){
            bank="BIDV";
        }
        else if (bankString.equals("2")) {
            bank = "VietComBank";
        } else if (bankString.equals("3")) {
            bank = "TP Bank";
        }
       //request.setAttribute("bank", bank);

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
        DaoBuy db =new DaoBuy();
        db.addCustomer(new CustomerDetail(fullname, sdt, address, email, bank, note, oid));//add thong tin customer vào customer table
        di.DeleteCart(oid);
        
        ///request.getRequestDispatcher("test.jsp").forward(request, response);
        
        

      
        
        
        
        
        
        
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
