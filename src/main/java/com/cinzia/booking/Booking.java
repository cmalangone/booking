//import org.springframework.boot.*;
//import org.springframework.boot.autoconfigure.*;
//import org.springframework.stereotype.*;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@EnableAutoConfiguration
//public class Booking {
//
//    @RequestMapping("/")
//    String home() {
//        return "Hello World!";
//    }
//
//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(Booking.class, args);
//    }
//
//}
package com.cinzia.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Booking {

    public static void main(String[] args) {
        SpringApplication.run(Booking.class, args);
    }

}