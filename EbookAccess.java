public class EbookAccess {
    public static void main(String[] args) {
        boolean anggota = true; // status keanggotaan mahasiswa
        boolean bayar = false;   // status pembayaran iuran

        if (anggota) {  
            // jika sudah anggota, cek pembayaran
            if (bayar) {
                System.out.println("Akses e-book dibuka");
            } else {
                System.out.println("Harap bayar iuran dulu");
            }
        } else {
            // jika bukan anggota
            System.out.println("Silakan daftar anggota dahulu");
        }
    }
}