package org.example.password;

import org.example.password.PasswordGenerator;

public class CorrectlyFixedPasswordGenerator implements PasswordGenerator {
    @Override
    public String generatePassword() {
        return "abcdefgh";
    }
}
