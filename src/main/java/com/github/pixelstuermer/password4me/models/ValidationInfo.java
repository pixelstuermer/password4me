package com.github.pixelstuermer.password4me.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidationInfo {

   private boolean hasSmallChars;
   private boolean hasCapsChars;
   private boolean hasNumberChars;
   private boolean hasSpecialChars;
   private int length;

}
