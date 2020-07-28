package com.company.neuralnetwork;

import java.util.ArrayList;

public class Neuron {

    private double value;
    private String id;
    private ArrayList<Connection> inputConnections;
    private ArrayList<Connection> outputConnections;

    public Neuron()
    {
        value = 0;
        id = null;
        inputConnections = new ArrayList<>();
        outputConnections = new ArrayList<>();
    }

    /**
     * Returns a value between 0 and 1 based on the value of x.
     * A value of x at -inf will give 0, and a value of inf at 1.
     * @param x     x input for sigmoid function
     * @return y    y output of sigmoid function
     */
    public double sigmoid(double x)
    {
        double y;
        y = 1 / (1 + Math.exp(-x));
        return y;
    }
}
