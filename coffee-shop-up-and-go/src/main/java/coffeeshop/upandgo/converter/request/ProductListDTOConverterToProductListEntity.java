package coffeeshop.upandgo.converter.request;

import coffeeshop.upandgo.model.entity.ProductListEntity;
import coffeeshop.upandgo.model.web.request.ProductListRequestDTO;
import org.springframework.stereotype.Component;

import org.springframework.core.convert.converter.Converter;

@Component
public class ProductListDTOConverterToProductListEntity implements
        Converter<ProductListRequestDTO, ProductListEntity> {

    @Override
    public ProductListEntity convert(ProductListRequestDTO productListRequestDTO) {
        return ProductListEntity.builder().page(productListRequestDTO.getPage())
                .title(productListRequestDTO.getTitle()).shortDescription(productListRequestDTO.getShortDescription())
                .type(productListRequestDTO.getType()).previewImage(productListRequestDTO.getPreviewImage())
                .price(productListRequestDTO.getPrice()).inStockCount(productListRequestDTO.getInStockCount())
                .flavour(productListRequestDTO.getFlavour()).rate(productListRequestDTO.getRate())
                .decaf(productListRequestDTO.getDecaf()).coffeeType(productListRequestDTO.getCoffeeType())
                .results(productListRequestDTO.getResults()).search(productListRequestDTO.getSearch())
                .priceMin(productListRequestDTO.getPriceMin()).priceMax(productListRequestDTO.getPriceMax())
                .build();
    }
}