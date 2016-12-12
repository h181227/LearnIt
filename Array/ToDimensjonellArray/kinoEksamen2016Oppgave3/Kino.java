package kinoEksamen2016Oppgave3;

public class Kino {
	static boolean[][] seter = { { true, true, false, false, false, true, true, false },
			{ true, true, true, true, true, true, true, true }, { true, true, true, true, true, true, true, true } };

	public static void main(String[] args) {

		finnLedige();

	}

	/*
	 * Skriv en metode boolean erLedig(int r, int s) som returnerer true hvis
	 * plass s (heltall mellom 0 og 7) på rekke r (heltall mellom 0 og 2) er
	 * ledig - og false ellers.
	 */

	boolean erLedig(int r, int p) {
		return seter[r][p];
	}

	/*
	 * Denne går tar r og p som parameter, hvor r er rekke, og p er plass. Rekke
	 * og plass begynner på 0 den returnerer verdien til setet som er på rekken
	 * r og plassen p.
	 */

	/*
	 * Skriv en metode int AntallLedige() som finner antall ledige seter i salen
	 * gitt ved den to-dimensjonale tabellen seter.
	 */

	public int antallLedige() {
		int antall = 0;
		for (boolean[] rekke : seter) {
			for (boolean plass : rekke) {
				if (plass) {
					antall++;
				}
			}
		}

		return antall;
	}

	/*
	 * Denne sjekker hvor mange ledige plasser det er i kinoen den går igjennom
	 * hver rekke i tabellen seter. For hver rekke så går den igjennom hver
	 * plass og sjekker om plassen er true, da plusser den på 1 på antall
	 */

	/*
	 * Skriv en metode void finnLedig() som skriver ut rekke og plassnummer på
	 * skjermen for et ledig sete (det spiller ingen rolle hvilket ledig sete
	 * som skrives ut).
	 */

	public static void finnLedig() {
		boolean funnet = false;
		// while-løkker meste naturlig siden vi skal stoppe når en ledig plass
		// er funnet
		// og vi trenger eksplisitt tilgang til indekser for å kunne skrive ut
		// plassen til slutt
		int rekke = 0;
		while (!funnet && rekke < seter.length) {
			int plass = 0;
			while (!funnet && plass < seter[rekke].length) {
				if (seter[rekke][plass]) {
					funnet = true;
					System.out.println("rekke = " + rekke + " plass = " + plass);
				}
				plass++;
			}
			rekke++;
		}
	}

	public static void finnLedige() {
		for (int i = 0; i < seter.length; i++) {
			for (int j = 0; i < seter[j].length; j++) {
				if (seter[i][j]) {
					System.out.println("Ledig - Rekke : " + i + "Plass " + j);
				}

			}
		}

	}

}
