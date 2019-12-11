package lv.javaguru.lesson11.userservice;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceTest {

    private UserService victim;
    private MockUserRepository mockDB;


    @Before
    public void setUp() throws Exception {
        victim = new UserService();
        victim.userDB = new MockUserRepository();
        mockDB = (MockUserRepository) victim.userDB;
    }

    @Test
    public void shouldReturnTrue() {
        victim.addUser(new User("Shone", 55));
        assertTrue(mockDB.isMockTriggered);
    }

    @Test
    public void shouldReturnTrue_NameAtLowerBorder() {
        victim.addUser(new User("Ann", 35));
        assertTrue(mockDB.isMockTriggered);
    }

    @Test
    public void shouldReturnTrue_NameAtUpperBorder() {
        victim.addUser(new User("123456789012345", 100));
        assertTrue(mockDB.isMockTriggered);
    }

    @Test
    public void shouldReturnTrue_AgeAtMinimum() {
        victim.addUser(new User("Mike", 1));
        assertTrue(mockDB.isMockTriggered);
    }

    @Test
    public void shouldReturnTrue_AgeAtMaximum() {
        victim.addUser(new User("Gregory", 120));
        assertTrue(mockDB.isMockTriggered);
    }

    @Test
    public void shouldReturnFalse_NameTooShort() {
        victim.addUser(new User("U", 15));
        assertFalse(mockDB.isMockTriggered);
    }

    @Test
    public void shouldReturnFalse_NameTooLong() {
        victim.addUser(new User("ReallyVeryLongName", 15));
        assertFalse(mockDB.isMockTriggered);
    }

    @Test
    public void shouldReturnFalse_AgeNegative() {
        victim.addUser(new User("Ann", -8));
        assertFalse(mockDB.isMockTriggered);
    }

    @Test
    public void shouldReturnFalse_AgeZero() {
        victim.addUser(new User("Uldis", 0));
        assertFalse(mockDB.isMockTriggered);
    }

    @Test
    public void shouldReturnFalse_AgeTooBig() {
        victim.addUser(new User("U", 121));
        assertFalse(mockDB.isMockTriggered);
    }

}