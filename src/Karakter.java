public abstract class Karakter {
    protected String nama;
    protected int level;
    protected int poinKekuatan;

    public Karakter(String nama, int level, int poinKekuatan) {
        this.nama = nama;
        this.level = level;
        this.poinKekuatan = poinKekuatan;
    }

    public abstract void info();

    public void serang() {
    }
}
