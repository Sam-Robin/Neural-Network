package com.company.neuralnetwork;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

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
            //Add neuron to ArrayList
            neurons.add(new Neuron());
        }

        //create a NeuralNetLayer with those neurons
        NeuralNetLayer layer = new NeuralNetLayer(neurons);
        assertEquals(layer.getNeurons(), neurons);
    }

    @Test
    void neuronOutputList()
    {
        //list of neurons
        ArrayList<Neuron> neurons = new ArrayList<>();
        //random number generator, treated as raw value
        int raw;
        //sigmoid version of the random number
        double randSigmoid;
        //ArrayList of input values, in order of neurons
        ArrayList<Double> inputValues = new ArrayList<>();

        //create 300 neurons
        for(int i = 0; i < 300; i++)
        {
            //max = 100, min = -100
            raw = new Random().nextInt(100 + 100) - 100;
            //retrieve the sigmoid version of the random number
            randSigmoid = sigmoid(raw);
            //add input value to array
            inputValues.add(randSigmoid);
            //add neuron to ArrayList with raw value
            neurons.add(new Neuron(raw));
        }

        //create a NeuralNetLayer with the neurons in the ArrayList
        NeuralNetLayer layer = new NeuralNetLayer(neurons);
        //retrieve sigmoid values from the neurons in the layer
        ArrayList<Double> testValues = layer.getNeuronOutputs();

        //check that the values in sigmoidValues are identical to those in the layer
        for(int i = 0; i < 300; i++)
        {
            assertEquals(inputValues.get(i), testValues.get(i),
                    "Neuron values are stored incorrectly!\n" +
                    "input: " + inputValues.get(i)
                            + " output: " + testValues.get(i));
        }
    }

    /**
     * Sigmoid function
     * @param x     input value
     * @return      y value
     */
    private double sigmoid(double x)
    {
        double y;
        y = 1 / (1 + Math.exp(-x));
        return y;
    }
}
