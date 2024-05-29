package com.example.mmtms;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holiday {

    @GetMapping("/holiday")
    public String getData() {return "Book a holiday at 10% discount!!";}

}
