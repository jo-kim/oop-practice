package org.example;

import org.example.password.PasswordGeneratePolicy;

public class CorrectFixedPasswordGenerator implements PasswordGeneratePolicy {
    @Override
    public String generatePassword() {
        return "abcdefgh";
    }

}
