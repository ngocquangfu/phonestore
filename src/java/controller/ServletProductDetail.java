/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ProductDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Product;
import model.ProductDetail;

/**
 *
 * @author mynameis
 */
public class ServletProductDetail extends HttpServlet {

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
            out.println("<title>Servlet ServletProductDetail</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletProductDetail at " + request.getContextPath() + "</h1>");
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
        //lay đx cái id của thằng product 

        String idString = request.getParameter("pid");//lay id tu thằng product

        int id = 0;
        try {
            id = Integer.parseInt(idString);///đây là id của thằng product
        } catch (Exception e) {
        }

        int pQuantity = 1;
        try {
            pQuantity = Integer.parseInt(request.getParameter("quantity"));
        } catch (Exception e) {
        }

        request.setAttribute("quantity", pQuantity);

        ProductDao d = new ProductDao();
        int sid = d.getSid(id);// lay sid từ thằng id
        List<ProductDetail> list = d.getProDeById(sid + "");
        ProductDetail pd = d.getProductDetail(sid + "");

        request.setAttribute("id", id);//truyền id vào id  product detail
        request.setAttribute("prodetail", list);
        request.setAttribute("product", pd);
        //response.sendRedirect("listPro.jsp");
        //request.getRequestDispatcher("ListProduct.jsp").forward(request, response);
        request.getRequestDispatcher("ProductDetail.jsp").forward(request, response);
        //request.getRequestDispatcher("test.jsp").forward(request, response);

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
