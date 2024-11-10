public class Main {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1;

        System.out.println("Os 10 primeiros números da série de Fibonacci são:");
        System.out.print(num1 + ", " + num2); 
        for (int i = 3; i <= 10; i++) {
            int next = num1 + num2;
            System.out.print(", " + next);
            num1 = num2;
            num2 = next;
        }
    }
    
}
