package com.muhammet;

import com.muhammet.entity.Personel;

public class Runner_2 {

	
	public static void main(String[] args) {
		
		/*
		 
		System.out.println("ilk ad...: "+personel.getAd());
		personel.setAd("Muhammet");
		personel.setAdres("Ankara");
		personel.setSoyad("HOCA");
		personel.setTelefon("0 999 888 7777");
		System.out.println("ad...: "+ personel.getAd());
		*/
		Personel personel = 
				new Personel("Ali","HOCA","Ýstanbul","0 777 77");
		
		System.out.println("uuid..: "+personel.getId());
		System.out.println("ad....: "+ personel.getAd());
		System.out.println("adres.: "+personel.getAdres());
		
	}
}
