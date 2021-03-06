package org.ianShowTechniek.Util;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ToolBox {

    public static double random(int max) {
        return random(0, max);
    }

    public static double random(double min, double max) {
        return ThreadLocalRandom.current().nextDouble(min, max);
    }

    public static double map(double value, double istart, double istop, double ostart, double ostop) {
        return ostart + (ostop - ostart) * ((value - istart) / (istop - istart));
    }

}
