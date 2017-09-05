package com.github.pixelstuermer.password4me.utils;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;
import org.springframework.http.ResponseEntity;

import com.github.pixelstuermer.password4me.controllers.PwGenDefaultController;
import com.github.pixelstuermer.password4me.models.Password;
import com.github.pixelstuermer.password4me.models.PasswordList;

public class VarietyTest {

   @Test
   public void test() {
      // mock controller
      PwGenDefaultController controller = new PwGenDefaultController();

      // mock test password data
      Map<String, Integer> pwHashes = new HashMap<>();
      int iterator = 1000;
      for ( int i = 0; i < iterator; i++ ) {
         ResponseEntity<PasswordList> pwResponse = controller.generateDefaultPw();
         for ( Password password : pwResponse.getBody().getPasswords() ) {
            String pw = password.getPassword();
            if ( !pwHashes.containsKey( pw ) ) {
               pwHashes.put( pw, 1 );
            }
            else {
               pwHashes.put( pw, pwHashes.get( pw ) + 1 );
            }
         }
      }

      // test if password generator generated duplicate passwords
      for ( Entry<String, Integer> entry : pwHashes.entrySet() ) {
         assertTrue( entry.getValue() == 1 );
      }
      assertTrue( iterator * 10 == pwHashes.size() );
   }

}
