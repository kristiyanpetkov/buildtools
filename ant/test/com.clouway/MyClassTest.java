package com.clouway;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by clouway on 16-3-24.
 */
public class MyClassTest {

    @Test
    public void dummyTest(){
        assertThat(1,is(equalTo(1)));
    }
}
