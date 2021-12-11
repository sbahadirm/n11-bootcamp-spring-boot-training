package com.bahadirmemis.springboot.dao;

import com.bahadirmemis.springboot.entity.Urun;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrunDao extends CrudRepository<Urun, Long> {

}