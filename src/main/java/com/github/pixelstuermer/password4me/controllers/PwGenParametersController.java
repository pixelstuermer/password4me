package com.github.pixelstuermer.password4me.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pixelstuermer.password4me.models.Password;
import com.github.pixelstuermer.password4me.models.PasswordMap;
import com.github.pixelstuermer.password4me.utils.PasswordGenerator;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping( value = "/" )
@Api( "Controller to generate passwords with parameters" )
public class PwGenParametersController {

   @RequestMapping( method = RequestMethod.GET, value = "/parameterized" )
   @ApiOperation( value = "Returns a parameterized password according to HTTP headers" )
   public ResponseEntity<PasswordMap> generatePwTen(
      @RequestHeader( value = "smallChars", required = true ) boolean smallChars,
      @RequestHeader( value = "capsChars", required = true ) boolean capsChars,
      @RequestHeader( value = "numberChars", required = true ) boolean numberChars,
      @RequestHeader( value = "specialChars", required = true ) boolean specialChars,
      @RequestHeader( value = "length", required = true ) int length ) {
      PasswordMap passwordMap = new PasswordMap();
      Password password = PasswordGenerator.generatePassword( length, smallChars, capsChars, numberChars,
         specialChars );
      passwordMap.getPasswords().put( "password", password.getPassword() );
      passwordMap.getPasswords().put( "length", password.getLength() );
      passwordMap.getPasswords().put( "smallChars", smallChars );
      passwordMap.getPasswords().put( "capsChars", capsChars );
      passwordMap.getPasswords().put( "numberChars", numberChars );
      passwordMap.getPasswords().put( "specialChars", specialChars );
      return ResponseEntity.status( 200 ).body( passwordMap );
   }

}
