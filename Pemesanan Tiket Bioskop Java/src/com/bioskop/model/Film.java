/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bioskop.model;

/**
 *
 * @author M S I
 */
// 2. Models

public class Film {
    private String judul;
    private String kategori; // "D" untuk Dewasa, "SU" untuk Semua Umur
    private int stok;

    public Film(String judul, String kategori, int stok) {
        this.judul = judul;
        this.kategori = kategori;
        this.stok = stok;
    }

    public String getJudul() {
        return judul;
    }

    public String getKategori() {
        return kategori;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public String toString() {
        return judul + " [Kategori: " + kategori + ", Stok: " + stok + "]";
    }
}

