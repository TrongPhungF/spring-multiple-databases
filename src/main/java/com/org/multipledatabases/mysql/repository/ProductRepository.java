package com.org.multipledatabases.mysql.repository;

import com.org.multipledatabases.mysql.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
