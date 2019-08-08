/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owner
 */
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
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
    
    GroupOfCards main=new GroupOfCards();
    /**
     * Test of playCard method, of class GroupOfCards.
     */
    @Test
    public void testShuffleGood() {
        System.out.println("Test Shuffle: Good");
        int size=25;
        int size1=25;
        boolean expresult= true;
        boolean result = main.checkShuffle(size,size1);
        GroupOfCards instance = new GroupOfCards();
        assertEquals(expresult,result);
    }
    
    @Test
    public void testShuffleBad() {
        System.out.println("Test Shuffle: Good");
        int size=24;
        int size1=26;
        boolean expresult= false;
        boolean result = main.checkShuffle(size,size1);
        GroupOfCards instance = new GroupOfCards();
        assertEquals(expresult,result);
    }
    
    @Test
    public void testShuffleBoundary() {
        System.out.println("Test Shuffle: Good");
        int size=0;
        int size1=0;
        boolean expresult= true;
        boolean result = main.checkShuffle(size,size1);
        GroupOfCards instance = new GroupOfCards();
        assertEquals(expresult,result);
    }
    
}
