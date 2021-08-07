package model;

public class Item {

   
    private int quantity;
    private double totalPrice;
    private int oid;
    private int pid;

    

    public Item() {
    }
    public Item( int quantity, double totalPrice, int oid, int pid) {
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.oid = oid;
        this.pid = pid;
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

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Item{" + "quantity=" + quantity + ", totalPrice=" + totalPrice + ", oid=" + oid + ", pid=" + pid + '}'+"\n";
    }

   
    
}
