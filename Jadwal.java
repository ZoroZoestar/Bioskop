class Jadwal {
    private Film film;
    private String[] jamTayang;

    public Jadwal(Film film, String[] jamTayang) {
        this.film = film;
        this.jamTayang = jamTayang;
    }

    public void tampilJadwal() {
        System.out.println("Jadwal Tayang untuk film " + film.getJudul() + ":");
        for (String jam : jamTayang) {
            System.out.println("- " + jam);
        }
    }

    public String[] getJamTayang() {
        return jamTayang;
    }

    public Film getFilm() {
        return film;
    }
}
