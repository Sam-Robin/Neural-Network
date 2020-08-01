package com.company.neuralnetwork;

import com.company.neuralnetwork.connections.Connection;

import java.util.ArrayList;

public class Neuron {

    private double value;
    private ArrayList<Connection> inputConnections;
    private ArrayList<Connection> outputConnections;

    public Neuron()
    {
        value = 0;
        inputConnections = new ArrayList<>();
        outputConnections = new ArrayList<>();
    }

    /**
     * Returns a value between 0 and 1 based on the value of x.
     * A value of x at -inf will give 0, and a value of inf at 1.
     * @param x     x input for sigmoid function
     * @return      y output of sigmoid function
     */
    public double sigmoid(double x)
    {
        double y;
        y = 1 / (1 + Math.exp(-x));
        return y;
    }

    /**
     * Return post-sigmoid value
     * @return  sigmoid output
     */
    public double getValue() {
        return sigmoid(value);
    }
}
