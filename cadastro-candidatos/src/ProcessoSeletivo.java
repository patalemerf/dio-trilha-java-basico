import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice= 0; indice< candidatos.length; indice++ ) {
            System.out.println("O candidato de número: " + (indice+1) + "é " + candidatos[indice]);
        }
        
        System.out.println("Forma abreviada da instrução for each");

        for(String cancidato : candidatos){
            System.out.println("O candidato selecionado foi " + cancidato);
        }

    }
    static void selecaoCandidatos () {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
        
        int candidatosSelecionados = 0;
        int cancidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && cancidatoAtual < candidatos.length) {
            String candidato = candidatos[cancidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "solicitou esse valor de salário " + salarioPretendido);

            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + "foi sleecionado para vaga");
                candidatosSelecionados ++;
            }
            cancidatoAtual ++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1000, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato");

        }else if (salarioBase == salarioPretendido){
           System.out.println("Ligar para candidato com contra proposta");
        }else {
            System.out.println("Aguardando demais candidatos");
        }

    }
}
