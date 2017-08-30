package com.github.pixelstuermer.password4me.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomUtils;

import com.github.pixelstuermer.password4me.models.Password;

public final class PasswordGenerator {

   public static Password generatePassword( int length, boolean smallChars, boolean capsChars, boolean numberChars,
      boolean specialChars ) {
      String pwString = generatePwString( length, smallChars, capsChars, numberChars, specialChars );
      Password password = Password.builder().password( pwString ).length( pwString.length() ).build();
      return password;
   }

   private static String generatePwString( int length, boolean smallChars, boolean capsChars, boolean numberChars,
      boolean specialChars ) {
      StringBuilder stringBuilder = new StringBuilder();
      List<Character> charsList = buildCharsList( smallChars, capsChars, numberChars, specialChars );
      for ( int i = 0; i < length; i++ ) {
         stringBuilder.append( getRandomCharacter( charsList ) );
      }
      return stringBuilder.toString();
   }

   private static List<Character> buildCharsList( boolean smallChars, boolean capsChars, boolean numberChars,
      boolean specialChars ) {
      List<Character> charsList = new ArrayList<>();

      if ( smallChars ) {
         charsList.addAll( CharacterUtils.SMALL_CHARS );
      }
      if ( capsChars ) {
         charsList.addAll( CharacterUtils.CAPITAL_CHARS );
      }
      if ( numberChars ) {
         charsList.addAll( CharacterUtils.NUMBER_CHARS );
      }
      if ( specialChars ) {
         charsList.addAll( CharacterUtils.SPECIAL_CHARS );
      }

      return charsList;
   }

   private static char getRandomCharacter( List<Character> charsList ) {
      return charsList.get( RandomUtils.nextInt( 0, charsList.size() - 1 ) );
   }

}
