package com.github.pixelstuermer.password4me.utils;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.github.pixelstuermer.password4me.models.ValidationInfo;

@RunWith( MockitoJUnitRunner.class )
public class ValidatorTest {

   @Test
   public void validateSmallCharsPassword() {
      // mock data
      String pw = "laiuoopwmvhuwerjsdfosjf";
      ValidationInfo validationInfo = PasswordValidator.validatePassword( pw );

      // run tests
      assertTrue( validationInfo.getLength() == pw.length() );
      assertTrue( validationInfo.isHasSmallChars() == true );
      assertTrue( validationInfo.isHasCapsChars() == false );
      assertTrue( validationInfo.isHasNumberChars() == false );
      assertTrue( validationInfo.isHasSpecialChars() == false );
   }

   @Test
   public void validateCapsCharsPassword() {
      // mock data
      String pw = "SDFKLSDFIQWEMSDFNSDFWERLYYXAD";
      ValidationInfo validationInfo = PasswordValidator.validatePassword( pw );

      // run tests
      assertTrue( validationInfo.getLength() == pw.length() );
      assertTrue( validationInfo.isHasSmallChars() == false );
      assertTrue( validationInfo.isHasCapsChars() == true );
      assertTrue( validationInfo.isHasNumberChars() == false );
      assertTrue( validationInfo.isHasSpecialChars() == false );
   }

   @Test
   public void validateNumberCharsPassword() {
      // mock data
      String pw = "83204932584954739534570234";
      ValidationInfo validationInfo = PasswordValidator.validatePassword( pw );

      // run tests
      assertTrue( validationInfo.getLength() == pw.length() );
      assertTrue( validationInfo.isHasSmallChars() == false );
      assertTrue( validationInfo.isHasCapsChars() == false );
      assertTrue( validationInfo.isHasNumberChars() == true );
      assertTrue( validationInfo.isHasSpecialChars() == false );
   }

   @Test
   public void validateSpecialCharsPassword() {
      // mock data
      String pw = "!#$%)*+,-:(?[]_{}|&;<>=";
      ValidationInfo validationInfo = PasswordValidator.validatePassword( pw );

      // run tests
      assertTrue( validationInfo.getLength() == pw.length() );
      assertTrue( validationInfo.isHasSmallChars() == false );
      assertTrue( validationInfo.isHasCapsChars() == false );
      assertTrue( validationInfo.isHasNumberChars() == false );
      assertTrue( validationInfo.isHasSpecialChars() == true );
   }

   @Test
   public void validateAllCharsPassword() {
      // mock data
      String pw = "a-ff*96ha3VaZ:}9os63aU<$43$e##";
      ValidationInfo validationInfo = PasswordValidator.validatePassword( pw );

      // run tests
      assertTrue( validationInfo.getLength() == pw.length() );
      assertTrue( validationInfo.isHasSmallChars() == true );
      assertTrue( validationInfo.isHasCapsChars() == true );
      assertTrue( validationInfo.isHasNumberChars() == true );
      assertTrue( validationInfo.isHasSpecialChars() == true );
   }

}
