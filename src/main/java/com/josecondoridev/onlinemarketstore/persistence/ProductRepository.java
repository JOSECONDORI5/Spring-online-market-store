package com.josecondoridev.onlinemarketstore.persistence;

import com.josecondoridev.onlinemarketstore.persistence.crud.ProductCrudRepository;
import com.josecondoridev.onlinemarketstore.persistence.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {

    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll() {
        return (List<Product>) productCrudRepository.findAll();
    }

    public List<Product> findByIdCategory(int idCategory) {
        return productCrudRepository.findByIdCategoryOrderByNameAsc(idCategory);
    }

    public Optional<List<Product>> getScarce(int quantity) {
        return productCrudRepository.findByStockLessThanAndStatus(quantity, true);
    }

    public Optional<Product> getProduct(int idProduct) {
        return productCrudRepository.findById(idProduct);
    }

    public Product saveProduct(Product product) {
        return productCrudRepository.save(product);
    }

    public void deleteProduct(int idProduct) {
        productCrudRepository.deleteById(idProduct);
    }
}
