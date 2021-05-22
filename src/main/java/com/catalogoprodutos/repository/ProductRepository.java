package com.catalogoprodutos.repository;

import java.math.BigDecimal;
import java.util.List;

import com.catalogoprodutos.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value= "select * from Product p where p.price >= :min_price and p.price <= :max_price", nativeQuery = true)
    List<Product> findByValue(BigDecimal min_price, BigDecimal max_price);
   
    @Query(value= "select * from Product p where p.price >= :min_price and p.price <= :max_price and (name =:q or description= :q)", nativeQuery = true)
    List<Product> findByValue(BigDecimal min_price, BigDecimal max_price, String q);

}
