package com.example.demo;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable ;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: naveenkumar
 * Created On: 18/08/2025 10:48 pm
 * Description: Controller
 */
@RestController
public class Controller {
    /**
     * By wi-12001
     * @param names
     * @return
     */
    @GetMapping("/")
    public ResponseEntity<?> getGreets(@RequestParam("names")String names){
        return new ResponseEntity<>("Resolver-help"+names, HttpStatus.OK);
    }


    /**
     * add in branch wi 12002
     * @param system
     * @return
     */
    @GetMapping("/out/{system}")
    public ResponseEntity<?> getGreetsOut(@PathVariable("system") String system){
        return new ResponseEntity<>("Resolver-help::"+system+" !.", HttpStatus.OK);
    }

    @GetMapping("/greet")
    public ResponseEntity<?> getGreeting(){
        return new ResponseEntity<>("Resolver-help "+Thread.currentThread().getName(), HttpStatus.OK);
    }
}
