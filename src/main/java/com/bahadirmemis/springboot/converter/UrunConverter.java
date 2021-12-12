package com.bahadirmemis.springboot.converter;

import com.bahadirmemis.springboot.dto.UrunDetayDto;
import com.bahadirmemis.springboot.dto.UrunDto;
import com.bahadirmemis.springboot.entity.Urun;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UrunConverter {

    UrunConverter INSTANCE = Mappers.getMapper(UrunConverter.class);

    @Mapping(source = "kategoriId", target = "kategori.id")
    Urun convertUrunDtoToUrun(UrunDto urunDto);

    @Mapping(target = "kategoriId", source = "kategori.id")
    UrunDto convertUrunToUrunDto(Urun urun);

    @Mapping(source = "fiyat", target = "urunFiyati")
    @Mapping(source = "adi", target = "urunAdi")
    @Mapping(source = "kategori.adi", target = "kategoriAdi")
    UrunDetayDto convertUrunToUrunDetayDto(Urun urun);

    @Mapping(source = "fiyat", target = "urunFiyati")
    @Mapping(source = "adi", target = "urunAdi")
    @Mapping(source = "kategori.adi", target = "kategoriAdi")
    List<UrunDetayDto> convertAllUrunListToUrunDetayDtoList(List<Urun> urunList);
}
