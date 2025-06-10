class TiketBioskop extends Tiket {
    public TiketBioskop(Film film, String waktu, int kursi) {
        super(film, waktu, kursi);
    }

    @Override
    public void cetakTiket() {
        System.out.println("\n=== TIKET BIOSKOP ===");
        System.out.println("Film : " + film.getJudul());
        System.out.println("Jam  : " + waktu);
        System.out.println("Kursi: " + kursi);
        System.out.println("======================");
    }

    // Method overloading
    public void cetakTiket(String tambahan) {
        cetakTiket();
        System.out.println("Catatan: " + tambahan);
    }
}
