package com.wh.tolls.util;

import java.security.MessageDigest;

public class MD5Util {

      public static String convertMD5(String key) {
          char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F','G','H','I','G','K',
          'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k',
          'l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
          try {
              byte[] btInput = key.getBytes();
              MessageDigest mdInst = MessageDigest.getInstance("MD5");
              mdInst.update(btInput);
              byte[] md = mdInst.digest();
              int j = md.length; char str[] = new char[j * 2];
              int k = 0;
              for (int i = 0; i < j; i++) {
                  byte byte0 = md[i];
                  str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                  str[k++] = hexDigits[byte0 & 0xf];
              } return new String(str);
          } catch (Exception e) {
              return null;
          }
      }
}
