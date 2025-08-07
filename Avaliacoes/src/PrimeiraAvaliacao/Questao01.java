package PrimeiraAvaliacao;

public class Questao01 {
    public static void main(String[] args) {
        double n1 = 8.5;
        double n2 = 2.0;
        double n3 = 9.0;
        double n4 = 8.0;
        double n5 = 7.5;
        double n6 = 6.0;
        double n7 = 10.0;
        double n8 = 5.4;

        double mediabimestre1 = (n1+n2) / 2;
        double mediabimestre2 = (n3+n4) / 2;
        double mediabimestre3 = (n5+n6) / 2;
        double mediabimestre4 = (n7+n8) / 2;

        double semestre1 = (mediabimestre1) + (mediabimestre2) / 2;
        double semestre2 = (mediabimestre3) + (mediabimestre4) / 2;

        System.out.println("=== resultado escolar===");
        System.out.printf("1 bimestre: %.2f \n", mediabimestre1);
        System.out.printf("2 bimestre: %.2f \n", mediabimestre2);
        System.out.printf("1 bimestre: %.2f \n", mediabimestre1);
        System.out.println("----------------------------");
        System.out.printf("3 bimestre: %.2f \n", mediabimestre3);
        System.out.printf("4 bimestre: %.2f \n", mediabimestre4);
        System.out.printf("2 bimestre: %.2f \n", mediabimestre2);
        System.out.println("============================");

    }
}
