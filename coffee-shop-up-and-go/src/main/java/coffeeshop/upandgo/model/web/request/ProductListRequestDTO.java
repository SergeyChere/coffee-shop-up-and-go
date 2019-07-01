package coffeeshop.upandgo.model.web.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProductListRequestDTO {

    private Integer page;
    private Integer results;
    private String search;
    private Integer priceMin;
    private Integer priceMax;

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

    private String sortBy;

    private Integer bitterFrom;
    private Integer bitterTo;
    private Integer sourFrom;
    private Integer sourTo;
    private Integer strongFrom;
    private Integer strongTo;
//    private Boolean decaf;
    private Boolean ground;
//    private String coffeeType;
}