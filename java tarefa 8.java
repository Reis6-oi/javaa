public class Main {
    public static void main(String[] args) {
        int x = 10; 
        int y;

        System.out.println("Sequência de Collatz iniciando com x = " + x);

        while (x != 1) {
            if (x % 2 == 0) {  
                y = x / 2;
            } else {           
                y = 3 * x + 1;
            }

            System.out.println(y); 
            x = y; 
        }
    }
}
