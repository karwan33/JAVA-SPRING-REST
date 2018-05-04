package com.example.demo2.film;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmController {
	
	@Autowired
	private FilmService filmService;
	
	@RequestMapping(method=RequestMethod.GET, value="/films")
	public List<Film> getAllFilms()
	{
		return filmService.getAllFilms();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/films")
	public void addFilm(@RequestBody Film film)
	{
		filmService.addFilm(film);
	}
	
	@RequestMapping("/films/{id}")
	public Film getFilm(@PathVariable String id)
	{
		return filmService.getFilm(id);
	}
}


