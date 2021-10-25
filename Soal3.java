import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String tempat = in.nextLine();
        int jumlahPenumpang;
        int harga;
        switch(tempat){
            case "Jakarta":
            harga = 145000;
            jumlahPenumpang = in.nextInt();
            System.out.println(harga*jumlahPenumpang);
            break;
            case "Bogor":
            harga = 200000;
            jumlahPenumpang = in.nextInt();
            System.out.println(harga*jumlahPenumpang);
            break;
            case "Garut":
            harga = 75000;
            jumlahPenumpang = in.nextInt();
            System.out.println(harga*jumlahPenumpang);
            break;
            case "Purwakarta":
            harga = 75000;
            jumlahPenumpang = in.nextInt();
            System.out.println(harga*jumlahPenumpang);
            break;
        }
    }
}
