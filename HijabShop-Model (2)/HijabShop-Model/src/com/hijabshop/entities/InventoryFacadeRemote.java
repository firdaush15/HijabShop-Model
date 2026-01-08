package com.hijabshop.entities;

import java.util.List;
import javax.ejb.Remote;

@Remote
public interface InventoryFacadeRemote {

    // --- Existing Product Methods ---
    HijabProduct[] getAllProducts() throws InventoryException;

    HijabProduct getProduct(String sku) throws InventoryException;

    void addProduct(HijabProduct product) throws InventoryException;

    // --- NEW: Edit & Delete Methods ---
    void updateProduct(HijabProduct product) throws InventoryException;

    void deleteProduct(String sku) throws InventoryException;

    // --- Existing Customer Methods ---
    void registerCustomer(CustomerProfile customer) throws InventoryException;

    CustomerProfile loginCustomer(String email, String password) throws InventoryException;

    // --- Existing Order Methods ---
    void createOrder(CustomerOrder order) throws InventoryException;

    List<CustomerOrder> getAllOrders() throws InventoryException;

    double getTotalRevenue() throws InventoryException;
}
