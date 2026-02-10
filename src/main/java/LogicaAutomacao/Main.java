package LogicaAutomacao;
import java.util.Random;

/*coletor de dados em automacao
objetivo: exemplificar:
    - Coleta
    - Tratamento
    - Validação de dados industriais
 */

public class Main {
    //ponto de partida
    public static void main(String[] args) {
    //Exibição de cabeçalho: simula a inicialização de um sistema de informação
        System.out.println("_________________________________________________");
        System.out.println("|      SISTEMA DE MONITORAMENTO INDUSTRIAL      |");
        System.out.println("_________________________________________________");

    //simulação com laço for
        for (int i = 1; i < 6; i++) {
            System.out.println("Ciclo " + i + " ocorrendo!");

            //ETAPA 1
            double temp = readSensor("Forno 1 temperatura");

            //ETAPA 2 e 3
            valid_data("Temperature", temp, 20, 80);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("System timer error");
            }
        }

        System.out.println("_________________________________________________");
        System.out.println("|               COLETA FINALIZADA               |");
        System.out.println("_________________________________________________");
    }

    //metodo especial
    public static double readSensor (String tag) {
        Random num_gen = new Random();
        double ran_value = 10 + (100 - 10) * num_gen.nextDouble();
        return ran_value;
    }

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