package cl.jpino.fullstackmovies.model.service;


import cl.jpino.fullstackmovies.model.entity.Movie;
import cl.jpino.fullstackmovies.model.repositroy.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private IMovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> singleImdbMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
