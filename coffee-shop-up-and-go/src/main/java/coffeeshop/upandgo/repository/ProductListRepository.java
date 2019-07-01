package coffeeshop.upandgo.repository;

import coffeeshop.upandgo.model.entity.ProductListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductListRepository extends JpaRepository<ProductListEntity, Long> {
}