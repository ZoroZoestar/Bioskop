import java.util.Scanner;

public class BioskopApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Daftar film dengan harga
        Film[] daftarFilm = {
            new Film("Interstellar", "Adventure", 169, 50000),
            new Film("Avengers: Endgame", "Superhero", 181, 60000),
            new Film("La La Land", "Musical", 128, 48000),
            new Film("Jumbo", "Animation", 105, 42000),
            new Film("Joker", "Drama", 122, 47000)
        };

        // Jadwal
        Jadwal[] daftarJadwal = new Jadwal[5];
        String[][] semuaJam = {
            {"12:00", "15:00", "18:00"},
            {"11:30", "14:30", "17:30"},
            {"09:00", "12:00", "15:00"},
            {"13:15", "16:15", "19:15"},
            {"15:00", "18:00", "21:00"}
        };

        for (int i = 0; i < daftarFilm.length; i++) {
            daftarJadwal[i] = new Jadwal(daftarFilm[i], semuaJam[i]);
        }

        TempatDuduk tempatDuduk = new TempatDuduk();

        // Input user
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        System.out.print("Apakah Anda VIP? (y/n): ");
        String vipInput = input.nextLine();
        boolean isVip = vipInput.equalsIgnoreCase("y");

        User user = new User(nama, isVip, tempatDuduk);

        // Pilih film
        System.out.println("\n=== Daftar Film ===");
        for (int i = 0; i < daftarFilm.length; i++) {
            System.out.printf("%d. %s (Rp%.0f)\n", i + 1, daftarFilm[i].getJudul(), daftarFilm[i].getHarga());
        }

        System.out.print("Pilih nomor film (1-5): ");
        int pilihFilm = input.nextInt();
        input.nextLine();

        if (pilihFilm < 1 || pilihFilm > daftarFilm.length) {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        Film filmDipilih = daftarFilm[pilihFilm - 1];
        Jadwal jadwalDipilih = daftarJadwal[pilihFilm - 1];

        System.out.println("\nJadwal Tayang:");
        String[] jamTayang = jadwalDipilih.getJamTayang();
        for (int i = 0; i < jamTayang.length; i++) {
            System.out.println((i + 1) + ". " + jamTayang[i]);
        }

        System.out.print("Pilih nomor jam tayang: ");
        int pilihJam = input.nextInt();
        input.nextLine();

        if (pilihJam < 1 || pilihJam > jamTayang.length) {
            System.out.println("Pilihan jam tidak valid.");
            return;
        }

        String jamDipilih = jamTayang[pilihJam - 1];

        // Tampilkan dan pilih kursi
        tempatDuduk.tampilKursi();
        System.out.print("Pilih nomor kursi (0-9): ");
        int nomorKursi = input.nextInt();

        user.pesanTiket(filmDipilih, jamDipilih, nomorKursi);

        System.out.println("\nKondisi Kursi Sekarang:");
        tempatDuduk.tampilKursi();
    }
}
