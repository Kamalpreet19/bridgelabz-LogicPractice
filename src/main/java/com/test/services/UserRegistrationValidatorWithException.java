package com.test.services;

public class UserRegistrationValidatorWithException {
    public void validateFirstName(String firstName) throws InvalidUserException {
        if (!firstName.matches("^[A-Z][a-zA-Z]{2,}$")) {
            throw new InvalidUserException("Invalid First Name");
        }
    }

    public void validateLastName(String lastName) throws InvalidUserException {
        if (!lastName.matches("^[A-Z][a-zA-Z]{2,}$")) {
            throw new InvalidUserException("Invalid Last Name");
        }
    }

    public void validateEmail(String email) throws InvalidUserException {
        if (!email.matches("^[a-z0-9]+(\\.[a-z0-9]+)?@[a-z]+\\.[a-z]{2,}$")) {
            throw new InvalidUserException("Invalid Email");
        }
    }

    public void validateMobile(String mobile) throws InvalidUserException {
        if (!mobile.matches("^[0-9]{2} [0-9]{10}$")) {
            throw new InvalidUserException("Invalid Mobile");
        }
    }

    public void validatePassword(String password) throws InvalidUserException {
        if (!password.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}")) {
            throw new InvalidUserException("Invalid Password");
        }
    }
}