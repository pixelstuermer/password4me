package com.github.pixelstuermer.password4me.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan( basePackages = "com.github.pixelstuermer.password4me" )
public class ApplicationStarter {

   public static void main( String[] args ) {
      SpringApplication.run( ApplicationStarter.class, args );
   }

}
