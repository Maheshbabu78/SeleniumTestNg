package com.info.SeleniumTest;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeMethod;

public class TestToGetMethodName {

	@BeforeMethod
    public void handleTestMethodName(Method method)
    {
        String testName = method.getName();
        System.out.println(testName+ " is here");
    }
}
