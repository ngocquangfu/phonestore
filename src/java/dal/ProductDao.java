package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Product;
import model.ProductDetail;

public class ProductDao {

    Connection con;

    public List<Product> getAllProducts() {
        List<Product> list = new ArrayList<>();
        String sql = "select * from Product";
        try {
            con = new DBcontext().getConnection();
            PreparedStatement st = con.prepareStatement(sql);
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
    /// load du lieu theo 
    public List<Product> getProById(String ctid) {

        List<Product> list = new ArrayList<>();
        String sql = "select * from Product where ctid=?";
        try {
            con = new DBcontext().getConnection();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, ctid);
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

    public List<Product> getProByPage(List<Product> list, int start, int end) {
        List<Product> t = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            t.add(list.get(i));
        }
        return t;
    }

   

   
    /// tim sid để tìm ra thuộc tính của productdetail
    public int getSid(int id){
        String sql ="select d.sid from Product d where d.id=?";
        try {
            con =new DBcontext().getConnection();
            PreparedStatement st =con.prepareStatement(sql);
            st.setInt(1,id);
            ResultSet rs =st.executeQuery();
            while(rs.next()){
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return -1;
    }
    public List<ProductDetail> getProDeById(String pdid) {
        List<ProductDetail> list = new ArrayList<>();
        String sql = "select d.id,d.name,d.price,d.image,d.color,pd.ram,pd.made,pd.hdh\n"
                + "from Product d ,ProductDetail  pd\n"
                + "where d.sid=pd.pdid and pd.pdid=?";
        try {
            con = new DBcontext().getConnection();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, pdid);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ProductDetail p = new ProductDetail(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8));
                list.add(p);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    /// lấy product by id 
    public ProductDetail getProductDetail(String pdid){
       
        String sql = "select d.id,d.name,d.price,d.image,d.color,pd.ram,pd.made,pd.hdh\n"
                + "from Product d ,ProductDetail  pd\n"
                + "where d.sid=pd.pdid and pd.pdid=?";
        try {
            con = new DBcontext().getConnection();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, pdid);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return new ProductDetail(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8));
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        return null;
    }
    //lay product theo id
    public Product getProById(int id){
        
        String sql = "select * from Product where id=?";
        try {
            con = new DBcontext().getConnection();
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return  new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8));
               
            }

        } catch (Exception e) {
        }
        return null;
    }
    public void SearchByName(String name){
        
    }
    public void deleteByPid(int pid){
        String sql="Delete from Product where id=?";
        try {
            con =new DBcontext().getConnection();
            PreparedStatement st =con.prepareStatement(sql);
            st.setInt(1, pid);
            st.executeUpdate();
        } catch (Exception e) {
        }
    }
     public static void main(String[] args) {
        ProductDao pd = new ProductDao();
        List<Product> i = pd.getProById("1");
        List<Product> po =pd.getAllProducts();
        for(Product p:po){
            System.out.println(p.getId());
        }
        int k =pd.getSid(6);
        
        
        
        
        
        
        
        
        
        List<ProductDetail> p =pd.getProDeById(k+"");
        for(ProductDetail pt :p){
            System.out.println(pt.toString());
        }
         System.out.println(k);
         ProductDetail gg =pd.getProductDetail("6");
         System.out.println(gg.toString()+"----");
         Product pro =pd.getProById(12);
         System.out.println("PPPPPPP");
         System.out.println(pro.toString());
         

    }
    
}
