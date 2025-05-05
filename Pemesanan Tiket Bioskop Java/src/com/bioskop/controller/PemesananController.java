/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bioskop.controller;
import com.bioskop.exception.StokTiketHabisException;
import com.bioskop.exception.UsiaTidakCukupException;
import com.bioskop.model.Database;
import com.bioskop.model.Film;
import com.bioskop.model.Pemesanan;

/**
 *
 * @author M S I
 */
// CONTROLLER


public class PemesananController {
    private Database database;

    public PemesananController(Database database) {
        this.database = database;
    }

    public void tambahPemesanan(String judulFilm, int jumlahTiket, String namaPembeli, int usiaPembeli) 
            throws StokTiketHabisException, UsiaTidakCukupException {
        
        Film film = database.getFilmByJudul(judulFilm);
        
        if (film == null) {
            throw new IllegalArgumentException("Film tidak ditemukan");
        }
        
        // Validasi stok tiket
        if (jumlahTiket > film.getStok()) {
            throw new StokTiketHabisException("Stok tiket tidak mencukupi. Stok tersedia: " + film.getStok());
        }
        
        // Validasi usia untuk film kategori Dewasa
        if (film.getKategori().equals("D") && usiaPembeli < 17) {
            throw new UsiaTidakCukupException("Usia minimal untuk film kategori Dewasa adalah 17 tahun");
        }
        
        // Jika semua validasi berhasil, tambahkan pemesanan
        Pemesanan pemesanan = new Pemesanan(judulFilm, jumlahTiket, namaPembeli, usiaPembeli);
        database.tambahPemesanan(pemesanan);
        
        // Update stok film
        film.setStok(film.getStok() - jumlahTiket);
    }

    public void tampilkanDaftarFilm() {
        for (Film film : database.getDaftarFilm()) {
            System.out.println(film);
        }
    }

    public void tampilkanDaftarPemesanan() {
        for (Pemesanan pemesanan : database.getDaftarPemesanan()) {
            System.out.println(pemesanan);
        }
    }
}
