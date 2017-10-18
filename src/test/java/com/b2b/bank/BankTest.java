package com.b2b.bank;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.b2b.bank.domain.Bank;
import com.b2b.bank.domain.Klient;
import com.b2b.bank.util.Utils;

/**
 * Unit test for simple App.
 */
public class BankTest {

	@Test
	public void czyListaBankowNieJestPusta() {
		Utils utils = new Utils();
		List<Bank> banki = utils.stworzDomyslnaListeBankow();

		assertEquals(false, banki.isEmpty());
	}

	@Test
	public void czyListaBankowZawieraBankMillenium() {
		Utils utils = new Utils();
		List<Bank> banki = utils.stworzDomyslnaListeBankow();
		boolean czyJestBankMillenium = false;
		for (Bank bank : banki) {
			if (bank.getNazwaBanku().equals("Millenium")) {
				czyJestBankMillenium = true;

			}
		}

		assertEquals(true, czyJestBankMillenium);

	}

	@Test
	public void CzyListaKlientowBankuMilleniumjest2() {
		Utils utils = new Utils();
		List<Bank> banki = utils.stworzDomyslnaListeBankow();
		boolean czyBankMaDwochKlientow = false;
		for (Bank bank : banki) {
			if (bank.getNazwaBanku().equals("Millenium")) {
				if (bank.getKlienci().size() == 2) {

					czyBankMaDwochKlientow = true;

				}

			}
		}
		assertEquals(true, czyBankMaDwochKlientow);
	}

	@Test
	public void CzyStanKontWeWszystkichBankachJestWiekszyNiz1000() {
		Utils utils = new Utils();
		List<Bank> banki = utils.stworzDomyslnaListeBankow();
		boolean czyStanKontaBankuJestWiekszyNiz1000 = true;
		for (Bank bank : banki) {
			double sumaStanowKontKlientow = 0;
			for (Klient klient : bank.getKlienci()) {
				sumaStanowKontKlientow = sumaStanowKontKlientow + klient.getStanKonta();

				if (sumaStanowKontKlientow < 1000) {
					czyStanKontaBankuJestWiekszyNiz1000 = false;

				}
			}
			assertEquals(true, czyStanKontaBankuJestWiekszyNiz1000);

		}
	}

	@Test
	public void CzyStanKontaKazdegoKlientaPrzekracza100() {
		Utils utils = new Utils();
		List<Bank> banki = utils.stworzDomyslnaListeBankow();
		boolean CzyStanKontaKazdegoKlientaPrzekracza100 = true;
		for (Bank bank : banki) {
			for (Klient klient : bank.getKlienci()) {
				if (klient.getStanKonta() < 100) {
					CzyStanKontaKazdegoKlientaPrzekracza100 = false;

				}
			}
		}

		assertEquals(true, CzyStanKontaKazdegoKlientaPrzekracza100);

	}
	@Test
	public void CzyWszyscyKlienciMajaPrawidloweImiona() {
		Utils utils = new Utils();
		List<Bank> banki = utils.stworzDomyslnaListeBankow();
		boolean czyImionaSaPrawidlowe = true;
		for(Bank bank : banki) {
			for(Klient klient : bank.getKlienci()) {
				if(klient.getImie().isEmpty()) {
					czyImionaSaPrawidlowe = false;
				}
			}
		}
		assertEquals(true, czyImionaSaPrawidlowe);
				}
		

}

