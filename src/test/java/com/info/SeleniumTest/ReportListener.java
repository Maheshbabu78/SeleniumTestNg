//package com.info.SeleniumTest;
//
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//public class ReportListener implements ITestListener {
//
//
//    //Extent Report Declarations
//    private static ExtentReports extent = ExtentManager.createInstance();
//    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
//
//
//    @Override
//    public void onTestStart(ITestResult result) {
//
//        System.out.println((result.getMethod().getMethodName() + " started!"));
//        //Start operation for extentreports.
//        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName(), result.getMethod().getDescription());
//        test.set(extentTest);
//    }
//
//    @Override
//    public void onTestSuccess(ITestResult result) {
//        System.out.println((result.getMethod().getMethodName() + " passed!"));
//        test.get().pass("Test passed" + result);
//    }
//
//    @Override
//    public void onTestFailure(ITestResult result) {
//        System.out.println((result.getMethod().getMethodName() + " failed!"));
//        test.get().fail(result.getThrowable());
//    }
//
//    @Override
//    public void onTestSkipped(ITestResult result) {
//        System.out.println((result.getMethod().getMethodName() + " skipped!"));
//        test.get().skip(result.getThrowable());
//    }
//
//    @Override
//    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//        System.out.println(("onTestFailedButWithinSuccessPercentage for " + result.getMethod().getMethodName()));
//    }
//
//    @Override
//    public void onStart(ITestContext context) {
//        System.out.println("Extent Reports Version 3 Test Suite started!");
//    }
//
//    @Override
//    public void onFinish(ITestContext context) {
//        System.out.println(("Extent Reports Version 3  Test Suite is ending!"));
//        extent.flush();
//    }
