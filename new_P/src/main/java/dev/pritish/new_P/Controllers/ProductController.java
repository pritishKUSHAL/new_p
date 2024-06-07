package dev.pritish.new_P.Controllers;

import dev.pritish.new_P.dtos.ProductDtos;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @GetMapping("/products")
    public String getAllproduct(){
        return "Getting all products";
    }

    public String getsingleProduct(){
        return "getting single product";
    }
    @PostMapping("/products")
    public String addnewproduct(@RequestBody ProductDtos productDtos){
        return "adding new product";
    }
    public String updateproduct(){
        return "updating new product";
    }
    @DeleteMapping("/products/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId){
        return "deleting new product";
    }
}
