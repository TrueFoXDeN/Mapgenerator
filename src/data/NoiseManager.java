package data;

public class NoiseManager {
    public static float noise[][] = new float[600][600];

    public static void setup(){
        noise[0][0] = 0.5f;
    }

    public static float[][] mappedNoise() {
        float[][] mapNoise = new float[600][600];

        for (int i = 0; i < mapNoise.length; i++) {
            for (int j = 0; j < mapNoise[i].length; j++) {
                mapNoise[i][j] = noise[i][j] * 255;
            }
        }
        return mapNoise;
    }
}
