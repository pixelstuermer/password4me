package com.github.pixelstuermer.password4me.controllers;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.github.pixelstuermer.password4me.models.PasswordMap;
import com.github.pixelstuermer.password4me.models.ValidationInfo;
import com.github.pixelstuermer.password4me.utils.PasswordValidator;

@RunWith( MockitoJUnitRunner.class )
public class ParameterControllerTest {

   @InjectMocks
   PwGenParametersController paramController;

   @Test
   public void generateAllCharsPasswordTest() {
      // mock controller and data
      PasswordMap pwMap = paramController.generatePwWithHttpHeaderParams( true, true, true, true, 42 ).getBody();

      // extract generated password components
      ValidationInfo validation = PasswordValidator
         .validatePassword( pwMap.getPasswords().get( "password" ).toString() );

      // test password components
      assertTrue( validation.isHasCapsChars() == true );
      assertTrue( validation.isHasNumberChars() == true );
      assertTrue( validation.isHasSmallChars() == true );
      assertTrue( validation.isHasSpecialChars() == true );
      assertTrue( validation.getLength() == 42 );
   }

}
