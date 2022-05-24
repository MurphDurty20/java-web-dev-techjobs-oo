package org.launchcode.techjobs_oo.Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


public class JobTest {

        int newId;
        int oldId;

        @Before
        //create two job objects
        public void beforeTest(){
            Job newJob = new Job();
            Job oldJob = new Job();
            newId = newJob.getId();
            oldId = oldJob.getId();

        }

        @Test
        public void testSettingsJobId(){
            assertNotEquals(oldId,newId);
            assertEquals(oldId,newId+1);
            assertTrue(oldId != newId);
            assertFalse(oldId == newId);
        }
        @Test
        public void testJobConstructorSetsAllFields(){
            Job newJob = new Job("Product tester",
                    new Employer("ACME"),
                    new Location("Desert"),
                    new PositionType("Quality control"),
                    new CoreCompetency("Persistence"));

            assertEquals(2,oldId);
            assertEquals(newJob.getName(), "Product tester");
            assertEquals(String.valueOf(newJob.getEmployer()),"ACME");
            assertEquals(String.valueOf(newJob.getLocation()),"Desert");
            assertEquals(String.valueOf(newJob.getPositionType().getValue()),"Quality control");
            assertEquals(String.valueOf(newJob.getCoreCompetency()),"Persistence");

            assertTrue(2 == oldId);
            assertTrue(newJob.getName() == "Product tester");
            assertTrue(String.valueOf(newJob.getEmployer()) =="ACME");
            assertTrue(String.valueOf(newJob.getLocation()) =="Desert");
            assertTrue(String.valueOf(newJob.getPositionType().getValue()) =="Quality control");
            assertTrue(String.valueOf(newJob.getCoreCompetency()) =="Persistence");

            //assertTrue(newJob instanceOf Job);

        }

        @Test
        public void testJobsForEquality(){
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

        @Test
        public void testToStringStartsAndEndsWithNewLine(){
            Job jobOne = new Job();
            jobOne.toString();

        }
    }