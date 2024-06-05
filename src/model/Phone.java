package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
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

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getRegular_price() {
        return regular_price;
    }

    public void setRegular_price(float regular_price) {
        this.regular_price = regular_price;
    }

    public float getLowest_price() {
        return lowest_price;
    }

    public void setLowest_price(float lowest_price) {
        this.lowest_price = lowest_price;
    }

    public String getDiscount_type() {
        return discount_type;
    }

    public void setDiscount_type(String discount_type) {
        this.discount_type = discount_type;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

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

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone{" +
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
