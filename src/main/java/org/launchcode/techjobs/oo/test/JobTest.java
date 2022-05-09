package org.launchcode.techjobs.oo.test;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job jobTest;
    Job jobTest2;
    Job jobTest3;
    Job jobTest4;
    Job jobTest5;
    Job jobTest6;
    Job jobTest7;
    Job jobTest8;


    public void createJobObject() {
    }



    @Test
    public void testSettingJobId() {
        jobTest = new Job();
        jobTest2 = new Job();
        int test1 = jobTest.getId;
        int test2 = jobTest2.getId -1;
        assertEquals(test1, test2, 1);
    }

    @Test
    public void testJobConstructorSetAllFields() {
        jobTest3 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(jobTest3.getName() instanceof String);
        assertTrue(jobTest3.getEmployer() instanceof Employer);
        assertTrue(jobTest3.getLocation() instanceof Location);
        assertTrue(jobTest3.getPositionType() instanceof PositionType);
        assertTrue(jobTest3.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product Tester", jobTest3.getName());
        assertEquals("ACME", jobTest3.getEmployer().getValue());
        assertEquals("Desert", jobTest3.getLocation().getValue());
        assertEquals("Quality control", jobTest3.getPositionType().getValue());
        assertEquals("Persistence", jobTest3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        jobTest4 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobTest5 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(jobTest4.equals(jobTest5));

    }

    @Test
    public void testToStringStartsAndEndsWithNewLineCallsToString() {
        jobTest6 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals('\n', jobTest6.toString().charAt(0));
        assertEquals('\n', jobTest6.toString().charAt(jobTest6.toString().length() -1));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        jobTest7 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: " + jobTest7.getId() + "\nName: Product Tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n", jobTest7.toString());
    }

    @Test
    public void testTestToStringHandlesEmptyFieldExists() {
        jobTest8 = new Job("Product Tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));
        assertEquals("\nID: " + jobTest8.getId() + "\nName: Product Tester\nEmployer: Data not available\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Data not available\n", jobTest8.toString());

    }
}