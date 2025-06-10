public class BioskopApp {
    public static void main(String[] args) {
        Film film1 = new Film("Inception", "Sci-Fi", 148);
        String[] jam = {"12:00", "15:00", "18:00"};
        Jadwal jadwal = new Jadwal(film1, jam);

        TempatDuduk tempatDuduk = new TempatDuduk();
        User user = new User("Andi", tempatDuduk);

        film1.tampilInfo();
        jadwal.tampilJadwal();
        tempatDuduk.tampilKursi();

        user.pesanTiket(film1, "15:00", 4); // kursi 4
        tempatDuduk.tampilKursi();

        user.pesanTiket(film1, "15:00", 4); // mencoba kursi yang sama
    }
}
