public class LampuPintar {
    public static void main(String[] args) {
        // Variabel untuk mendeteksi apakah ada orang atau tidak
        boolean adaOrang;

        // Kasus b: adaOrang = true 
        adaOrang = true;
        if (adaOrang) {
            System.out.println("Jika sensor mendeteksi orang masuk, maka lampu menyala");
        } else {
            System.out.println("Jika tidak ada orang masuk, maka lampu mati");
        }

        // Kasus c: adaOrang = false 
        adaOrang = false;
        if (adaOrang) {
            System.out.println("Jika sensor mendeteksi orang masuk, maka lampu menyala");
        } else {
            System.out.println("Jika tidak ada orang masuk, maka lampu mati");
        }
    }
}