package com.company.neuralnetwork.connections;

import com.company.neuralnetwork.Neuron;

public class NeuronToNeuronConnection implements Connection {

    private Neuron fromNeuron;
    private Neuron toNeuron;

    public NeuronToNeuronConnection(Neuron fromNeuron, Neuron toNeuron)
    {
        this.fromNeuron = fromNeuron;
        this.toNeuron = toNeuron;
    }

    @Override
    public void readData() {

    }
}
