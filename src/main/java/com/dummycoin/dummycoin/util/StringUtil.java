package com.dummycoin.dummycoin.util;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class StringUtil {

    public static String applySHA256(String inputString) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(inputString.getBytes(StandardCharsets.UTF_8));

            BigInteger number = new BigInteger(1, hash);
            StringBuilder hexString = new StringBuilder(number.toString());

            while(hexString.length() < 32) {
                hexString.insert(0, '0');
            }

            return hexString.toString();

        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}
