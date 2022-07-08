package org.crud.productmanager.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    private int id;
    private String name;
    private String brand;
    private String madein;
    private float price;

    public Product(){}

    protected Product(int id, String name, String brand, String madein, float price){
        super();
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.madein = madein;
        this.price =  price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMadein(String madein) {
        this.madein = madein;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getMadein() {
        return madein;
    }

    public float getPrice() {
        return price;
    }

}
