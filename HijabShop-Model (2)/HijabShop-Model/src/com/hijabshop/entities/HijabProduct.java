package com.hijabshop.entities;

// Import Serializable for entity persistence and session transfer
import java.io.Serializable;

// Import JPA annotations for ORM (Object-Relational Mapping)
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// Marks this class as a JPA Entity
@Entity

// Maps this entity to the HIJAB_PRODUCT table in the database
@Table(name = "HIJAB_PRODUCT")
public class HijabProduct implements Serializable {

    // =====================================
    // Primary Key
    // =====================================
    // SKU uniquely identifies each hijab product
    @Id
    @Column(name = "SKU")
    private String sku;

    // =====================================
    // Product Price
    // =====================================
    // Stores the price of the hijab product
    @Column(name = "PRICE")
    private double price;

    // =====================================
    // Product Category
    // =====================================
    // Stores product category (e.g. Shawl, Bawal, Accessories)
    @Column(name = "CATEGORY")
    private String category;

    // =====================================
    // Product Image Path
    // =====================================
    // Stores relative URL/path of the product image
    @Column(name = "IMAGE_URL")
    private String image;

    // =====================================
    // Default Constructor (Required by JPA)
    // =====================================
    public HijabProduct() {
    }

    // =====================================
    // Parameterized Constructor
    // =====================================
    // Used to create a HijabProduct object with all attributes
    public HijabProduct(String sku, double price, String category, String image) {
        this.sku = sku;
        this.price = price;
        this.category = category;
        this.image = image;
    }

    // =====================================
    // Getter and Setter Methods
    // =====================================
    // Provide controlled access to private fields
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
