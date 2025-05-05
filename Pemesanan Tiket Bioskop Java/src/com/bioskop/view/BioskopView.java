/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bioskop.view;

import java.util.Scanner;

import com.bioskop.controller.PemesananController;
import com.bioskop.exception.StokTiketHabisException;
import com.bioskop.exception.UsiaTidakCukupException;
import com.bioskop.model.Database;
/**
 *
 * @author M S I
 */
// VIEW



public class BioskopView {
    private Scanner scanner;
    private PemesananController controller;

    public BioskopView() {
        scanner = new Scanner(System.in);
        Database database = new Database();
        controller = new PemesananController(database);
    }

    public void tampilkanMenu() {
        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\n===== SISTEM PEMESANAN TIKET BIOSKOP =====");
            System.out.println("1. Lihat Daftar Film");
            System.out.println("2. Pesan Tiket");
            System.out.println("3. Lihat Daftar Pemesanan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline
            
            switch (pilihan) {
                case 1:
                    lihatDaftarFilm();
                    break;
                case 2:
                    pesanTiket();
                    break;
                case 3:
                    lihatDaftarPemesanan();
                    break;
                case 4:
                    lanjut = false;
                    System.out.println("Terima kasih telah menggunakan aplikasi ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private void lihatDaftarFilm() {
        System.out.println("\n===== DAFTAR FILM =====");
        controller.tampilkanDaftarFilm();
    }

    private void pesanTiket() {
        System.out.println("\n===== PEMESANAN TIKET =====");
        
        System.out.print("Masukkan judul film: ");
        String judul = scanner.nextLine();
        
        System.out.print("Masukkan jumlah tiket: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi newline
        
        System.out.print("Masukkan nama pembeli: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan usia pembeli: ");
        int usia = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi newline
        
        try {
            controller.tambahPemesanan(judul, jumlah, nama, usia);
            System.out.println("Pemesanan berhasil!");
        } catch (StokTiketHabisException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (UsiaTidakCukupException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void lihatDaftarPemesanan() {
        System.out.println("\n===== DAFTAR PEMESANAN =====");
        controller.tampilkanDaftarPemesanan();
    }
}
