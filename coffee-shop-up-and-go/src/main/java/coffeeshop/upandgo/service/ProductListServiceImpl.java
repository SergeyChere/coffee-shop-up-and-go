package coffeeshop.upandgo.service;

import coffeeshop.upandgo.converter.CommonConverter;
import coffeeshop.upandgo.model.entity.ProductListEntity;
import coffeeshop.upandgo.model.web.request.ProductListRequestDTO;
import coffeeshop.upandgo.model.web.response.ProductListResponseDTO;
import coffeeshop.upandgo.repository.ProductListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductListServiceImpl implements ProductListService {

    @Autowired
    ProductListRepository listRepository;

    @Autowired
    private CommonConverter commonConverter;

    @Override
    public ProductListResponseDTO save(ProductListRequestDTO request) {
        ProductListEntity requestEntity = commonConverter.getToRequestEntityConverter()
                .convert(request);
        listRepository.save(requestEntity);
        return commonConverter.getToResponseDTOConverter().convert(requestEntity);
    }

    @Override
    public List<ProductListResponseDTO> findAll() {
        List<ProductListEntity> productListEntities = listRepository.findAll();
        return commonConverter.getToResponseDTOConverter().convertList(productListEntities);
    }

}