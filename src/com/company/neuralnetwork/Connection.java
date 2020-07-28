package com.company.neuralnetwork;

public class Connection {

    private String id;
    private Neuron fromNeuron;
    private Neuron toNeuron;
    private double weight;

    /**
     * Create a Connection object with a from and to Neuron, and a random
     * weight.
     *
     * @param fromNeuron
     *      neuron to connect from
     * @param toNeuron
     *      neuron to connect to
     */
    public Connection(Neuron fromNeuron, Neuron toNeuron)
    {
        this.fromNeuron = fromNeuron;
        this.toNeuron = toNeuron;
        this.weight = Math.random();
    }

    /**
     * Create a Connection object with a from and to Neuron, and a
     * pre-defined weight.
     *
     * @param fromNeuron
     * @param toNeuron
     * @param weight
     */
    public Connection(Neuron fromNeuron, Neuron toNeuron, double weight)
    {
        this.fromNeuron = fromNeuron;
        this.toNeuron = toNeuron;
        this.weight = weight;
    }
}
