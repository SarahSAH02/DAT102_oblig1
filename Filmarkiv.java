package filmarkiv.impl;
import java.util.ArrayList;
import java.util.List;


import filmarkiv.adt.FilmarkivADT;

public class Filmarkiv implements FilmarkivADT{
	private Film[] filmer;
	private int antallfilmer;
	
	
	
	
	public Filmarkiv(int kapasitet) {
		this.filmer = new Film[kapasitet];
		this.antallfilmer =0;
		
		
	}
	
	/**
	* Hente en film med gitt nr fra arkivet
	* @param nr nummer på film som skal hentes.
	* @return film med gitt nr. Om nr ikke finnes, returneres null.
	*/
	/**
	* Legger til en ny film.
	* @param nyFilm
	*/

	@Override
    public Film finnFilm(int nr) {
        for (Film film : filmer) {
            if (film != null && film.getFilmeNr() == nr) {
    
                return film;
            }
        }
        return null;
    }
	
	public void leggTilFilm(Film nyFilm) {
		if (antallFilmer == filmer.length) {
			utvid();
		}
		filmer[antallFilmer++] = nyFilm;
	}
	
	
	public boolean slettFilm(int filmer) {
		
		boolean v = false;
		for(int i = 0; i <antallFilmer;i++) {
			if(filmer[i] != null && filmer[i].getFilmNr() == filmnr) {
				for(int j = i; j<antallFilmer -1; j++) {
					filmer[j] = filmer[j + 1];
				}
				filmer [antallFilmer -1]= null ;
				v= true;
				antallFilmer--;
				
			}
		}return v;
	}
	
	public Film[] soekTittel(String delstreng) {
		ArrayList<Film> results = new ArrayList<>;
		for(int i =0; i<antallfilmer;i++) {
			Film element = filmer[i];
			if(element.getTittel().contains(delstreng)) {
				resultater.add(element);
			}
		}
		resultat.toArray(new Film[0]);
		
		
	}
	
	public Film[] soekProdusent(String delstreng) {
		ArrayList<Film>  resultat = new ArrayList<>;
		for(int i =; i<antallFilmer; i++) {
			Film el = filmer[i];
			if(el.getProdusent().contains(delstreng)) {
				results.add(el);
			}
		}
		return resultat.toArray(new Film[0]);
		
	}
	
	
	public int antall(Sjanger sjanger ) {
		int arkiv = 0;
		for (int i = 0; i < antall; i++) {
			if (sjanger.equals(tabell[i].getSjanger())) {
				arkiv++;
			}
		}
		return arkiv;
	}
	
	int antall() {
		return antall;
	}
}

