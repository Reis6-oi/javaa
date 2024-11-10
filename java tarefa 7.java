public class Main {
    public static int somaIntervalo(int inicio, int fim) {
        int soma = 0;

    
        int menor = Math.min(inicio, fim);
        int maior = Math.max(inicio, fim);

       
        for (int i = menor; i <= maior; i++) {
            soma += i;
        }

        return soma;
    }

    public static void main(String[] args) {
        int inicio = 5;
        int fim = 10;
        int resultado = somaIntervalo(inicio, fim);
        System.out.println("A soma do intervalo entre " + inicio + " e " + fim + " é: " + resultado);
    }
    
}
