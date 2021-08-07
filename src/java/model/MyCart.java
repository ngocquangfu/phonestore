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
public class MyCart {
    private int id ;
    private int quantity ;
    private double priceTotal;
    private int oid ;

    public MyCart() {
    }

    public MyCart(int id, int quantity, double priceTotal, int oid) {
        this.id = id;
        this.quantity = quantity;
        this.priceTotal = priceTotal;
        this.oid = oid;
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

    public double getPriceTotal() {
        return priceTotal;
    }

    public void setPriceTotal(double priceTotal) {
        this.priceTotal = priceTotal;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    @Override
    public String toString() {
        return "MyCart{" + "id=" + id + ", quantity=" + quantity + ", priceTotal=" + priceTotal + ", oid=" + oid + '}';
    }
    
    
}
