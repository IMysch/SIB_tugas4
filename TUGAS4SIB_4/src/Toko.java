
        import java.util.Scanner;

        import java.util.ArrayList;

public class Toko {

    private String namaToko;
    Toko(String namaToko){
        this.namaToko = namaToko;

    }

    public String getNamaToko() {

        return namaToko;

    }

    public void setNamaToko(String namaToko) {

        this.namaToko = namaToko;

    }

    void getData(){

        System.out.println("Selamat datang di"+getNamaToko());

    }

}

    class Bahanbangunan extends Toko{

    int i = 1;
    int k,totalHarga= 0;
    int pilih,perBarang,menuPilih;
    int hargaPerbarang[] ={0,1500,150000,15000};

    String menu[]={"","Pavingblock","gorong-gorong","Tehel difabel"};
    String pilihMenu[]= new String[100];

    int harga[]=new int[100];
    boolean ulang =true;

    ArrayList daftarMenu = new ArrayList();



    Bahanbangunan(String namaToko){

        super(namaToko);

    }

    void getData() {

        Scanner input = new Scanner(System.in);
        super.getData();

        System.out.println("________________Daftar Menu Barang_________________");

        daftarMenu.add("Pavingblock Rp 1500");
        daftarMenu.add("gorong-gorong Rp 150000");
        daftarMenu.add("Tehel difabel Rp 15000");
        daftarMenu.add("Check Out");

        daftarMenu.forEach((menuPilih)-> System.out.println(i++ +"."+menuPilih));



        while (ulang) {

            System.out.print("Pilih menu :");

            pilih = input.nextInt();

            if (pilih == 1) {

                System.out.print("Berapa banyak barang yang dipesan   ? :");

                perBarang = input.nextInt();

                pilihMenu[k] = menu[pilih];

                harga[k] = perBarang * hargaPerbarang[pilih];

                totalHarga =totalHarga+harga[k];

                k++;

            }else if (pilih == 2) {

                System.out.print("Berapa banyak barang yang dipesan  ? :");

                perBarang = input.nextInt();

                pilihMenu[k] = menu[pilih];

                harga[k] = perBarang * hargaPerbarang[pilih];

                totalHarga = totalHarga + harga[k];

                k++;

            }else if (pilih == 3) {

                System.out.print("Berapa banyak barang yang dipesan ? :");

                perBarang = input.nextInt();

                pilihMenu[k] = menu[pilih];

                harga[k] = perBarang * hargaPerbarang[pilih];

                totalHarga = totalHarga + harga[k];

                k++;

            }else{

                System.out.println("Check Out");

                ulang =false;

            }

        }

        System.out.println();

        checkOut();

    }

    void checkOut(){

        for (int i = 0; i < k; i++) {

            System.out.println(i+1 +"."+pilihMenu[i]+"Rp"+harga[i]);

        }

        System.out.println("================================");

        System.out.println("Total harga Rp"+totalHarga);

    }

}
