package com.example.mmtms;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hotels {

    @GetMapping("/hotels")
    public String getData() {return "Book a hotels at 30% discount!!";}

}
