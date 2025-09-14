public class Lift {
    public static void main(String[] args) {
        int jumlahOrang = 6; //bisa diganti sesuai intruksi soal

        // menggunakan ternary operator
        String hasil = (jumlahOrang <= 8) ? "Lift bisa jalan" : "Terlalu penuh, tunggu lift berikutnya";

        System.out.println(hasil);
    }
}