package com.company.neuralnetwork;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class NeuralNetLayerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void neuronStore()
    {
        ArrayList<Neuron> neurons = new ArrayList<>();

        //create 10 neurons
        for(int i = 0; i < 10; i++)
        {
            neurons.add(new Neuron());
        }

        //create a NeuralNetLayer with those neurons
        NeuralNetLayer layer = new NeuralNetLayer(neurons);
        assertEquals(layer.getNeurons(), neurons);
    }

    @Test
    void neuronOutputSum()
    {

    }
}
