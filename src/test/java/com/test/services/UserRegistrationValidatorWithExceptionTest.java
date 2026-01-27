package com.test.services;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationValidatorWithExceptionTest {

    UserRegistrationValidatorWithException validator = new UserRegistrationValidatorWithException();


    @Test
    public void ValidFirstNameTest() {
        try {
            validator.validateFirstName("Kamal");
        } catch (InvalidUserException e) {
            Assert.fail();
        }
    }

    @Test
    public void InvalidFirstNameTest() {
        try {
            validator.validateFirstName("kamal");
            Assert.fail();
        } catch (InvalidUserException e) {
            Assert.assertEquals("Invalid First Name", e.getMessage());
        }
    }


    @Test
    public void ValidEmailTest() {
        try {
            validator.validateEmail("abc@gmail.com");
        } catch (InvalidUserException e) {
            Assert.fail();
        }
    }

    @Test
    public void InvalidEmailTest() {
        try {
            validator.validateEmail("abc@gmail");
            Assert.fail();
        } catch (InvalidUserException e) {
            Assert.assertEquals("Invalid Email", e.getMessage());
        }
    }


    @Test
    public void InvalidMobileTest() {
        try {
            validator.validateMobile("9876543210");
            Assert.fail();
        } catch (InvalidUserException e) {
            Assert.assertEquals("Invalid Mobile", e.getMessage());
        }
    }


    @Test
    public void InvalidPasswordTest() {
        try {
            validator.validatePassword("kamal");
            Assert.fail();
        } catch (InvalidUserException e) {
            Assert.assertEquals("Invalid Password", e.getMessage());
        }
    }
}
