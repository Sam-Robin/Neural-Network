package com.company.neuralnetwork.connections;

import com.company.neuralnetwork.Neuron;

import java.nio.file.Path;

public class ImageToNeuronConnection implements Connection {

    private Path path;
    private Neuron toNeuron;

    public ImageToNeuronConnection(Path path, Neuron toNeuron)
    {
        this.path = path;
        this.toNeuron = toNeuron;
    }

    @Override
    public void readData() {

    }
}
