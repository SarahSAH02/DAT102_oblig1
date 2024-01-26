package filmarkiv.impl;
import java.util.ArrayList;
import java.util.List;


import filmarkiv.adt.FilmarkivADT;

public class Filmarkiv implements FilmarkivADT{
	private List<Film> filmArkiv;
	
	
	public Filmarkiv() {
		filmArkiv = new ArrayList<>();
		
	}

	@Override
    public Film finnFilm(int nr) {
        for (Film film : filmArkiv) {
            if (film.getFilmnr() == nr) {
                return film;
            }
        }
        return null;
    }
}
