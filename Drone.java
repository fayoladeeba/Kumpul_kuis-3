public class Drone{
    public static void main(String[] args) {
        String angin = "selatan"; //bisa diganti sesuai intruksi soal
        
        if (angin.equals("utara")) {
            System.out.println("Drone terbang ke selatan");
        // lengkapi else if dan else di sini
        } else if (angin.equals("barat")) {
            System.out.println("Drone terbang ke timur");
        } else {
            System.out.println("Drone diam di tempat");
        }
    }
}

