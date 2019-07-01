package coffeeshop.upandgo;

import coffeeshop.upandgo.model.entity.ProductListEntity;
import coffeeshop.upandgo.repository.ProductListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    ProductListRepository productListRepository;

    @Override
    public void run(String... args) throws Exception {
        productListRepository.saveAll(Stream.of(
                ProductListEntity.builder().productId(123123L).title("Coffee title").
                shortDescription("The best coffee in the world").type("coffee")
                .previewImage("base64").price(100.0).inStockCount(30)
                        .flavour("strong").rate(1).decaf(true).coffeeType("robusta").build(),
                ProductListEntity.builder().productId(456456L).title("Tea title").
                        shortDescription("The best tea in the world").type("tea")
                        .previewImage("base64").price(120.0).inStockCount(50)
                        .flavour("soft").rate(1).decaf(true).coffeeType("green tea").build()
                ).collect(Collectors.toList()));
    }
}