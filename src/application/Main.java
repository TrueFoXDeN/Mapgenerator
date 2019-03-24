package application;

import data.NoiseManager;
import data.Perlin;
import gui.Gui;

public class Main {
    public static void main(String[] args) {
        Gui.create();
        NoiseManager.setup();
        System.out.println(Perlin.noise(3.14,42,7));
    }
}
