/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.DaoAccount;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;

/**
 *
 * @author mynameis
 */
public class ServletLogin extends HttpServlet {

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
            out.println("<title>Servlet ServletLogin</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletLogin at " + request.getContextPath() + "</h1>");
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
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");
        // goi lớp Dao
        DaoAccount da = new DaoAccount();
        Account ac = da.getAccount(username, password);//đẩy dữ liệu lấy từ form
        
        // if người dùng đăng nhập thành công hay 
        if (ac != null) {
            ///thiet lap phien lam viec session 
            HttpSession session = request.getSession(true);
           
            request.setAttribute("accout", ac);
            ///tao cookies
            Cookie cuser = new Cookie("user", username);
            Cookie cpass = new Cookie("pass", password);
            Cookie crem = new Cookie("rem", remember);
            // nếu remember password
            if (remember != null) {
                cuser.setMaxAge(60 * 60 * 24);
                cpass.setMaxAge(60 * 60 * 24);
                crem.setMaxAge(60 * 60 * 24);

            }else{// neu không nhớ pass
                cuser.setMaxAge(0);//trả về trạng thái ban đầu
                cpass.setMaxAge(0);
                crem.setMaxAge(0);

            }
            ///add cookies
            response.addCookie(crem);
            response.addCookie(cpass);
            response.addCookie(cuser);
            response.sendRedirect("Home.jsp");
            
        }else{//neu ngươi dung dang nhap mat kháu sai
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }

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
