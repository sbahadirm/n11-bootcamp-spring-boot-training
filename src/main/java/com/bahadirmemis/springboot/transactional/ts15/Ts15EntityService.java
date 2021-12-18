package com.bahadirmemis.springboot.transactional.ts15;

import com.bahadirmemis.springboot.dao.KategoriDao;
import com.bahadirmemis.springboot.entity.Kategori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

@Service
@Transactional
public class Ts15EntityService {

    private Map<Long, Kategori> kategoriMap = new LinkedHashMap<>();

    @Autowired
    private KategoriDao kategoriDao;

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public Kategori findById(Long id){

        Kategori kategori = kategoriMap.get(id);

        if (kategori != null){
            return kategori;
        }

        Optional<Kategori> optionalKategori = kategoriDao.findById(id);

        if (optionalKategori.isPresent()){
            kategori = optionalKategori.get();
        }

        kategoriMap.put(id, kategori);

        return kategori;
    }

}