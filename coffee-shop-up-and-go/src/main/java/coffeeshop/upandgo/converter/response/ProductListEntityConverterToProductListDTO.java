package coffeeshop.upandgo.converter.response;

import coffeeshop.upandgo.model.entity.ProductListEntity;
import coffeeshop.upandgo.model.web.response.ProductListResponseDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductListEntityConverterToProductListDTO implements
    Converter<ProductListEntity, ProductListResponseDTO> {

    @Override
    public ProductListResponseDTO convert(ProductListEntity productListResponseEtity) {
        return ProductListResponseDTO.builder().productId(productListResponseEtity.getProductId())
                .title(productListResponseEtity.getTitle()).shortDescription(productListResponseEtity.getShortDescription())
                .type(productListResponseEtity.getType()).previewImage(productListResponseEtity.getPreviewImage())
                .price(productListResponseEtity.getPrice()).inStockCount(productListResponseEtity.getInStockCount())
                .flavour(productListResponseEtity.getFlavour()).rate(productListResponseEtity.getRate())
                .decaf(productListResponseEtity.getDecaf()).coffeeType(productListResponseEtity.getCoffeeType())
                .build();
    }

    public List<ProductListResponseDTO> convertList(List<ProductListEntity> productListEntities) {
        return productListEntities.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }
}