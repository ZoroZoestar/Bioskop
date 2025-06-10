class TempatDuduk {
    private boolean[] kursi = new boolean[10]; // 10 kursi

    public boolean pilihKursi(int nomor) {
        if (nomor < 0 || nomor >= kursi.length) return false;
        if (!kursi[nomor]) {
            kursi[nomor] = true;
            return true;
        }
        return false;
    }

    public void tampilKursi() {
        System.out.print("Kursi: ");
        for (int i = 0; i < kursi.length; i++) {
            System.out.print((kursi[i] ? "[X]" : "[" + i + "]") + " ");
        }
        System.out.println();
    }
}