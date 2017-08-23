package com.github.pixelstuermer.password4me.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class PasswordList {

   private List<Password> passwords;

   public PasswordList() {
      this.passwords = new ArrayList<>();
   }

}
