package com.bayat.armin.springwebservice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestAssertJ {

    @Test
    public void test() {
        List<Integer> integers = Arrays.asList(12, 14, 15);

        assertThat(integers).hasSize(3);
        assertThat(integers).contains(12, 14);
        assertThat(integers).allMatch(x -> x > 10);
        assertThat(integers).allMatch(x -> x < 30);
        assertThat(integers).noneMatch(x -> x < 0);

        assertThat("").isEmpty();
        assertThat("ABCD").contains("AB");
        assertThat("ABCD").startsWith("AB");


    }

}
