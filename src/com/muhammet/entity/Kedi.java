package com.muhammet.entity;

public class Kedi {
	
	private String ad;
	private String tur;
	private int kuyruk_uzunlugu;
	private int boy_uzunlugu;
	private int agirlik;
	private String goz_rengi;
	
	// Constructor -> Kurucu yapýcý method,
	// bir sýnýftan nesne türetilirken yapýlmasý istenilen 
	// temel kodlarýn iþletileceði methodtur;
	// 1- sýnýf adý ile ayný ada sahiptir.
	// 2- bir method dur.
	// 3- geri dönüþ parametresi almaz.
	// NOT: geri dönüþ deðeri içermez. yanlýþ bilgidir.
	public Kedi() {
		System.out.println("Constructor çalýþtý... ");
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
