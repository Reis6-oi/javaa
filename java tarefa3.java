public class Main {
    public static void main(String[] args) {
        int soma = 0;
        
        for (int i = 50; i <= 100; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        
        System.out.println("A soma dos números pares de 50 a 100 é: " + soma);
    }
    
}
