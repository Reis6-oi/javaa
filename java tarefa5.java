public class Main {
    public static double calcularMediaPonderada(double nota1, double nota2, double nota3, 
    double peso1, double peso2, double peso3) {
double somaPesos = peso1 + peso2 + peso3;
double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / somaPesos;
return media;
}

public static void main(String[] args) {
double nota1 = 10;
double nota2 = 9;
double nota3 = 8;
double peso1 = 3;
double peso2 = 2;
double peso3 = 5;

double media = calcularMediaPonderada(nota1, nota2, nota3, peso1, peso2, peso3);
System.out.printf("A média ponderada é: %.1f%n", media);
}
}