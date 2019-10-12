package Scanner;

import java.util.Scanner;
public class kasir {
    public static void main(String[] args) {
        Scanner kasir = new Scanner(System.in);

        System.out.println("===========LAPAK UNGU============");
        System.out.print("Kasir \t = ");
        String ksr = kasir.nextLine();
        System.out.println("1. Lontong \t = Rp. 7000");
        System.out.println("2. Pecel \t = Rp. 5000");
        System.out.println("3. Sate \t = Rp. 10000");
        System.out.println("=================================");

        int harga = 0;
        int lontong = 7000;
        int pecel = 5000;
        int sate = 10000;

        String menu;

        System.out.print("Nomor Menu Makanan\t\t : ");
        int inNomor = kasir.nextInt();
        System.out.print("Jumlah Makanan Dibeli\t : ");
        int jumlah = kasir.nextInt();

        System.out.println("=================================");
        if(inNomor == 1 ){
            menu = "Lontong";
            System.out.println("Pesanan Anda Nomor\t : " + inNomor +  menu);
            harga = harga + (lontong * jumlah);
        }

        if (inNomor == 2){
            menu = "Pecel";
            System.out.println("Pesanan Anda Nomor\t : " + inNomor +  menu);
            harga = harga + (pecel * jumlah);
        }

        if (inNomor == 3) {
            menu = "Sate";
            System.out.println("Pesanan Anda Nomor\t : " + inNomor +  menu);
            harga = harga + (sate * jumlah);
        }


        System.out.println("=================================");
        System.out.println("Total \t\t: Rp. " + harga);
        System.out.print("Pembayaran \t: Rp. ");
        int bayar = kasir.nextInt();
        int kembalian = bayar - harga;
        System.out.println("\t\t\t------------ -");
        System.out.println("Kembalian\t: Rp. " +  kembalian);

        System.out.println("==================================");
        System.out.println("           TERIMAKASIH");
        System.out.println("Jangan Lupa Baca Do'a Sebelum Makan");

    }
}
