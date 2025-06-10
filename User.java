class User implements PesanTiket {
    private String nama;
    private TempatDuduk tempatDuduk;

    public User(String nama, TempatDuduk tempatDuduk) {
        this.nama = nama;
        this.tempatDuduk = tempatDuduk;
    }

    @Override
    public void pesanTiket(Film film, String waktu, int kursi) {
        if (tempatDuduk.pilihKursi(kursi)) {
            TiketBioskop tiket = new TiketBioskop(film, waktu, kursi);
            tiket.cetakTiket("Dipesan oleh " + nama);
        } else {
            System.out.println("Kursi " + kursi + " sudah dipesan. Silakan pilih kursi lain.");
        }
    }
}
