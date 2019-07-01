package coffeeshop.upandgo.model.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class ProductListEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

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
}