public class Main {
    private String nama;
    private int umur;
    private String jurusan;

    public Mahasiswa() {
        nama = "Tidak diketahui";
        umur = 0;
        jurusan = "Belum dipilih";
    }

    public Mahasiswa(String nama, int umur, String jurusan) {
        // pakai this biar bedain variabel
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
    }

    public void tampilData() {
        System.out.println("Nama     : " + nama);
        System.out.println("Umur     : " + umur);
        System.out.println("Jurusan  : " + jurusan);
    }
}

 class Mahasiswa {
    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa();
        System.out.println("Data Mahasiswa 1:");
        mhs1.tampilData();

        System.out.println();

        Mahasiswa mhs2 = new Mahasiswa("Ramadany", 19, "Informatika");
        System.out.println("Data Mahasiswa 2:");
        mhs2.tampilData();
    }
}
