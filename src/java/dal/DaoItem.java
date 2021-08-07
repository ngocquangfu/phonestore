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
import model.Item;
import model.Order;

/**
 *
 * @author mynameis
 */
public class DaoItem {

    Connection con;

    public void addCartToDB(Item item) {
        String sql = "insert into MyCart (quantity,price,oid,pid) values(?,?,?,?)";
        try {
            con = new DBcontext().getConnection();
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, item.getQuantity());
            st.setDouble(2, item.getTotalPrice());
            st.setInt(3, item.getOid());
            st.setInt(4, item.getPid());
            st.executeUpdate();
        } catch (Exception e) {

        }
    }

    public void updateCartToDB(Item item, int oid, int pid) {
        String sql = "update MyCart set quantity=?,price=? where pid=? and oid=?";
        try {
            con = new DBcontext().getConnection();
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, item.getQuantity());
            st.setDouble(2, item.getTotalPrice());
            st.setInt(3, pid);
            st.setInt(4, oid);
            st.executeUpdate();

        } catch (Exception e) {
        }
    }

    public List<Item> getAllMyCart() {
        List<Item> list = new ArrayList<>();
        String sql = "select * from MyCart";
        try {
            con = new DBcontext().getConnection();
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Item i = new Item(rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
                list.add(i);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Item> getItembyOid(int oid) {
        List<Item> list = new ArrayList<>();
        String sql = "select * from AddCart where o.id=?";
        try {
            con = new DBcontext().getConnection();
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, oid);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Item i = new Item(
                        rs.getInt(1),
                        rs.getDouble(2),
                        rs.getInt(3),
                        rs.getInt(4));
                list.add(i);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Order> getAllOrder(int oid) {
        List<Order> list = new ArrayList<>();
//        String sql = "with t as(\n"
//                + "select (pid),sum(m.price) as price,sum(m.quantity) quantity\n"
//                + "from MyCart m where oid=?\n"
//                + "group by pid\n"
//                + ")\n"
//                + "select p.image,p.name,t.quantity,t.price\n"
//                + "from Product p,t where t.pid=p.id ";
        String sql = "select p.name,p.image,m.quantity,m.price,m.pid\n"
                + "from Product p,MyCart m\n"
                + "where m.pid=p.id and oid=?";
        try {

            con = new DBcontext().getConnection();
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, oid);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Order o = new Order(
                        rs.getString(2),
                        rs.getString(1),
                        rs.getInt(3),
                        rs.getDouble(4),
                        rs.getInt(5));

                list.add(o);
            }

        } catch (Exception e) {
        }
        return list;

    }
    public List<Order> getAllMycart(int oid,int pid) {
        List<Order> list = new ArrayList<>();
//        String sql = "with t as(\n"
//                + "select (pid),sum(m.price) as price,sum(m.quantity) quantity\n"
//                + "from MyCart m where oid=?\n"
//                + "group by pid\n"
//                + ")\n"
//                + "select p.image,p.name,t.quantity,t.price\n"
//                + "from Product p,t where t.pid=p.id ";
        String sql = "select p.name,p.image,m.quantity,m.price,m.pid\n"
                + "from Product p,MyCart m\n"
                + "where m.pid=p.id and oid=? and pid=?";
        try {

            con = new DBcontext().getConnection();
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, oid);
            st.setInt(2, pid);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Order o = new Order(
                        rs.getString(2),
                        rs.getString(1),
                        rs.getInt(3),
                        rs.getDouble(4),
                        rs.getInt(5));

                list.add(o);
            }

        } catch (Exception e) {
        }
        return list;

    }
    

    //// lấy list id kiểm tra xem nó cón tồn tại trong mycart hay chưa
    public List<Item> getAllMyCart(int oid) {
        List<Item> list = new ArrayList<>();
        String sql = "select * from mycart where oid=?";
        try {
            con = new DBcontext().getConnection();
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, oid);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Item i = new Item(rs.getInt(2), rs.getDouble(3), rs.getInt(4), rs.getInt(5));
                list.add(i);
            }
        } catch (Exception e) {
        }
        return list;
    }

    /// xóa item của order 
    public void DeleteItem(int pid, int oid) {
        String sql = "delete from MyCart where pid=? and oid=?";
        try {
            con = new DBcontext().getConnection();
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, pid);
            st.setInt(1, oid);

            st.executeUpdate();
        } catch (Exception e) {
        }

    }
    
    // xóa đi giỏ hàng mà người dùng đã mua
    public void DeleteCart(int oid) {
        String sql = "delete from MyCart where  oid=?";
        try {
            con = new DBcontext().getConnection();
            PreparedStatement st = con.prepareStatement(sql);
           
            st.setInt(1, oid);

            st.executeUpdate();
        } catch (Exception e) {
        }

    }
    public void Delete(int pid){
        String sql ="delete from MyCart where pid=?";
        try {
            con =new DBcontext().getConnection();
            PreparedStatement st =con.prepareStatement(sql);
            st.setInt(1, pid);
            st.executeUpdate();
        } catch (Exception e) {
        }
    }
   
   
    public static void main(String[] args) {
        DaoItem di = new DaoItem();
        ///di.addCartToDB(new Item(5, 10, 1, 1));
        // List<Item> list = di.getAllMyCart();
        //System.out.println(list);

        //di.DeleteItem(1, 2);\
        System.out.println("-----------");
        List<Item> list = di.getAllMyCart(1);
        for (Item item : list) {
            if (item.getPid() == 1) {
                System.out.println("yes");
                break;
            } else {
                System.out.println(" no");
            }
        }
        // di.updateCartToDB(new Item(1, 3, 1, 6), 1, 6);
        System.out.println("--------");
        List<Order> o = di.getAllOrder(1);
        for (Order order : o) {
            System.out.println(order.toString());
        }
        List<Order> o1 = di.getAllMycart(1,1);
        System.out.println("+++++");
        for (Order order : o1) {
            System.out.println(order.getPid());
        }
        System.out.println("llllll");
        di.Delete(14);
        
    }

}
