package com.bahadirmemis.springboot.converter;

import com.bahadirmemis.springboot.dto.KategoriDto;
import com.bahadirmemis.springboot.entity.Kategori;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface KategoriConverter {

    KategoriConverter INSTANCE = Mappers.getMapper(KategoriConverter.class);

    @Mapping(target = "ustKategoriId", source = "ustKategori.id")
    KategoriDto convertKategoriToKategoriDto(Kategori kategori);

    @Mapping(target = "ustKategoriId", source = "ustKategori.id")
    List<KategoriDto> convertAllKategoriListToKategoriDtoList(List<Kategori> kategoriList);

    @Mapping(target = "ustKategori.id", source = "ustKategoriId")
    Kategori convertKategoriDtoToKategori(KategoriDto kategoriDto);

    @AfterMapping
    default void setNulls(@MappingTarget Kategori kategori, KategoriDto kategoriDto){
        if (kategoriDto.getUstKategoriId() == null){
            kategori.setUstKategori(null);
        }
    }
}
