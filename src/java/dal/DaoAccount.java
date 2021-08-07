package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Account;

public class DaoAccount {

    Connection con;

    public Account getAccount(String user, String pass) {
        String sql = "select * from Account where username=? and password=?";
        try {
            con = new DBcontext().getConnection();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, user);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return new Account(
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6));
            }
        } catch (Exception e) {
        }
        return null;
    }

    /// sign up 
    public Account checkUserName(String username) {
        String sql = "select * from Account where username=?";
        try {
            con = new DBcontext().getConnection();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {

                return new Account(
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6));
            }

        } catch (Exception e) {
        }
        return null;

    }

    public void signUpAccount(Account a) {
        String sql = "insert into Account (username,phone,password) values(?,?,?)";
        try {
            con =new DBcontext().getConnection();
            PreparedStatement st =con.prepareStatement(sql);
            st.setString(1, a.getUsername());
            st.setString(2, a.getPhone());
            st.setString(3, a.getPassword());
            st.executeUpdate();

        } catch (Exception e) {
        }

    }

    public int getIDByUserName(String username, String pass) {
        String sql = "select a.id from Account a where a.username=? and a.password=?";
        try {
            con = new DBcontext().getConnection();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2,pass);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return -1;
    }
    public int getIdByUser(String user){
        String sql ="select a.id from Account a where a.username=?";
        try {
            con =new DBcontext().getConnection();
            PreparedStatement st =con.prepareStatement(sql);
            st.setString(1, user);
            ResultSet rs =st.executeQuery();
            while(rs.next()){
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return -1;
            
    }

    public static void main(String[] args) {
          DaoAccount da = new DaoAccount();
//        Account a = da.getAccount("abc", "123");
//        Account c = da.checkUserName("abc");
//        System.out.println(c.toString());
//        System.out.println(a.toString());
//        int id = da.getIdByUser("abc");
//        System.out.println(id);
        //da.signUpAccount(new Account("hello", "123456789", "123", 0, 0));
    }
}
