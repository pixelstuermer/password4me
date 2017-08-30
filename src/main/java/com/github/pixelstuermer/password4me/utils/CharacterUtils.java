package com.github.pixelstuermer.password4me.utils;

import java.util.ArrayList;
import java.util.List;

public final class CharacterUtils {

   public static final List<Character> SMALL_CHARS;
   public static final List<Character> CAPITAL_CHARS;
   public static final List<Character> NUMBER_CHARS;
   public static final List<Character> SPECIAL_CHARS;

   static {
      SMALL_CHARS = new ArrayList<>();
      CAPITAL_CHARS = new ArrayList<>();
      NUMBER_CHARS = new ArrayList<>();
      SPECIAL_CHARS = new ArrayList<>();

      char[] charArraySmall = "abcdefghijklmnopqrstuvwxyz".toCharArray();
      char[] charArrayCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
      char[] charArrayNumbers = "0123456789".toCharArray();
      char[] charArraySpecial = "!#$%&()*+,-.:;<>=?[]_{}|".toCharArray();

      for ( char character : charArraySmall ) {
         SMALL_CHARS.add( character );
      }
      for ( char character : charArrayCaps ) {
         CAPITAL_CHARS.add( character );
      }
      for ( char character : charArrayNumbers ) {
         NUMBER_CHARS.add( character );
      }
      for ( char character : charArraySpecial ) {
         SPECIAL_CHARS.add( character );
      }
   }

}
