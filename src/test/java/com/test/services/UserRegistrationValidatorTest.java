package com.test.services;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class UserRegistrationValidatorTest {
    UserRegistrationValidator validator = new UserRegistrationValidator();


    @Test
    public void testFirstNameWhenValid() {
        Assert.assertTrue(validator.validateFirstName("Kamal"));
    }

    @Test
    public void testFirstNameWhenInvalid() {
        Assert.assertFalse(validator.validateFirstName("kamal"));
    }

    @Test
    public void testnLastNameWhenValid() {
        Assert.assertTrue(validator.validateLastName("Singh"));
    }

    @Test
    public void testLastNameWhenInvalid() {
        Assert.assertFalse(validator.validateLastName("singh"));
    }

    @Test
    public void testEmailWhenValid() {
        Assert.assertTrue(validator.validateEmail("abc.xyz@gmail.com"));
    }

    @Test
    public void testEmailWhenInvalid() {
        Assert.assertFalse(validator.validateEmail("abc@gmail"));
    }


    @Test
    public void testMobileWhenValid() {
        Assert.assertTrue(validator.validateMobile("91 9876543210"));
    }

    @Test
    public void testMobileWhenInvalid() {
        Assert.assertFalse(validator.validateMobile("9876543210"));
    }


    @Test
    public void testPasswordWhenValid() {
        Assert.assertTrue(validator.validatePassword("Kamal@123"));
    }

    @Test
    public void testPasswordWhenInvalid() {
        Assert.assertFalse(validator.validatePassword("kamal123"));
    }
}
