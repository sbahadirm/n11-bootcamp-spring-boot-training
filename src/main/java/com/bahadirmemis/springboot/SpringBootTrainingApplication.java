package com.bahadirmemis.springboot;

import com.bahadirmemis.springboot.converter.JsonResponseConverter;
//import com.bahadirmemis.springboot.converter.XmlResponseConverter;
import com.bahadirmemis.springboot.entity.Kategori;
import com.bahadirmemis.springboot.service.WebService;
import com.bahadirmemis.springboot.service.entityservice.KategoriEntityService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootTrainingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootTrainingApplication.class, args);

		KategoriEntityService service = applicationContext.getBean(KategoriEntityService.class);

		List<Kategori> kategoriList = service.findAll();

		for (Kategori kategori : kategoriList) {
			System.out.println(kategori);
		}

	}

}
