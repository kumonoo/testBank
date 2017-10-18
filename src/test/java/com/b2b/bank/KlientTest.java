package com.b2b.bank;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.b2b.bank.domain.Klient;
import com.b2b.bank.util.Utils;

public class KlientTest {

	@Test
	public void czyListaKlientowBankuNieJestPusta() {
		Utils utils = new Utils();
		List<Klient> klienci = utils.stworzDomyslnaListeKlientowMillenium();
		
		assertEquals(false, klienci.isEmpty());
		
	}
	
	@Test
	public void czyListaKlientowBtankuZawieraMalka() {
		Utils utils = new Utils();
		List<Klient>klienci = utils.stworzDomyslnaListeKlientowMillenium();
		boolean czyJestMalek = false;
		
		for(Klient klient : klienci) {
			if(klient.getNazwisko().equals("Malek")) {
				czyJestMalek = true;
			}
		}
	}
	
	@Test
	public void CzyListaKlientowBankuZawieraTomasza() {
		Utils utils = new Utils();
		List<Klient>klienci = utils.stworzDomyslnaListeKlientowMillenium();
		boolean czyJestTomasz = false;
		
		for(Klient klient : klienci) {
			if(klient.getImie().equals("Tomasz")) {
				czyJestTomasz = true;
				
			}
		}
	}
	
	@Test
	public void CzyWszyscyKlienciMajaPrawidlowyRokUrodzenia() {
		Utils utils = new Utils();
		List<Klient>klienci = utils.stworzDomyslnaListeKlientowMillenium();
		boolean czyNieprawidlowyRokUrodzenia = false;
		
		for(Klient klient : klienci) {
			if(klient.getRokUrodzenia() == 0) {
				czyNieprawidlowyRokUrodzenia = true;
			}
			}
        assertEquals(false, czyNieprawidlowyRokUrodzenia);
       }
	@Test
	public void CzyWszyscyKlienciMajaDodatniStanKonta() {
		Utils utils = new Utils();
		List<Klient>klienci = utils.stworzDomyslnaListeKlientowMillenium();
		boolean CzyUjemneSaldo = false;
		
		for(Klient klient : klienci) {
			if(klient.getStanKonta() <0) {
				CzyUjemneSaldo = true;
				
			}
		}
	  assertEquals(false,CzyUjemneSaldo);
}
}

