package com.bahadirmemis.springboot.dao;

import com.bahadirmemis.springboot.entity.Kategori;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KategoriDao extends CrudRepository<Kategori, Long> {

}