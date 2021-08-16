package io.zolaton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BackEndTest 
{
    BackEnd backEnd = new BackEnd();

    @Test
    public void testApp()
    {
        assertEquals("Hello world from BackEnd", backEnd.greet("world"));
    }

    @Test
    public void testTrue()
    {
        assertTrue( true );
    }
}
