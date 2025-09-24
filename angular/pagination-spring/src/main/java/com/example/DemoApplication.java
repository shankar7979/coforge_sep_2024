package com.example;

import com.example.dao.ProductRepository;
import com.example.model.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    ProductRepository productRepository;

    @Autowired
    private ProductService productService;


    @Override
    public void run(String... args) throws Exception {

        var list1 = Arrays.asList(
                new Product[]{
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(40).build(),
                }
        );
        productRepository.saveAll(list1);
        // for batch operation
        /*for (int i = 0; i < 10; i++) {

            productRepository.saveAll(list1);
            System.out.println("added");
        }*/
        productRepository.findAll().forEach(a -> System.out.println(a));


//        Pageable pageable = PageRequest.of(0, 2, Sort.by("name").ascending());
        Pageable pageable = PageRequest.of(1, 10);

        System.out.println("using pagination ");
        // Call the repository method with Pageable
        Page<Product> myEntitiesPage = productService.getAllProduct(pageable);
        myEntitiesPage.getContent().forEach(System.out::println);
    }
}
//http://localhost:8080/products?page=1&size=10
//http://localhost:8080/products?page=2&size=10
//http://localhost:8080/products?page=3&size=10