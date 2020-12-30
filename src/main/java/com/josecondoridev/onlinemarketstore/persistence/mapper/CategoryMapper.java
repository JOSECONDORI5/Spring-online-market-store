package com.josecondoridev.onlinemarketstore.persistence.mapper;

import com.josecondoridev.onlinemarketstore.persistence.entity.Category;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "idCategory", target = "categoryId"),
            @Mapping(source = "description", target = "category"),
            @Mapping(source = "status", target = "active"),
    })
    Category toCategory(Category category);

    /*@InheritInverseConfiguration
    @Mapping(target = "product", ignore = true)
    Category toCategory(Category category);*/
}
