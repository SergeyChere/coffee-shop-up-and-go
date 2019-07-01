package coffeeshop.upandgo.controller;

import coffeeshop.upandgo.model.web.request.ProductListRequestDTO;
import coffeeshop.upandgo.model.web.response.ProductListResponseDTO;
import coffeeshop.upandgo.service.ProductListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class ProductListController {

    @Autowired
    ProductListService productListService;

    @PostMapping("/saveProduct")
    public ProductListResponseDTO getAllProductsListByAllFields
            (@RequestBody ProductListRequestDTO request) {
        return productListService.save(request);
    }

    @GetMapping("/products")
    public List<ProductListResponseDTO> findAllProducts() {
        return productListService.findAll();
    }
}