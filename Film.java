package filmarkiv.impl;

import java.util.Objects;

public class Film {
	private int filmnr;
	private String produsent;
	private String film;
	private int år;
	private Sjanger sjanger;
	private String filmselskap;
	
	public Film(int filmnr,String produsent,String film,  
			int år,  Sjanger sjanger, String filmselskap) {
		this.filmnr= filmnr;
		this.produsent=produsent;
		this.film=film;
		this.år=år;
		this.sjanger= sjanger;
		this.filmselskap= filmselskap;
	}

	public int getFilmnr() {
		return filmnr;
	}

	public void setFilmnr(int filmnr) {
		this.filmnr = filmnr;
	}

	public String getProdusent() {
		return produsent;
	}

	public void setProdusent(String produsent) {
		this.produsent = produsent;
	}

	public String getFilm() {
		return film;
	}

	public void setFilm(String film) {
		this.film = film;
	}

	public int getÅr() {
		return år;
	}

	public void setÅr(int år) {
		this.år = år;
	}

	public Sjanger getSjanger() {
		return sjanger;
	}

	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}

	public String getFilmselskap() {
		return filmselskap;
	}

	public void setFilmselskap(String filmselskap) {
		this.filmselskap = filmselskap;
	}

	@Override
	public int hashCode() {
		return Objects.hash(film, filmnr);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return Objects.equals(film, other.film) && filmnr == other.filmnr;
	}
	
	
	
}
