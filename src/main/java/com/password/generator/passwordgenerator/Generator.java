package com.password.generator.passwordgenerator;

import org.apache.commons.lang3.RandomStringUtils;

public class Generator {

    public void generatePassword(int characters){
        String result = RandomStringUtils.random(characters, true, true);
        System.out.println("password = " + result);
    }
}
