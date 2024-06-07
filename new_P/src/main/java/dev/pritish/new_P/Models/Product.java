package dev.pritish.new_P.Models;

import lombok.Getter;
import lombok.Setter;

public class Product extends BaseModel{
    @Getter
    @Setter
    private String title;
    private double price;
    private String discription;
    private Category category;
    private String imageURL;

}
