package com.b2b.bank.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.b2b.bank.domain.Bank;
import com.b2b.bank.domain.Klient;

public class Utils {
	private Scanner scanner;

	public Utils() {
		scanner = new Scanner(System.in);
	}

	public String nazwiskoKlienta() {
		return "nazwisko";
	}

	
	
	public List<Bank> stworzDomyslnaListeBankow(){
		List<Bank> banki = new ArrayList<>();
		List<Klient> klienciMillenium = stworzDomyslnaListeKlientowMillenium();
		banki.add(new Bank(klienciMillenium, "Millenium"));
		List<Klient> klienciPkoBp = stworzDomyslnaListeKlientowPkoBp();
		banki.add(new Bank(klienciPkoBp, "PKO BP"));
		
		
		return banki;
	}

	/*public List<Klient> stworzListeKlientow() {
		List<Klient> klienci = new ArrayList<Klient>();
		boolean czyTworzycKlienta = true;
		
		do {
			System.out.println("Czy stworzyć klienta?");
			czyTworzycKlienta = scanner.nextBoolean();
			if (czyTworzycKlienta) {
				Klient klient = new Klient();
				System.out.println("Podaj imię klienta");// warunek imie nie
															// moze zaczynac sie
															// od cyfry;
				String imie = scanner.next();
				
				klient.setImie(imie);
				System.out.println("Podaj nazwisko klienta");
				String nazwisko = scanner.next();
				klient.setNazwisko(nazwisko);
				System.out.println("Podaj rok urodzenia klienta");
				int rokUrodzenia = scanner.nextInt();
				
				klient.setRokUrodzenia(rokUrodzenia);
				System.out.println("Podaj stan konta");
				double stanKonta = scanner.nextDouble();
				klient.setStanKonta(stanKonta);
				klienci.add(klient);
			}
		} while (czyTworzycKlienta);

		return klienci;
	}*/

	public List<Klient> stworzDomyslnaListeKlientowMillenium(){
		List<Klient> klienci = new ArrayList<>();
		
		
		Klient janek = new Klient( "Kowalski", 213.20);
		janek.setRokUrodzenia(1984);
		janek.setImie("Jan");
		klienci.add(janek);
		Klient piotrus = new Klient("Malek", 123.20);
		piotrus.setRokUrodzenia(1976);
		piotrus.setImie("Piotr");
		klienci.add(piotrus);
		
		
		return klienci;
	}
	public List<Klient> stworzDomyslnaListeKlientowPkoBp(){
		List<Klient> klienci = new ArrayList<>();
		
		
		Klient Anka = new Klient("Waza", 2160.20);
		Anka.setRokUrodzenia(1987);
		Anka.setImie("Anna");
		klienci.add(Anka);
		Klient Filipek = new Klient( "Kozak", 1123.20);
		Filipek.setRokUrodzenia(1989);
		Filipek.setImie("Filip");
		klienci.add(Filipek);
		
		
		return klienci;
	

}
}

