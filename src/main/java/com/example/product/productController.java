package com.example.product;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class productController {
    @RequestMapping("")
    public String index(HttpSession httpSession){
        return "index.jsp";
    }

    @RequestMapping("products/new")
    public String newProductPage(){
        return "newProduct.jsp";
    }

    @RequestMapping("categories/new")
    public String newCategoryPage(){
        return "newCategory.jsp";
    }
}
