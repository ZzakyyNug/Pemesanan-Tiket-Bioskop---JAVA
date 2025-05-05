/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bioskop.model;

/**
 *
 * @author M S I
 */
public class Pemesanan {
    private String judulFilm;
    private int jumlahTiket;
    private String namaPembeli;
    private int usiaPembeli;

    public Pemesanan(String judulFilm, int jumlahTiket, String namaPembeli, int usiaPembeli) {
        this.judulFilm = judulFilm;
        this.jumlahTiket = jumlahTiket;
        this.namaPembeli = namaPembeli;
        this.usiaPembeli = usiaPembeli;
    }

    public String getJudulFilm() {
        return judulFilm;
    }

    public int getJumlahTiket() {
        return jumlahTiket;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public int getUsiaPembeli() {
        return usiaPembeli;
    }

    @Override
    public String toString() {
        return "Pemesanan: " + namaPembeli + " (" + usiaPembeli + " tahun), " +
               "Film: " + judulFilm + ", Jumlah Tiket: " + jumlahTiket;
    }
}
