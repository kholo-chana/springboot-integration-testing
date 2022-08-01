package com.kholofelo.crud.example;

import com.kholofelo.crud.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestH2Repository extends JpaRepository<Product,Integer> {
}
