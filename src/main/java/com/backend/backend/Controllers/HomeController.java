package com.backend.backend.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.HttpStatus.*;

@RestController
@CrossOrigin
public class HomeController {
    @GetMapping
    public ResponseEntity<Map<String,String>> Home(){
        Map<String,String> map = new HashMap<>();
        map.put("msg","Hello From Spring boot");
        return ResponseEntity.status(OK).body(map);
    }
}
