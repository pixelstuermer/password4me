package com.github.pixelstuermer.password4me.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pixelstuermer.password4me.models.ValidationInfo;
import com.github.pixelstuermer.password4me.utils.PasswordValidator;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping( value = "/" )
@Api( "Controller to validate a given password" )
public class PwValidatorController {

   @RequestMapping( method = RequestMethod.GET, value = "/validate/{password}" )
   @PreAuthorize( "hasRole('ADMIN')" )
   @ApiOperation( value = "Checks and validates a given password" )
   public ResponseEntity<ValidationInfo> validatePw(
      @PathVariable( value = "password", required = true ) String password ) {
      return ResponseEntity.status( 200 ).body( PasswordValidator.validatePassword( password ) );
   }

}
