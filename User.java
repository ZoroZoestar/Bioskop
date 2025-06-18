class User implements PesanTiket {
    private String nama;
    private boolean vip;
    private TempatDuduk tempatDuduk;

    public User(String nama, boolean vip, TempatDuduk tempatDuduk) {
        this.nama = nama;
        this.vip = vip;
        this.tempatDuduk = tempatDuduk;
    }

    public void pesanTiket(Film film, String jam, int noKursi) {
        if (!tempatDuduk.cekKursi(noKursi)) {
            System.out.println("Kursi sudah terisi.");
            return;
        }

        double hargaAwal = film.getHarga();
        double tambahan = vip ? 0.2 * hargaAwal : 0.0;
        double totalBayar = hargaAwal + tambahan;

        Tiket tiket = new TiketBioskop(film, jam, noKursi);
        tempatDuduk.pesan(noKursi);

        System.out.println("\n=== TIKET BIOSKOP ===");
        tiket.cetakTiket();
        System.out.println("Nama  : " + nama);
        System.out.println("Status: " + (vip ? "VIP (Tambahan 20%)" : "Regular"));
        System.out.printf("Harga : Rp%.0f\n", hargaAwal);
        if (vip) System.out.printf("Tambahan VIP: Rp%.0f\n", tambahan);
        System.out.printf("Total : Rp%.0f\n", totalBayar);
        System.out.println("======================");
    }
}
