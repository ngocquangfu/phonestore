package model;

public class Order {
    
    private String image;
    private String name;
    private int quantity;
    private double totalPrice;
    private int pid;

    public Order() {
    }

    public Order( String image, String name, int quantity, double totalPrice,int pid) {
        this.pid = pid;
        this.image = image;
        this.name = name;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Order{" + "image=" + image + ", name=" + name + ", quantity=" + quantity + ", totalPrice=" + totalPrice + ", pid=" + pid + '}';
    }
    

   
    
    
    
}
