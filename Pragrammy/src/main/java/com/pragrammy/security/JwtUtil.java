package com.pragrammy.security;


import java.util.Base64;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


@Component
public class JwtUtil {
	
	private static final String SECRET = "secretkey";
    private static final long EXPIRATION_TIME = 600000; // 10 mins
    public static String generateToken(String username) {
        return Jwts.builder()
            .setSubject(username)
            .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
            .signWith(SignatureAlgorithm.HS512, SECRET)
            .compact();
    }
    public static String extractUsername(String token) {
        return Jwts.parser()
            .setSigningKey(SECRET)
            .parseClaimsJws(token)
            .getBody()
            .getSubject();
    }
   

    public class Base64Utils {
        public static String encodeToString(byte[] bytes) {
            return Base64.getEncoder().encodeToString(bytes);
        }

        public static byte[] decodeFromString(String encodedString) {
            return Base64.getDecoder().decode(encodedString);
        }
    }

}
