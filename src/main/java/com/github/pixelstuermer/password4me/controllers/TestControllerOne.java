package com.github.pixelstuermer.password4me.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/" )
public class TestControllerOne {

   @RequestMapping( method = RequestMethod.GET, value = "" )
   public ResponseEntity<String> index() {
      return ResponseEntity.status( 200 ).body( "Hello World!" );
   }

}
