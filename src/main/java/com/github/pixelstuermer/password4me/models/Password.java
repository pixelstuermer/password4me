package com.github.pixelstuermer.password4me.models;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public final class Password {

   private final String password;
   private final int length;

}
