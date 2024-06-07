package dev.pritish.new_P.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Category extends BaseModel{
    @Getter
    @Setter
    private String name;
    private String discription;
    private List<Product> product;
}
