package SplitandAdd.SplitandAdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ImplementationTest {

    
    Implementation impl = new Implementation();

    @Test
    public void testSplitAddAndReturnCharacter_Basic() {
        // Test with basic input 
        assertEquals('f', impl.splitAddAndReturnCharacter("abc"));
    }
    
    @Test
    public void testSplitAddAndReturnCharacter_SingleCharacter() {
        // Test with single character input "z" 
        assertEquals('*', impl.splitAddAndReturnCharacter("z"));
    }
    
    @Test
    public void testSplitAddAndReturnCharacter_MinValue() {
        // Test with input "a" 
        assertEquals('a', impl.splitAddAndReturnCharacter("a"));
    }

    @Test
    public void testSplitAddAndReturnCharacter_MultipleOf26() {
        // Test with input "aaz" 
        assertEquals('b', impl.splitAddAndReturnCharacter("aaz"));
    }

    @Test
    public void testSplitAddAndReturnCharacter_EmptyString() {
        // Test with empty string input 
        assertEquals('*', impl.splitAddAndReturnCharacter(""));
    }

   
}