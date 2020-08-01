package com.company;

import com.company.neuralnetwork.filereaders.MnistDecompressedReader;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print("Entry point");

        //use MnistDecompressedReader as singleton
        MnistDecompressedReader mnistReader = new MnistDecompressedReader();
        //create array of images
        ArrayList<BufferedImage> images = new ArrayList<>();
        //supply reader with path to image data
        mnistReader.readDecompressedTraining(Paths.get("" +
                "C:\\Users\\Sam\\IdeaProjects\\Neural Network Test\\src\\com\\company\\assets"),
                mnistEntry ->
        {
            System.out.println("Read entry " + mnistEntry);
            BufferedImage image = mnistEntry.createImage();

            //add images to array
            images.add(image);
        });

        int num = 0;
        //create images as png files
        for(BufferedImage i : images)
        {
            ImageIO.write(i, "png",
                    new File("C:\\Users\\Sam\\IdeaProjects\\" +
                            "Neural Network Test\\src\\com\\company\\assets\\numbers\\" +
                            num + ".png"));
            num++;
        }

        //TODO: Build neural network
    }
}
