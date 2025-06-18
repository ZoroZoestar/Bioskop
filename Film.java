public class Film {
    private String judul;
    private String genre;
    private int durasi; // menit
    private double harga;

    public Film(String judul, String genre, int durasi, double harga) {
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
        this.harga = harga;
    }

    // Getter dan setter
    public String getJudul() { return judul; }
    public String getGenre() { return genre; }
    public int getDurasi() { return durasi; }
    public double getHarga() { return harga; }

    public void setHarga(double harga) { this.harga = harga; }
}
