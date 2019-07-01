package coffeeshop.upandgo.converter;

import coffeeshop.upandgo.converter.request.ProductListDTOConverterToProductListEntity;
import coffeeshop.upandgo.converter.response.ProductListEntityConverterToProductListDTO;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class CommonConverter {

    private ProductListDTOConverterToProductListEntity toRequestEntityConverter;
    private ProductListEntityConverterToProductListDTO toResponseDTOConverter;

    @Autowired
    CommonConverter(ProductListDTOConverterToProductListEntity toRequestConverter,
                    ProductListEntityConverterToProductListDTO toResponseConverter) {
        this.toRequestEntityConverter =toRequestConverter;
        this.toResponseDTOConverter =toResponseConverter;
    }
}