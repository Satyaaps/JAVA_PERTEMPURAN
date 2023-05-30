import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nama penyihir: ");
                String namaPenyihir = input.nextLine();
            System.out.print("Masukkan kekuatan penyihir: ");
                String kekuatanPenyihir = input.nextLine();
            System.out.print("Masukkan poin kekuatan penyihir (Angka) : ");
                int poinPenyihir = input.nextInt();
            System.out.print("Masukkan level penyihir (angka) : ");
                int levelPenyihir = input.nextInt();
                input.nextLine();

            System.out.print("Masukkan nama prajurit: ");
                String namaPrajurit = input.nextLine();
            System.out.print("Masukkan senjata prajurit: ");
                String senjataPrajurit = input.nextLine();
            System.out.print("Masukkan poin kekuatan prajurit: ");
                int kekuatanPrajurit = input.nextInt();
            System.out.print("Masukkan level prajurit: ");
                int levelPrajurit = input.nextInt();

            System.out.print("\033[H\033[2J");  
            System.out.flush();

            Karakter karakter1 = new Penyihir(namaPenyihir, levelPenyihir, poinPenyihir, kekuatanPenyihir);
            Karakter karakter2 = new Prajurit(namaPrajurit, levelPrajurit, kekuatanPrajurit, senjataPrajurit);

            karakter1.info();
            karakter1.serang();

            karakter2.info();
            karakter2.serang();
        }
    }
}
