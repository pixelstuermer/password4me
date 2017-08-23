package com.github.pixelstuermer.password4me.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomUtils;

public final class CharacterUtils {

   private static final List<Character> CHARACTERS;
   static {
      char[] charArraySmall = "abcdefghijklmnopqrstuvwxyz".toCharArray();
      char[] charArrayCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
      char[] charArrayNumbers = "0123456789".toCharArray();
      char[] charArraySpecial = "!#$%&()*+,-.:;<>=?[]_{}|".toCharArray();

      CHARACTERS = new ArrayList<>();

      for ( char character : charArraySmall ) {
         CHARACTERS.add( character );
      }
      for ( char character : charArrayCaps ) {
         CHARACTERS.add( character );
      }
      for ( char character : charArrayNumbers ) {
         CHARACTERS.add( character );
      }
      for ( char character : charArraySpecial ) {
         CHARACTERS.add( character );
      }
   }

   public static char getRandomCharacter() {
      return CHARACTERS.get( RandomUtils.nextInt( 0, CHARACTERS.size() - 1 ) );
   }

}
