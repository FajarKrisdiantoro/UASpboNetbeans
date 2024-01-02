/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Soal_1;

/**
 *
 * @author Fajar Krisdiantoro
 */

public class Main {

    public static void main(String[] args) {
        // Buat objek Mahasiswa Baru
        MahasiswaBaru mahasiswaBaru = new MahasiswaBaru("Andi", 20, 123456);

        // Tampilkan informasi mahasiswa baru
        mahasiswaBaru.displayInfo();

        // Buat objek Mahasiswa Lama
        MahasiswaLama mahasiswaLama = new MahasiswaLama("Budi", 21, 2023);

        // Tampilkan informasi mahasiswa lama
        mahasiswaLama.displayInfo();
    }
}    