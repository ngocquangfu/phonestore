/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import model.Customer;
import model.CustomerDetail;

/**
 *
 * @author mynameis
 */
public class DaoBuy {

    Connection con;

    public void addCustomer(CustomerDetail cus) {
        String sql = "insert into Customer (fullname,sdt,address,email,bank,note,oid) values(?,?,?,?,?,?,?)";
        try {
            con = new DBcontext().getConnection();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, cus.getFullname());
            st.setString(2, cus.getSdt());
            st.setString(3, cus.getAddress());
            st.setString(4, cus.getEmail());
            st.setString(5, cus.getBank());
            st.setString(6, cus.getNote());
            st.setInt(7, cus.getOid());
            st.executeUpdate();

        } catch (Exception e) {
        }

    }
    public static void main(String[] args) {
       DaoBuy db =new DaoBuy();
       ///db.addCustomer(new CustomerDetail("quang", "09333432", "luc nam", "ngocquangfpt@.com", "tp bank", "no", 1));
    }
    
}
