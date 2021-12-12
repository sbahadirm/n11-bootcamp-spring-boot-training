package com.bahadirmemis.springboot.service.entityservice;

import com.bahadirmemis.springboot.dao.KategoriDao;
import com.bahadirmemis.springboot.entity.Kategori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KategoriEntityService {

    @Autowired
    private KategoriDao kategoriDao;

    public List<Kategori> findAll(){
        return (List<Kategori>) kategoriDao.findAll();
    }

    public Kategori findById(Long id){
        Optional<Kategori> optionalKategori = kategoriDao.findById(id);

        Kategori kategori = null;
        if (optionalKategori.isPresent()){
            kategori = optionalKategori.get();
        }

        return kategori;
    }

    public Kategori save(Kategori kategori){
        return kategoriDao.save(kategori);
    }

    public void delete(Kategori kategori){
        kategoriDao.delete(kategori);
    }

    public void deleteById(Long id){
        kategoriDao.deleteById(id);
    }

    public long count(){
        return kategoriDao.count();
    }

    public List<Kategori> findAllByUstKategoriIsNull(){
        return kategoriDao.findAllByUstKategoriIsNullOrderByAdiDesc();
    }

    public List<Kategori> findAllByAdiEndsWith(String adi){
        return kategoriDao.findAllByAdiEndsWith(adi);
    }
}