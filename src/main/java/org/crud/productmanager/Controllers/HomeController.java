package org.crud.productmanager.Controllers;

import org.crud.productmanager.Models.Product;
import org.crud.productmanager.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ProductService service;

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/products")
    public String products(Model model){

        List<Product> listProducts= service.listAll();
        model.addAttribute("listProducts", listProducts);
        return "products";
    }

    @RequestMapping("/newproduct")
    public String newProduct(Model model){

        Product product = new Product();
        model.addAttribute("product",product);

        return "newproduct";
    }

    @RequestMapping(value="/saveproduct", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product") Product product){
        service.save(product);
        return "redirect:/products";
    }


}


