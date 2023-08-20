package com.lumen.testcases.trial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

 

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

 

import com.lumen.exceptions.NegValueException;
import com.lumen.training.Student;

 

class StudentTest {

    Student student;

 

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    	System.out.println("Before All");

    }

 

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    	System.out.println("After Each");

    }

 

    @BeforeEach
    void setUp() throws Exception {
        System.out.println("Before Each");
        student=new Student();
    }

 

    @AfterEach
    void tearDown() throws Exception {
        System.out.println("After Each");
        student=null;
    }

 

    @Test @DisplayName("Testing totalMarks-positive")
    void testTotalMarks() {
        assertEquals(60,student.totalMarks(20, 30, 10),()->"Should be 60");
    }

    @Test @DisplayName("Testing negative value")
    void testNegTotal() {
        assertThrows(NegValueException.class,()->student.totalMarks(-90, -90, 80));
    }

    @Test @DisplayName("Testing marks greater than 100")
    void testGreaterTotal() {
      assertThrows(NegValueException.class, ()->student.totalMarks(167, 78, 98));
  }



    }

 