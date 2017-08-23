package com.github.pixelstuermer.password4me.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pixelstuermer.password4me.models.Password;
import com.github.pixelstuermer.password4me.models.PasswordList;
import com.github.pixelstuermer.password4me.models.PasswordMap;
import com.github.pixelstuermer.password4me.utils.PasswordGenerator;

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

   @RequestMapping( method = RequestMethod.GET, value = "/generatePw/20" )
   @ApiOperation( value = "Returns 10 sample passwords, each with with 20 characters" )
   public ResponseEntity<PasswordList> generatePwTwenty() {
      PasswordList passwordList = new PasswordList();
      for ( int i = 0; i < 10; i++ ) {
         Password password = PasswordGenerator.generatePassword( 20 );
         passwordList.getPasswords().add( password );
      }
      return ResponseEntity.status( 200 ).body( passwordList );
   }

   @RequestMapping( method = RequestMethod.GET, value = "/generatePw/50" )
   @ApiOperation( value = "Returns a sample password with 50 characters" )
   public ResponseEntity<PasswordMap> generatePwTen() {
      PasswordMap passwordMap = new PasswordMap();
      Password password = PasswordGenerator.generatePassword( 50 );
      passwordMap.getPasswords().put( "password", password.getPassword() );
      passwordMap.getPasswords().put( "length", password.getLength() );
      return ResponseEntity.status( 200 ).body( passwordMap );
   }

}
