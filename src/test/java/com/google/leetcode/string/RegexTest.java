package com.google.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class RegexTest {

    @Test
    public void testValidFormats() {
        System.out.println(LocalDateTime.now());
        Assert.assertFalse(LocalDateTime.now().toString().matches("^(?!\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}Z$).*"));
        Assert.assertFalse(LocalDateTime.now().toString().matches("^(?!\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}Z$).*"));
        Assert.assertFalse(LocalDateTime.now().toString().matches("^(?!\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}Z$).*"));
    }

    @Test
    public void testInvalidFormats() {

        int abc = 5;
        Assert.assertTrue("2023-15-6T12:34:56Z".matches("^(?!\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}Z$).*"));
        Assert.assertTrue("2023-15-6T12:34:56Z".matches("^(?!\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}Z$).*"));
        Assert.assertTrue("2023-15-6T12:34:56Z".matches("^(?!\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}Z$).*"));

    }
}

