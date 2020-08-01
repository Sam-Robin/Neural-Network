package com.company.neuralnetwork.connections;

import com.company.neuralnetwork.Neuron;

public class NeuronToNeuronConnection implements Connection {

    private Neuron fromNeuron;
    private Neuron toNeuron;
    private double weight;

    public NeuronToNeuronConnection(Neuron fromNeuron, Neuron toNeuron,
                                    double weight)
    {
        this.fromNeuron = fromNeuron;
        this.toNeuron = toNeuron;
        this.weight = weight;
    }

    @Override
    public void readData() {

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
