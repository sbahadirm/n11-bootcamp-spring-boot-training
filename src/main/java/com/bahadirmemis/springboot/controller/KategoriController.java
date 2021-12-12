package com.bahadirmemis.springboot.controller;

import com.bahadirmemis.springboot.entity.Kategori;
import com.bahadirmemis.springboot.service.entityservice.KategoriEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kategoriler")
public class KategoriController {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    @GetMapping("")
    public List<Kategori> findAll(){
        List<Kategori> kategoriList = kategoriEntityService.findAll();

        return kategoriList;
    }

    @GetMapping("/{id}")
    public Kategori findById(@PathVariable Long id){

        Kategori kategori = kategoriEntityService.findById(id);

        return kategori;
    }

    @PostMapping("")
    public Kategori save(@RequestBody Kategori kategoriInput){ //TODO: Input değeri dto tipinde olmalı

        Kategori kategori = kategoriEntityService.save(kategoriInput);

        return kategori;
    }

    @PutMapping("")
    public Kategori update(@RequestBody Kategori kategoriInput){//TODO: Input değeri dto tipinde olmalı

        Kategori kategori = kategoriEntityService.save(kategoriInput);

        return kategori;
    }

    @DeleteMapping("/{id}")
    public void delete(Long id){
        kategoriEntityService.deleteById(id);
    }
}
