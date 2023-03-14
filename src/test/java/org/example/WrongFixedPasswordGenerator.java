package org.example;

import org.example.password.PasswordGeneratePolicy;

public class WrongFixedPasswordGenerator implements PasswordGeneratePolicy {
    @Override
    public String generatePassword() {
        return "ab";
    }

}
