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
public class Product {

    private int id;
    private String name;
    private double price;

    private String image;
    private String color, description;
    private int ctid, sid;

    public Product() {
    }

    public Product(int id, String name, double price, String image, String color, String description, int ctid, int sid) {
        this.id = id;
        this.name = name;
        this.price = price;

        this.image = image;
        this.color = color;

        this.description = description;
        this.ctid = ctid;
        this.sid = sid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCtid() {
        return ctid;
    }

    public void setCtid(int ctid) {
        this.ctid = ctid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", image=" + image + ", color=" + color + ", description=" + description + ", ctid=" + ctid + ", sid=" + sid + '}';
    }

}
