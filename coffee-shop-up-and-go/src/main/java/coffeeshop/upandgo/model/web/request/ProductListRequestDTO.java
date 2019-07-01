package coffeeshop.upandgo.model.web;

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
}