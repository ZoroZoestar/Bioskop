import java.util.Scanner;

public class BioskopApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data film dan jadwal
        Film film1 = new Film("Final Destination: Bloodlines", "Horror", 109);
        Film film2 = new Film("Interstellar", "Adventure", 169);
        Film film3 = new Film("Jumbo", "Family", 102);
        String[] jam1 = {"12:00", "15:00", "18:00"};
        String[] jam2 = {"13:00", "16:00", "19:00"};

        Jadwal jadwal1 = new Jadwal(film1, jam1);
        Jadwal jadwal2 = new Jadwal(film2, jam2);

        TempatDuduk tempatDuduk = new TempatDuduk();

        // Input nama user
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();
        User user = new User(nama, tempatDuduk);

        // Pilih film
        System.out.println("\n=== Daftar Film ===");
        System.out.println("1. " + film1.getJudul());
        System.out.println("2. " + film2.getJudul());
        System.out.println("3. " + film3.getJudul());
        System.out.print("Pilih nomor film: ");
        int pilihFilm = input.nextInt();

        Film filmDipilih;
        Jadwal jadwalDipilih;

        if (pilihFilm == 1) {
            filmDipilih = film1;
            jadwalDipilih = jadwal1;
        } else {
            filmDipilih = film2;
            jadwalDipilih = jadwal2;
        }

        System.out.println("\nJadwal Tayang:");
        String[] jamTayang = jadwalDipilih.getJamTayang();
        for (int i = 0; i < jamTayang.length; i++) {
            System.out.println((i + 1) + ". " + jamTayang[i]);
        }

        System.out.print("Pilih nomor jam tayang: ");
        int pilihJam = input.nextInt();
        String jamDipilih = jamTayang[pilihJam - 1];

        // Tampilkan kursi tersedia
        tempatDuduk.tampilKursi();

        System.out.print("Pilih nomor kursi (0-9): ");
        int nomorKursi = input.nextInt();

        // Proses pemesanan tiket
        user.pesanTiket(filmDipilih, jamDipilih, nomorKursi);

        // Tampilkan kursi setelah pemesanan
        System.out.println("\nKondisi Kursi Sekarang:");
        tempatDuduk.tampilKursi();

        input.close();
    }
}
