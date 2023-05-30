public class Penyihir extends Karakter implements Pertempuran {
    private String sihir;

    public Penyihir(String nama, int level, int poinKekuatan, String kekuatanPenyihir) {
        super(nama, level, poinKekuatan);
        this.sihir = kekuatanPenyihir;
    }

    @Override
    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Level: " + level);
        System.out.println("Poin Kekuatan: " + poinKekuatan);
        System.out.println("Sihir yang dikuasai: " + sihir);
    }

    @Override
    public void serang() {
        System.out.println("Penyihir " + nama + " bertempur dengan atribut sihir " + sihir);
    }
}