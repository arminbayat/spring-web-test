package com.bayat.armin.springwebservice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestHamcrest {

    @Test
    public void test() {
        List<Integer> integers = Arrays.asList(12, 14, 15);

        assertThat(integers, hasSize(3));
        assertThat(integers, hasItems(12, 14));
        assertThat(integers, everyItem(greaterThan(3)));
        assertThat(integers, everyItem(lessThan(30)));

        assertThat("", emptyString());
        assertThat("ABCD", containsString("BC"));
        assertThat("ABCD", startsWith("AB"));
        assertThat("ABCD", endsWith("CD"));

    }

}
