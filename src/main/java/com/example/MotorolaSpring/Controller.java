package com.example.MotorolaSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    ProductDao productDao = new ProductDao();

    @GetMapping("/products/list")
    @ResponseBody
    public String productList() {
        return productDao.all().toString();
    }


    @GetMapping("/products/details/{name}")
    @ResponseBody
    public String productDescription(@PathVariable("name") String name){
        return productDao.byName(name).getDescription();
    }

}
