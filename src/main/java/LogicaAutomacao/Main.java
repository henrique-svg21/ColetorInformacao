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
        System.out.println("Sistema de monitoramento industrial");
        System.out.println("_________________________________________________");

    //simulação com laço for
        for (int i = 1; i < 6; i++) {
            System.out.println("Ciclo " + i + " ocorrendo!");

            double temp = readSensor("Forno 1 temperatura");
        }
    }

    //metodo especial
    public static double readSensor (String tag) {
        Random num_gen = new Random();
        double ran_value = 10 + (100 - 10) * num_gen.nextDouble();
        return ran_value;
    }
}