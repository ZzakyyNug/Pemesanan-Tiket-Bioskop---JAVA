/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bioskop.model;

/**
 *
 * @author M S I
 */
// 3. Database

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Film> daftarFilm;
    private List<Pemesanan> daftarPemesanan;

    public Database() {
        daftarFilm = new ArrayList<>();
        daftarPemesanan = new ArrayList<>();
        
        // Inisialisasi data film
        daftarFilm.add(new Film("Avengers: Endgame", "SU", 50));
        daftarFilm.add(new Film("Fast X", "SU", 30));
        daftarFilm.add(new Film("The Conjuring", "D", 20));
        daftarFilm.add(new Film("Insidious", "D", 25));
        daftarFilm.add(new Film("Jumbo Animasi", "SU", 25));
    }

    public List<Film> getDaftarFilm() {
        return daftarFilm;
    }

    public Film getFilmByJudul(String judul) {
        for (Film film : daftarFilm) {
            if (film.getJudul().equalsIgnoreCase(judul)) {
                return film;
            }
        }
        return null;
    }

    public void tambahPemesanan(Pemesanan pemesanan) {
        daftarPemesanan.add(pemesanan);
    }

    public List<Pemesanan> getDaftarPemesanan() {
        return daftarPemesanan;
    }
}
