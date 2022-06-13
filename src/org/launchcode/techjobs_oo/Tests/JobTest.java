package org.launchcode.techjobs_oo.Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import java.util.Scanner;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


public class JobTest {

    int newId;
    int oldId;

    @Before
    //create two job objects
    public void beforeTest() {
        Job newJob = new Job();
        Job oldJob = new Job();
        newId = newJob.getId();
        oldId = oldJob.getId();

    }

    @Test
    public void testSettingsJobId() {
        assertNotEquals(oldId, newId);
        assertEquals(oldId, newId + 1);
        assertTrue(oldId != newId);
        assertFalse(oldId == newId);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job newJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertEquals(15, oldId);
        assertEquals(newJob.getName(), "Product tester");
        assertEquals(String.valueOf(newJob.getEmployer()), "ACME");
        assertEquals(String.valueOf(newJob.getLocation()), "Desert");
        assertEquals(String.valueOf(newJob.getPositionType().getValue()), "Quality control");
        assertEquals(String.valueOf(newJob.getCoreCompetency()), "Persistence");

        assertTrue(15 == oldId);
        assertTrue(newJob.getName() == "Product tester");
        assertTrue(String.valueOf(newJob.getEmployer()) == "ACME");
        assertTrue(String.valueOf(newJob.getLocation()) == "Desert");
        assertTrue(String.valueOf(newJob.getPositionType().getValue()) == "Quality control");
        assertTrue(String.valueOf(newJob.getCoreCompetency()) == "Persistence");

    }


    @Test
    public void testJobsForEquality() {
        Job oldJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));


        Job newJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertFalse(newJob.equals(oldJob));


    }
    //toString method testing
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job jobOne = new Job();
        String statmentValidation = jobOne.toString();
        assertEquals("OOPS! This job does not seem to exist", statmentValidation);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLines() {
        Job oldJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        String statmentValidation = oldJob.toString();
        assertEquals("id=24\nname=Product tester\nemployer=ACME\nlocation=Desert\npositionType=Quality control\ncoreCompetency=Persistence", statmentValidation);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job newJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        String statmentValidation = newJob.toString();
        System.out.println(statmentValidation);
        assertEquals("id=10\nname=Product tester\nemployer=ACME\nlocation=Desert\npositionType=Quality control\ncoreCompetency=Persistence", statmentValidation);

    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job newJob = new Job();
        String statmentValidation = newJob.toString();
        System.out.println(statmentValidation);
        assertEquals("OOPS! This job does not seem to exist", statmentValidation);
    }

    @Test
    public void testToStringHandlesDataNotAvailableField() {
        Job newJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType(null),
                new CoreCompetency(null));
        String statmentValidation = newJob.toString();
        System.out.println(statmentValidation);
        assertEquals("id=19\n" +
                "name=Product tester\n" +
                "employer=ACME\n" +
                "location=Desert\n" +
                "positionType=Data not available\n" +
                "coreCompetency=Data not available", statmentValidation);
    }

}