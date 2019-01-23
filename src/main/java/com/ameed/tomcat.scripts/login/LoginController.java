package com.ameed.tomcat.scripts.login;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.Random;

/**
 * Created by ameed_fah
 * 23/01/2019
 */
@RestController("/login")
public class LoginController {

    @PostMapping
    public String token(@RequestBody LoginCredentials info) {
        if ("admin".equals(info.getUserName()) && "pass".equals(info.getPassword())) {
            return BigInteger.probablePrime(64, new Random()).toString(16);
        }
        return null;
    }
}
