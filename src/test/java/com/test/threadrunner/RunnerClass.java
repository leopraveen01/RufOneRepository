package com.test.threadrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Eclipse-New\\BlazeDemo\\src\\test\\resources\\Feature.feature",glue="com.test.stepdefintion",monochrome=true,dryRun=false,plugin="html:C:\\Eclipse-New\\BlazeDemo\\target")

public class RunnerClass {

}
