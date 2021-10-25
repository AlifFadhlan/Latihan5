import java.util.Scanner;

class Soal1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // input nilai huruf A, B, C, atau D
        String nilai = in.nextLine();
        String predikat;
        switch (nilai) {
            case "A":
                predikat = "Excellent";
                break;
            case "B":
                predikat = "Good";
                break;
            case "C":
                predikat = "Average";
                break;
            case "D":
                predikat = "Fail";
                break;
            default:
                predikat = "";
        }
        // output predikat
        System.out.println(predikat);
    }
}