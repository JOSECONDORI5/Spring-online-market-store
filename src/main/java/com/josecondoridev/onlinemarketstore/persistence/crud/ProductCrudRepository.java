package com.josecondoridev.onlinemarketstore.persistence.crud;

import com.josecondoridev.onlinemarketstore.persistence.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductCrudRepository extends CrudRepository <Product, Integer> {

   /* @Query(value = "SELECT * FROM product WHERE id_category = ?", nativeQuery = true)
    List<Product> getByIdCategory(int idCategory);*/

    List<Product> findByIdCategoryOrderByNameAsc(int idCategory);
    Optional<List<Product>> findByStockLessThanAndStatus(int stock, boolean status);
}
