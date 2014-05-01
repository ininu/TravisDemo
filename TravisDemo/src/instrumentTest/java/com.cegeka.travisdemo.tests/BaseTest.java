package com.cegeka.travisdemo.tests;

import android.test.AndroidTestCase;

public class BaseTest extends AndroidTestCase{

    public void testPassingCondition(){
        assertEquals(true, true);
    }

    public void testFailingCondition(){
        assertEquals(false, false);
    }

}