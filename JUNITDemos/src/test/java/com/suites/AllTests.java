package com.suites;

import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
//in this package select all the classes 
@SelectPackages({"com.lumen"})
//exclude a a particular package
@ExcludePackages({"com.lumen.testcases"})
public class AllTests {

}
