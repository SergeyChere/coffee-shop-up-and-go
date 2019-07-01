package coffeeshop.upandgo.service;

import coffeeshop.upandgo.model.web.request.ProductListRequestDTO;
import coffeeshop.upandgo.model.web.response.ProductListResponseDTO;

import java.util.List;

public interface ProductListService {

    ProductListResponseDTO save(ProductListRequestDTO request);
    List<ProductListResponseDTO> findAll();
}