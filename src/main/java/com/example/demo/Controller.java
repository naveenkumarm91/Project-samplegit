package com.example.demo;


import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: naveenkumar
 * Created On: 18/08/2025 10:48 pm
 * Description: Controller
 */
@RestController
public class Controller {
    public ResponseEntity<?> getGreets(@RequestParam("names")String names){
        return new ResponseEntity<>("Resolver-help"+names, HttpStatus.OK);
    }
}
