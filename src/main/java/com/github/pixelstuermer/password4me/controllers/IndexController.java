package com.github.pixelstuermer.password4me.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping( value = "/" )
@Api( "Controller to test index page" )
public class IndexController {

   @RequestMapping( method = RequestMethod.GET, value = "" )
   @ApiOperation( value = "Returns a simple \"Hello World!\"" )
   public ResponseEntity<String> index() {
      return ResponseEntity.status( 200 ).body( "Hello World!" );
   }

}
