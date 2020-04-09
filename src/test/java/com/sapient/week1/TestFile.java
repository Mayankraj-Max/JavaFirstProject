package com.sapient.week1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class TestFile 
    extends TestCase
{
    
    public TestFile( String testName )
    {
        super( testName );
    }

    
    public static Test suite()
    {
        return new TestSuite( TestFile.class );
    }

    
    public void testApp1()
    {
        boolean x = CheckEven.check(5);
        assertTrue( x == false );
    }

     public void testApp2()
    {
        boolean x = CheckEven.check(2);
        assertTrue( x == true );
    }

     public void testApp3()
    {
        boolean x = CheckEven.check(8);
        assertTrue( x == true );
    }

     public void testApp4()
    {
        boolean x = CheckEven.check(20);
        assertTrue( x == true );
    }

}
