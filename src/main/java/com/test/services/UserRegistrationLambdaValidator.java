package com.test.services;

import java.util.function.Predicate;

public class UserRegistrationLambdaValidator {
    public static Predicate<String> firstNameValidator =
            name -> name.matches("^[A-Z][a-zA-Z]{2,}$");


    public static Predicate<String> lastNameValidator =
            name -> name.matches("^[A-Z][a-zA-Z]{2,}$");


    public static Predicate<String> emailValidator =
            email -> email.matches("^[a-z0-9]+(\\.[a-z0-9]+)?@[a-z]+\\.[a-z]{2,}$");


    public static Predicate<String> mobileValidator =
            mobile -> mobile.matches("^[0-9]{2} [0-9]{10}$");


    public static Predicate<String> passwordValidator =
            password -> password.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}");


}
