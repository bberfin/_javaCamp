package Entities.concretes;

import Entities.abstracts.Entity;

public class Product implements Entity {
    private int id;
    private int categoryId;
    private double unitPrice;
    private int unitsInStock;
    private String name;

    public Product() {
    }

    public Product(int id, int categoryId, double unitPrice, int unitsInStock, String name) {
        this.id = id;
        this.categoryId = categoryId;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    


    
}
