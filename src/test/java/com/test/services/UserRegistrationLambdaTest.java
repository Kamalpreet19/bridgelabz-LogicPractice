package com.test.services;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationLambdaTest {
    @Test
    public void FirstNameTestWhenValid() {
        Assert.assertTrue(UserRegistrationLambdaValidator.firstNameValidator.test("Kamal"));
    }

    @Test
    public void FirstNameTestWhenInvalid() {
        Assert.assertFalse(UserRegistrationLambdaValidator.firstNameValidator.test("kamal"));
    }


    @Test
    public void EmailTestWhenValid() {
        Assert.assertTrue(UserRegistrationLambdaValidator.emailValidator.test("abc@gmail.com"));
    }

    @Test
    public void EmailTestWhenInvalid() {
        Assert.assertFalse(UserRegistrationLambdaValidator.emailValidator.test("abc@gmail"));
    }


    @Test
    public void MobileTestWhenValid() {
        Assert.assertTrue(UserRegistrationLambdaValidator.mobileValidator.test("91 9876543210"));
    }


    @Test
    public void PasswordTestWhenInvalid() {
        Assert.assertFalse(UserRegistrationLambdaValidator.passwordValidator.test("kamal"));
    }
}
