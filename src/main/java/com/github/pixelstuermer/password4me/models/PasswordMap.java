package com.github.pixelstuermer.password4me.models;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class PasswordMap {

   private Map<String, Object> passwords;

   public PasswordMap() {
      this.passwords = new HashMap<>();
   }

}
