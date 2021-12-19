package com.bahadirmemis.springboot.mongodb.repository;

import com.bahadirmemis.springboot.mongodb.dto.ProductDetailDto;
import com.bahadirmemis.springboot.mongodb.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

    List<Product> findAllByCategoryId(String categoryId);

    ProductDetailDto findProductDetailDtoById(String id);
}
