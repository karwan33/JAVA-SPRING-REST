package com.example.demo2.film;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FilmService {
	
	private List<Film> films = new ArrayList<>(Arrays.asList(
			new Film("1","Harry Potter and the Sorcerer's Stone","On the day of his eleventh birthday, Harry learns that he is a wizard. A school of magic is waiting for him full of secrets.","2001"),
			new Film("2","Justice League","Some of the greatest superheroes in the world make up the Justice League. Its goal is to combat threats that go beyond human capabilities.","2017"),
			new Film("3","Twilight","Adaptation of Stephenie Meyer's book. A shy and lost teenager falls in love with a vampire.","2008"),
			new Film("4","The Fast and the Furious","The policeman enters the group organizing illegal car racing. The situation becomes more complicated when one gets to know the sister of the leader of criminals.","2001"),
			new Film("5","Maze Runner: The Death Cure","Thomas sets off on a mission to find a cure to fight a deadly disease.","2018")
			));
	
	public List<Film> getAllFilms()
	{
		return films;
	}

	
	public Film getFilm(String id)
	{
		return films.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}


	public void addFilm(Film film) {
		films.add(film);
		
	}
	
}
