package com.bahadirmemis.springboot.service.entityservice;

import com.bahadirmemis.springboot.dao.UrunDao;
import com.bahadirmemis.springboot.entity.Urun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UrunEntityService {

    @Autowired
    private UrunDao urunDao;

    public List<Urun> findAll(){
        return (List<Urun>) urunDao.findAll();
    }

    public Urun findById(Long id){
        Optional<Urun> optionalUrun = urunDao.findById(id);

        Urun urun = null;
        if (optionalUrun.isPresent()){
            urun = optionalUrun.get();
        }

        return urun;
    }

    public Urun save(Urun urun){
        urun = urunDao.save(urun);

        return urun;
    }

    public void delete(Urun urun){
        urunDao.delete(urun);
    }

    public void deleteById(Long id){
        urunDao.deleteById(id);
    }

    public long count(){
        return urunDao.count();
    }

    public List<Urun> findAllByKategoriOrderByIdDesc(Long kategoriId){
        return urunDao.findAllByKategoriOrderByIdDesc(kategoriId);
    }
}