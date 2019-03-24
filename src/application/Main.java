package application;

import data.NoiseManager;
import gui.Gui;

public class Main {
    public static void main(String[] args) {
        Gui.create();
        NoiseManager.setup();
        System.out.println(NoiseManager.mappedNoise()[0][0]);
    }
}
