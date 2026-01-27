package com.test.services;

public class UserRegistrationValidator {
    public boolean validateFirstName(String firstName){
        return firstName.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    public boolean validateLastName(String lastName) {
        return lastName.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    public boolean validateEmail(String email) {
        return email.matches("^[a-z]+(\\.[a-z]+)?@[a-z]+\\.[a-z]{2,}(\\.[a-z]{2,})?$");
    }

    public boolean validateMobile(String mobile) {
        return mobile.matches("^[0-9]{2} [0-9]{10}$");
    }

    public boolean validatePassword(String password) {
        return password.matches("^(?=(?:[^!@#$%^&*()]*[!@#$%^&*()]){1}[^!@#$%^&*()]*$)(?=.*[A-Z])(?=.*[0-9]).{8,}$");
    }
}
