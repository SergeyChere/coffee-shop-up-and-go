package coffeeshop.upandgo.model.web.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProductListResponseDTO {

    private Long productId;
    private String title;
    private String shortDescription;
    private String type;
    private String previewImage;
    private Double price;
    private Integer inStockCount;

    private String flavour;
    private Integer rate;
    private Boolean decaf;
    private String coffeeType;
}
