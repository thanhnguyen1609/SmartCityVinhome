package com.thanhnguyen.smartCity.repository;

import com.thanhnguyen.smartCity.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
//    List<Product> findByOrderByName();
//
//    List<Product> findByOrderById(int productId);


}