package com.example.mmtms;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Flights {

    @GetMapping("/Flights")
    public String getData() {return "Book a Flight at 20% discount!!";}

}
