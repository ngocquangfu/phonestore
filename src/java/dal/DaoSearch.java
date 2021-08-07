/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Product;

/**
 *
 * @author mynameis
 */
public class DaoSearch {
    Connection con ;
    public List<Product> getProByName(String name) {
        List<Product> list = new ArrayList<>();
        String sql = "select * from Product where name like ?";
        try {
            con = new DBcontext().getConnection();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, name+"%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8));
                list.add(p);
            }

        } catch (Exception e) {
        }
        return list;
    }
    public static void main(String[] args) {
        DaoSearch ds =new DaoSearch();
        List<Product> list =ds.getProByName("i");
        //System.out.println(list);
        for (Product product : list) {
            System.out.println(product.toString());
        }
    }
    
}
