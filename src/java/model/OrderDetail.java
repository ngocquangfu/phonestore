/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author mynameis
 */
public class OrderDetail {
    private int id ;
    private int quantity ;
    private double price ;
    private int pid,oid;
    private boolean status ;
    public OrderDetail() {
    }

    public OrderDetail(int id, int quantity, double price, int pid, int oid, boolean status) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.pid = pid;
        this.oid = oid;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "id=" + id + ", quantity=" + quantity + ", price=" + price + ", pid=" + pid + ", oid=" + oid + ", status=" + status + '}';
    }
    
}
