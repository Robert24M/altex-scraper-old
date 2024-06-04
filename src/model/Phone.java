package model;

import java.io.Serializable;

public class Phone implements Serializable {


    private int id;
    private String name;
    private String sku;
    private float price;
    private float regular_price;
    private float lowest_price;
    private String discount_type;
    private String brand_name;
    private String brand;



    public Phone(int id, String name, String sku, float price, float regular_price, float lowest_price,
                 String discount_type, String brand_name, String brand) {
        this.id = id;
        this.name = name;
        this.sku = sku;
        this.price = price;
        this.regular_price = regular_price;
        this.lowest_price = lowest_price;
        this.discount_type = discount_type;
        this.brand_name = brand_name;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "model.Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sku='" + sku + '\'' +
                ", price=" + price +
                ", regular_price=" + regular_price +
                ", lowest_price=" + lowest_price +
                ", discount_type='" + discount_type + '\'' +
                ", brand_name='" + brand_name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
