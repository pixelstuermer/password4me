package com.github.pixelstuermer.password4me.utils;

import com.github.pixelstuermer.password4me.models.Password;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public final class PasswordGenerator {

   public static Password generatePassword( int length ) {
      String pwString = generatePwString( length );
      Password password = Password.builder().password( pwString ).length( pwString.length() ).build();
      return password;
   }

   private static String generatePwString( int length ) {
      StringBuilder stringBuilder = new StringBuilder();
      for ( int i = 0; i < length; i++ ) {
         stringBuilder.append( CharacterUtils.getRandomCharacter() );
      }
      return stringBuilder.toString();
   }

}
