public class VetorExemplo {
    private int[] vetor;

    public VetorExemplo() {
        vetor = new int[]{1, 9, 2, 5, 3, 7, 4, 10, 8, 6};
    }

    public boolean pesquisar(int numero) {
        for (int i : vetor) {
            if (i == numero) {
                return true;
            }
        }
        return false;
    }

    public int maiorNumero() {
        int maior = vetor[0];
        for (int i : vetor) {
            if (i > maior) {
                maior = i;
            }
        }
        return maior;
    }

    public int menorNumero() {
        int menor = vetor[0];
        for (int i : vetor) {
            if (i < menor) {
                menor = i;
            }
        }
        return menor;
    }

    public double calcularMedia() {
        int soma = 0;
        for (int i : vetor) {
            soma += i;
        }
        return (double) soma / vetor.length;
    }
}
