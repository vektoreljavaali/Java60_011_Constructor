package com.muhammet;

import com.muhammet.entity.Kedi;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Ba�lang�� Noktas�");
		Kedi kedi = new Kedi();
		int sayi = 45;
		System.out.println("Kedinin boyu........: "+ kedi.getBoy_uzunlugu());
		System.out.println("Kedinin g�z rengi...: "+kedi.getGoz_rengi());
	}

}
