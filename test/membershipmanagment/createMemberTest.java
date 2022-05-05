/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membershipmanagment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pepo
 */
public class createMemberTest {
    
    public createMemberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setStatus method, of class createMember.
     */

    /**
     * Test of setTitle method, of class createMember.
     */
 
 
    
    
    @Test
    public void testSetBooking() {
        System.out.println("Test for setting a booking");
        int aBooking = 10;
        createMember instance = new createMemberImpl();
        instance.setBooking(aBooking);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(instance.getBooking(),aBooking);
    }
    @Test
    
     public void testSetNegativeBooking() {
        System.out.println("Test with negative number for booking");
        int negative = -2;
        createMember instance = new createMemberImpl();
        instance.setBooking(negative);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(instance.getBooking(),0);
    }
     @Test
      public void testSetBIGBooking() {
        System.out.println("Test with big number for Bookings");
        int aBooking = 999999;
        createMember instance = new createMemberImpl();
        instance.setBooking(aBooking);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(instance.getBooking(),aBooking);
    }

    public class createMemberImpl extends createMember {

        public void setStatus(String type) {
        }

        public String getStatus() {
            return "";
        }
    }
    
}
