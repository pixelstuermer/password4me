package com.github.pixelstuermer.password4me.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pixelstuermer.password4me.models.Password;
import com.github.pixelstuermer.password4me.models.PasswordList;
import com.github.pixelstuermer.password4me.utils.PasswordGenerator;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping( value = "/" )
@Api( "Controller to generate default passwords without parameters" )
public class PwGenDefaultController {

   @RequestMapping( method = RequestMethod.GET, value = "/" )
   @ApiOperation( value = "Returns 10 default passwords, each with with 12 characters length" )
   public ResponseEntity<PasswordList> generatePwTwenty() {
      PasswordList passwordList = new PasswordList();
      for ( int i = 0; i < 10; i++ ) {
         Password password = PasswordGenerator.generatePassword( 12, true, true, true, true );
         passwordList.getPasswords().add( password );
      }
      return ResponseEntity.status( 200 ).body( passwordList );
   }

}
