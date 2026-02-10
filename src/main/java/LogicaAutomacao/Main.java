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
            double temp = Sensor.readSensor("Forno 1 temperatura");

            //ETAPA 2 e 3
            Valid.valid_data("Temperature", temp, 20, 80);

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
}