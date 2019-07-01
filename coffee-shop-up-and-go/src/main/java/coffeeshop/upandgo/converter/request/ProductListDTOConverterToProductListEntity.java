package coffeeshop.upandgo.converter;

import coffeeshop.upandgo.model.entity.request.ProductListRequestEntity;
import coffeeshop.upandgo.model.web.ProductListRequestDTO;
import org.springframework.stereotype.Component;

import org.springframework.core.convert.converter.Converter;

@Component
public class ProductListDTOConverterToProductListEntity implements
        Converter<ProductListRequestDTO, ProductListRequestEntity> {

    @Override
    public ProductListRequestEntity convert(ProductListRequestDTO productListRequestDTO) {
        return ProductListRequestEntity.builder().page(productListRequestDTO.getPage())
                .results(productListRequestDTO.getResults()).search(productListRequestDTO.getSearch())
                .priceMin(productListRequestDTO.getPriceMin()).priceMax(productListRequestDTO.getPriceMax())
                .build();
    }
}