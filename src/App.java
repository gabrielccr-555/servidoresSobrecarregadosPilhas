import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        // Pilha da carga dos servidores
        Stack<Integer> carga = new Stack<>();
        // Adicionando cargas aos servidores

        carga.push(30);
        carga.push(25);
        carga.push(40);
        carga.push(20);
        carga.push(35);
        carga.push(50);
        carga.push(45);

        // Imprimindo a pilha inicial
        System.out.println("Dia 0 (inicial):");
        imprimirPilha(carga);

        // Resultado
        int diasAteDesligamento = desligamento(carga);
        System.out.println("São " + diasAteDesligamento + " dias até que nenhum servidor seja desligado.");
    }

    // Método para avaliar sobrecarga dos servidores
    private static int desligamento(Stack<Integer> pilha) {
        // Contagem de dias
        int dia = 0;
        boolean sobrecarga = true;

        while (sobrecarga) {
            sobrecarga = false;
            Stack<Integer> pilhaAux = new Stack<>();
            Stack<Integer> pilhaTemp = new Stack<>();

            // Inverto aqui a pilha para processar da esquerda para a direita
            while (!pilha.isEmpty()) {
                pilhaAux.push(pilha.pop());
            }

            if (!pilhaAux.isEmpty()) {
                int cargaAnterior = pilhaAux.pop();
                pilhaTemp.push(cargaAnterior);

                while (!pilhaAux.isEmpty()) {
                    int cargaAtual = pilhaAux.pop();
                    if (cargaAtual > cargaAnterior) {
                        sobrecarga = true;
                    } else {
                        pilhaTemp.push(cargaAtual);
                    }
                    cargaAnterior = cargaAtual;
                }
            }

            // Reconstruo a pilha original na ordem certa
            Stack<Integer> pilhaInversa = new Stack<>();
            while(!pilhaTemp.isEmpty()){
                pilhaInversa.push(pilhaTemp.pop());
            }
            while (!pilhaInversa.isEmpty()) {
                pilha.push(pilhaInversa.pop());
            }

            if (sobrecarga) {
                dia++;
                System.out.println("Dia: " + dia + ":");
                imprimirPilha(pilha);
            }
        }
        return dia;
    }

    private static void imprimirPilha(Stack<Integer> pilha) {
        // Imprime a pilha
        System.out.println("Pilha: " + pilha);
    }
}