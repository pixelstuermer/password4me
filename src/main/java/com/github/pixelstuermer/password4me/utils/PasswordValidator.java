package com.github.pixelstuermer.password4me.utils;

import com.github.pixelstuermer.password4me.models.ValidationInfo;

public final class PasswordValidator {

   public static ValidationInfo validatePassword( String password ) {
      ValidationInfo validationInfo = new ValidationInfo();
      validationInfo.setLength( password.length() );
      validationInfo.setHasSmallChars( checkForSmallChars( password ) );
      validationInfo.setHasCapsChars( checkForCapsChars( password ) );
      validationInfo.setHasNumberChars( checkForNumberChars( password ) );
      validationInfo.setHasSpecialChars( checkForSpecialChars( password ) );
      return validationInfo;
   }

   private static boolean checkForSmallChars( String password ) {
      boolean hasSmallChars = false;
      for ( char pwChar : password.toCharArray() ) {
         for ( char smallChar : CharacterUtils.SMALL_CHARS ) {
            if ( pwChar == smallChar ) {
               hasSmallChars = true;
            }
         }
      }
      return hasSmallChars;
   }

   private static boolean checkForCapsChars( String password ) {
      boolean hasCapsChars = false;
      for ( char pwChar : password.toCharArray() ) {
         for ( char capsChar : CharacterUtils.CAPITAL_CHARS ) {
            if ( pwChar == capsChar ) {
               hasCapsChars = true;
            }
         }
      }
      return hasCapsChars;
   }

   private static boolean checkForNumberChars( String password ) {
      boolean hasNumberChars = false;
      for ( char pwChar : password.toCharArray() ) {
         for ( char numberChar : CharacterUtils.NUMBER_CHARS ) {
            if ( pwChar == numberChar ) {
               hasNumberChars = true;
            }
         }
      }
      return hasNumberChars;
   }

   private static boolean checkForSpecialChars( String password ) {
      boolean hasSpecialChars = false;
      for ( char pwChar : password.toCharArray() ) {
         for ( char specialChar : CharacterUtils.SPECIAL_CHARS ) {
            if ( pwChar == specialChar ) {
               hasSpecialChars = true;
            }
         }
      }
      return hasSpecialChars;
   }

}
