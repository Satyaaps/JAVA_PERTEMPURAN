public class Prajurit extends Karakter implements Pertempuran {
    private String senjata;

    public Prajurit(String nama, int level, int poinKekuatan, String senjataPrajurit) {
        super(nama, level, poinKekuatan);
        this.senjata = senjataPrajurit;
    }

    @Override
    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Level: " + level);
        System.out.println("Poin Kekuatan: " + poinKekuatan);
        System.out.println("Senjata yang digunakan: " + senjata);
    }

    @Override
    public void serang() {
        System.out.println("Prajurit " + nama + " menyerang dengan senjata " + senjata);
    }
}