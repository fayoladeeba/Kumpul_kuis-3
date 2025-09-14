public class ParkirMall {
    public static void main(String[] args) {
        // kasus b: Kendaraan masuk jam 10 (pagi)
        int jam = 10;
        if (jam < 12) {
            System.out.println("Jam " + jam + ": Pagi, tarif Rp 5000");
        } else if (jam >= 12 && jam < 18) {
            System.out.println("Jam " + jam + ": Siang, tarif Rp 7000");
        } else {
            System.out.println("Jam " + jam + ": Malam, tarif Rp 10000");
        }

        // kasus c: Kendaraan masuk jam 20 (malam)
        jam = 20;
        if (jam < 12) {
            System.out.println("Jam " + jam + ": Pagi, tarif Rp 5000");
        } else if (jam >= 12 && jam < 18) {
            System.out.println("Jam " + jam + ": Siang, tarif Rp 7000");
        } else {
            System.out.println("Jam " + jam + ": Malam, tarif Rp 10000");
        }
    }
}
