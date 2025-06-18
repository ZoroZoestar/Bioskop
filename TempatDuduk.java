public class TempatDuduk {
    private boolean[] kursi;

    public TempatDuduk() {
        kursi = new boolean[10]; // Misal: 10 kursi, false = kosong
    }

    // Method untuk mengecek apakah kursi tersedia
    public boolean cekKursi(int noKursi) {
        if (noKursi < 0 || noKursi >= kursi.length) {
            System.out.println("Nomor kursi tidak valid.");
            return false;
        }
        return !kursi[noKursi]; // true jika kosong
    }

    // Method untuk memesan kursi (menandai sebagai terisi)
    public void pesan(int noKursi) {
        if (noKursi >= 0 && noKursi < kursi.length) {
            kursi[noKursi] = true;
        }
    }

    // Method untuk menampilkan status kursi
    public void tampilKursi() {
        System.out.print("Kursi: ");
        for (int i = 0; i < kursi.length; i++) {
            if (kursi[i]) {
                System.out.print("[X] "); // Sudah terisi
            } else {
                System.out.print("[" + i + "] ");
            }
        }
        System.out.println();
    }
}
