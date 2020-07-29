package com.company.neuralnetwork;

import java.util.ArrayList;
import java.util.List;

public class NeuralNetLayer {

    private List<Neuron> neurons;

    /**
     * Construct a NeuralNetLayer with a defined list of neurons.
     * @param neurons   list of neurons
     */
    public NeuralNetLayer(List<Neuron> neurons)
    {
        this.neurons = neurons;
    }

    /**
     * Construct a NeuralNetLayer with a defined number of neurons.
     * @param neuronCount   number of neurons to add to the layer
     */
    public NeuralNetLayer(int neuronCount)
    {
        neurons = new ArrayList<>();
        for(int i = 0; i < neuronCount; i++)
        {
            neurons.add(new Neuron());
        }
    }

    public double[] getNeuronOutputs()
    {
        return null;
    }
}
