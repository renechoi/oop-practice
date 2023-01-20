package org.example;

public class CorrectlyFixedPasswordGenerator implements PasswordGenerator{
    @Override
    public String generatePassword() {
        return "abcdefgh";
    }
}
