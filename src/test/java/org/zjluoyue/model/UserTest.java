package org.zjluoyue.model;

import junit.framework.*;
import org.junit.*;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by zjluoyue on 2016/8/20.
 */
public class UserTest {

    public UserTest() {

    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {

    }

    private User user = new User();

    @Before
    public void setUp() {

        user.setPassWord("12345");
        user.setUserName("admin");
    }

    @After
    public void tearDown() {
        user = null;
    }

    @Test
    public void testUser() {
        assertEquals("admin", user.getUserName());
        assertEquals("12345", user.getPassWord());
    }
}

