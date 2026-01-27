package com.test.services;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@RunWith(Parameterized.class)
public class EmailParameterizedTest {
    private String email;
    private boolean expectedResult;


    public EmailParameterizedTest(String email, boolean expectedResult) {
        this.email = email;
        this.expectedResult = expectedResult;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> getTestData() {
        return Stream.of(
                new Object[]{"abc@gmail.com", true},
                new Object[]{"abc.xyz@gmail.com", true},
                new Object[]{"abc123@gmail.com", true},
                new Object[]{"abc@gmail", false},
                new Object[]{"abc@.com", false},
                new Object[]{"abc@com", false},
                new Object[]{"abc.com", false},
                new Object[]{"@gmail.com", false}
        ).collect(Collectors.toList());
    }



    @Test
    public void testEmail() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        Assert.assertEquals(expectedResult, validator.validateEmail(email));
    }
}
