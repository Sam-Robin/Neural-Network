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
    void sigmoidUpperRangeIntegers()
    {
        for (double x = 1; x < 1000; x++)
        {
            //Supply sigmoid function with value of x
            double y = neuron.sigmoid(x);
            //System.out.println("x: " + x + " y: " + y);

            //Test that the y value is > 0.5
            assertTrue( y > 0.5,
                    ("Upper range integers fail\t" +
                            "x: " + x + " y: " + y));
        }
    }

    @Test
    void sigmoidUpperRangeRationals()
    {
        for (double x = 0.0000001; x < 10; x = x * Math.sqrt(2))    //Chose sqrt(2) because I like it
        {
            //Supply sigmoid with value of x
            double y = neuron.sigmoid(x);
            //System.out.println("x: " + x + " y: " + y);

            //Test that the y value is > 0.5
            assertTrue(y > 0.5,
                    "Upper range rationals fail\t" +
                            "x: " + x + " y: " + y);

        }
    }

    @Test
    void sigmoidLowerRangeIntegers()
    {
        for (double x = -1; x > -1000; x--)
        {
            //Supply sigmoid function with value of x
            double y = neuron.sigmoid(x);
            //System.out.println("x: " + x + " y: " + y);

            //Test that the y value is < 0.5
            assertTrue( y < 0.5,
                    ("Lower range integers fail\t" +
                            "x: " + x + " y: " + y));
        }
    }

    @Test
    void sigmoidLowerRangeRationals()
    {
        for (double x = -0.0000001; x > -10; x = x * Math.sqrt(2))    //Chose sqrt(2) because I like it
        {
            //Supply sigmoid with value of x
            double y = neuron.sigmoid(x);
            System.out.println("x: " + x + " y: " + y);

            //Test that the y value is > 0.5
            assertTrue(y < 0.5,
                    "Lower range rationals fail\t" +
                            "x: " + x + " y: " + y);

        }
    }
}