package LogicaAutomacao;

public class Valid {
    public static void valid_data (String sensorName, double value, double minV, double maxV) {
        //show value with 2 decimal places
        System.out.printf("Sensor: %s | Current value: %.2f °C", sensorName, value);
        if (value >= minV && value <= maxV) {
            System.out.println(" >> Operating normally! <<");
        }
        else {
            System.out.println(" >> AWARE, OUT OF SAFE LEVELS! <<");
        }
    }
}
