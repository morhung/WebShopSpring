
package model;


public class Item {
    private Product product = new Product();
    private int soLuong;
    private double totalPrice;
    public Item() {
    }

    
    public Item(Product product, int soLuong) {
        this.product = product;
        this.soLuong = soLuong;
    }
    
    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
   
}
