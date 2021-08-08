package com.muhammet.entity;

public class Kedi {
	
	private String ad;
	private String tur;
	private int kuyruk_uzunlugu;
	private int boy_uzunlugu;
	private int agirlik;
	private String goz_rengi;
	
	// Constructor -> Kurucu yap�c� method,
	// bir s�n�ftan nesne t�retilirken yap�lmas� istenilen 
	// temel kodlar�n i�letilece�i methodtur;
	// 1- s�n�f ad� ile ayn� ada sahiptir.
	// 2- bir method dur.
	// 3- geri d�n�� parametresi almaz.
	// NOT: geri d�n�� de�eri i�ermez. yanl�� bilgidir.
	public Kedi() {
		System.out.println("Constructor �al��t�... ");
		tur = "Ankara Kedisi";
		kuyruk_uzunlugu = 10;
		boy_uzunlugu = 35;
		agirlik = 400;
		goz_rengi = "mavi";
		ad = "Pisicik";
	}
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getTur() {
		return tur;
	}
	public void setTur(String tur) {
		this.tur = tur;
	}
	public int getKuyruk_uzunlugu() {
		return kuyruk_uzunlugu;
	}
	public void setKuyruk_uzunlugu(int kuyruk_uzunlugu) {
		this.kuyruk_uzunlugu = kuyruk_uzunlugu;
	}
	public int getBoy_uzunlugu() {
		return boy_uzunlugu;
	}
	public void setBoy_uzunlugu(int boy_uzunlugu) {
		this.boy_uzunlugu = boy_uzunlugu;
	}
	public int getAgirlik() {
		return agirlik;
	}
	public void setAgirlik(int agirlik) {
		this.agirlik = agirlik;
	}
	public String getGoz_rengi() {
		return goz_rengi;
	}
	public void setGoz_rengi(String goz_rengi) {
		this.goz_rengi = goz_rengi;
	}
	
	
	

}
