/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.DaoAccount;
import dal.DaoItem;
import dal.ProductDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
import model.Item;
import model.Order;
import model.Product;

/**
 *
 * @author mynameis
 */
public class ServletAddCart extends HttpServlet {

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
            out.println("<title>Servlet ServletAddCart</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletAddCart at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            Cookie[] cookies = request.getCookies();
            out.println(cookies.length + "hello");
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
        PrintWriter out = response.getWriter();
        /// lay id của sản phẩm
        String idString = request.getParameter("pid");//lay id tu thằng product

        int id = 1;
        try {
            id = Integer.parseInt(idString);///đây là id của thằng product   
        } catch (Exception e) {
        }
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

        //id-->quantiry,price--->total price;user--->oid
        DaoItem di = new DaoItem();
        DaoAccount da = new DaoAccount();
        ProductDao pd = new ProductDao();
        Product p = pd.getProById(id);
        

        // gia của sản phẩm có id
        double price = p.getPrice();
        int pQuantity = 1;//lay từ jsp product detail
        try {
            pQuantity = Integer.parseInt(request.getParameter("quantity"));
        } catch (Exception e) {
        }
        double totalPrice = pQuantity * price;//lấy từ thằng product detail
        int oid = da.getIdByUser(user);
        List<Item> listMycart = di.getAllMyCart(oid);
        
        ///request.setAttribute("oid",oid);//test
        request.setAttribute("quantity", pQuantity);//test
        /// request.setAttribute("user", user);//test
        request.setAttribute("total", totalPrice);
        request.setAttribute("id", id);//truyền id sang cho thằng show cart
        request.setAttribute("oid", oid);//test
        int count =0;
        for (Item item : listMycart) {
            if(item.getPid()==id){
                count++;
            }
        }
        for (Item item : listMycart) {
            if (item.getPid() == id) {
                int quantity =pQuantity+item.getQuantity();
                
                double total =quantity*price;
                di.updateCartToDB(new Item(quantity, total, oid, id), oid, id);
               // request.setAttribute("update", "hello");
           
            } 
        }
        if(count==0){
            di.addCartToDB(new Item(pQuantity, totalPrice, oid, id));
        }
        response.sendRedirect("myorder");
      

        //int quantity =(int)request.getAttribute("quantity");
        //int quantity =(int)request.getAttribute("quantity");
      
//        List<Order> list = di.getAllOrder(oid);
//
//        request.setAttribute("myorder", list);
//        request.getRequestDispatcher("").forward(request, response);

        //request.getRequestDispatcher("test.jsp").forward(request, response);
//        ///
//        ProductDao dao = new ProductDao();
//        /// lay sản phảm theo id
//        Product p = dao.getProById(id);
//        DaoItem it =new DaoItem();
//        
//        String quantirySTring =request.getParameter("quantity");// lấy quantity từ product detail
//        int quantity =Integer.parseInt(idString);
//        double totalPrice =p.getPrice()*quantity;// total price
//        String user =request.getParameter("username");
//        String pass = request.getParameter("password");
//        DaoAccount acc =new DaoAccount();
//        Account ac =acc.getAccount(user, pass);
//        int oid =0;
//        request.getRequestDispatcher("ListProduct.jsp").forward(request, response);
//        if(ac!=null){
//             oid =acc.getIDByUserName(user, pass);
//             it.addCartToDB(new Item(quantity, totalPrice, oid, id));
//             request.getRequestDispatcher("AddCart.jsp").forward(request, response);
//        }
//        else{
//            request.getRequestDispatcher("login.jsp");
//        }
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
