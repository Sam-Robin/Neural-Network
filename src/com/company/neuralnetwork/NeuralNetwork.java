package com.company.neuralnetwork;

import java.util.List;

public class NeuralNetwork {

    private NeuralNetLayer inputLayer;
    private List<NeuralNetLayer> hiddenLayer;
    private NeuralNetLayer outputLayer;

    public NeuralNetwork(NeuralNetLayer inputLayer,
                         List<NeuralNetLayer> hiddenLayer,
                         NeuralNetLayer outputLayer)
    {
        this.inputLayer = inputLayer;
        this.hiddenLayer = hiddenLayer;
        this.outputLayer = outputLayer;
    }

}
