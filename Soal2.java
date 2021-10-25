import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // input
        int angka = in.nextInt();
        String angkaHuruf;
        switch(angka){
            case 1: angkaHuruf="satu";
            break;
            case 2: angkaHuruf="dua";
            break;
            case 3: angkaHuruf="tiga";
            break;
            case 4: angkaHuruf="empat";
            break;
            case 5: angkaHuruf="lima";
            break;
            case 6: angkaHuruf="enam";
            break;
            case 7: angkaHuruf="tujuh";
            break;
            case 8: angkaHuruf="delapan";
            break;
            case 9: angkaHuruf="sembilan";
            break;
            case 10: angkaHuruf="sepuluh";
            break;
            default: angkaHuruf="ini berapa ya?";
            break;
            
        }
        // output
        System.out.println(angkaHuruf);
    }
}
