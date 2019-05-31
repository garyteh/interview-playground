package com.siteminder.interview.playground;

import org.junit.BeforeClass;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;

public abstract class BaseTest {

    static final int[] NUM_1 = {2, 7, 11, 15};
    static int[] NUM_2;

    @BeforeClass
    public static void setUpBeforeClass() {
        try {
            Properties properties = new Properties();
            InputStream stream = BaseTest.class.getResourceAsStream("/huge.properties");
            properties.load(stream);
            NUM_2 = Arrays.stream(properties.getProperty("numbers").split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
