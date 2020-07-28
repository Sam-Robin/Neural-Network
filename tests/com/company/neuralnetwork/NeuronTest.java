package com.company.neuralnetwork;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NeuronTest {

    private Neuron neuron = new Neuron();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sigmoidUpperRangeIntegers() {

        for (double x = 1; x < 1000; x++)
        {
            //Supply sigmoid function with value of x
            double y = neuron.sigmoid(x);

            //Test that the y value is > 0.5
            assertTrue( y > 0.5,
                    ("Upper range integers fail\t" +
                            "x: " + x + " y: " + y));
        }
    }
}