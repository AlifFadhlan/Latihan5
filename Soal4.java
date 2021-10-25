import java.util.Scanner;
public class Soal4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String tempat = in.nextLine();
        int jumlahPenumpang;
        int harga;
        int tiket;
        int diskon;
        switch(tempat){
            case "Jakarta":
            harga = 145000;
            jumlahPenumpang = in.nextInt();
            System.out.println(harga*jumlahPenumpang);
            break;
            case "Bogor":
            harga = 200000;
            jumlahPenumpang = in.nextInt();
            tiket = harga*jumlahPenumpang;
            if(tiket>250000){
                diskon = tiket/10;
                System.out.println(tiket-diskon);
            }else{
                System.out.println(tiket);
            }
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
