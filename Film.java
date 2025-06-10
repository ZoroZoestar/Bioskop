class Film {
    private String judul;
    private String genre;
    private int durasi; // menit

    public Film(String judul, String genre, int durasi) {
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
    }

    // Getter dan Setter
    public String getJudul() { return judul; }
    public String getGenre() { return genre; }
    public int getDurasi() { return durasi; }

    public void tampilInfo() {
        System.out.println("Judul : " + judul);
        System.out.println("Genre : " + genre);
        System.out.println("Durasi: " + durasi + " menit");
    }
}
