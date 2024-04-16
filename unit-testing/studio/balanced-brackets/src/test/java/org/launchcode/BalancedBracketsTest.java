package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.launchcode.BalancedBrackets.hasBalancedBrackets;

class BalancedBracketsTest {
    //TODO: add tests here

// Test 1
//    @Test
//    public void emptyTest() {
//        assertEquals(true, true);
//    }
// Test 2
    @Test
    public void  balancedBracketsAtEndsOfStringReturnsTrue(){assertTrue(hasBalancedBrackets("[LaunchCode]"));}
// Test 3
@Test
public void  balancedPairOfBracketsReturnsTrue(){assertTrue(hasBalancedBrackets("[]"));}
// Test 4
    @Test
public void  backwardsPairOfBracketsReturnsFalse(){assertFalse(hasBalancedBrackets("]["));}
// Test 5
    @Test
public void  justOneLeftBracketReturnsFalse(){assertFalse(hasBalancedBrackets("["));}
// Test 6
@Test
public void  justOneRightBracketReturnsFalse(){assertFalse(hasBalancedBrackets("]"));}
// Test 7
@Test
public void  bracketsWithinAStringReturnsTrue(){assertTrue(hasBalancedBrackets("Cat[dog]"));}
// Test 8

// Test 9

// Test 10

// Test 11

// Test 12


}

