abstract class Tiket {
    protected Film film;
    protected String waktu;
    protected int kursi;

    public Tiket(Film film, String waktu, int kursi) {
        this.film = film;
        this.waktu = waktu;
        this.kursi = kursi;
    }

    public abstract void cetakTiket();
}
