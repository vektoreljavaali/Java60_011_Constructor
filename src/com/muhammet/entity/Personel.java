package com.muhammet.entity;

import java.util.UUID;

public class Personel {

	private String id;
	private String ad="ye�im";
	private String soyad="baaaaak";
	private String adres="olmad�";
	private String telefon="beni ara";
	//default constructor
	// E�er default constructor silir ve �zelle�tirilmi� constructor
	// kullan�l�r ise, �zelle�tirilmi� olan zorunlu hale gelir.
	/*
	public Personel()
	{
		
	}
	*/
	public Personel(String ad_, String soyad_, 
					String adres_,String telefon_) {
		id = UUID.randomUUID().toString();
		ad = ad_;
		soyad = soyad_;
		adres = adres_;
		telefon = telefon_;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	
}
