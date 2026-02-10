package LogicaAutomacao;

import java.util.Random;

public class Sensor {
    //metodo especial
    public static double readSensor (String tag) {
        Random num_gen = new Random();
        double ran_value = 10 + (100 - 10) * num_gen.nextDouble();
        return ran_value;
    }
}
