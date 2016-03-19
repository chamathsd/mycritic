package xyz.mycritic.mycritic;

/**
 * Created by Jake on 3/19/2016.
 */

import info.movito.themoviedbapi.*;
import info.movito.themoviedbapi.model.MovieDb;

public class TMDbHandler {

    TMDbHandler() {
        TmdbMovies movies = new TmdbApi("<apikey>").getMovies();
        MovieDb movie = movies.getMovie(5353, "en");
    }
}
