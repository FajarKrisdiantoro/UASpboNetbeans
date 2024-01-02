/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Soal_2;

/**
 *
 * @author Fajar Krisdiantoro
 */
public class Main {

    public static void main(String[] args) {

        // Buat objek manajer
        Manager manager = new Manager("John Doe");

        // Buat objek pengembang
        Developer developer = new Developer("Jane Doe");

        // Buat objek desainer
        Designer designer = new Designer("John Smith");

        // Panggil metode work() pada ketiga objek tersebut
        manager.work();
        developer.work();
        designer.work();
    }
}
