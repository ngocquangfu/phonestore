package model;

/**
 *
 * @author mynameis
 */
public class ProductDetail {
    private int id ;
    private String name ;
    private double price ;
    private String image ;
    private String color ,ram,made,hdh;
    

    public ProductDetail(){
    }

    public ProductDetail(int id,String name, double price,String image, String color, String ram, String made, String hdh) {
        this.id=id;
        this.name = name;
        this.price = price;
        this.image=image;
        this.color = color;
        this.ram = ram;
        this.made = made;
        this.hdh = hdh;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public String getHdh() {
        return hdh;
    }

    public void setHdh(String hdh) {
        this.hdh = hdh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ProductDetail{" + "id=" + id + ", name=" + name + ", price=" + price + ", image=" + image + ", color=" + color + ", ram=" + ram + ", made=" + made + ", hdh=" + hdh + '}';
    }
    

    
   
}
