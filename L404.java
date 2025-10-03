public class L404 {
    public static void main(String[] args) {
        int paisA = 80000;
        int paisB = 200000;
        double taxaA = 0.03;
        double taxaB = 0.015;
        int anos = 0;

        while (paisA < paisB) {
            paisA += paisA * taxaA;
            paisB += paisB * taxaB;
            anos++;
        }

        System.out.print("O número de anos necessários para A ultrapassar B são " + anos);
}
}
