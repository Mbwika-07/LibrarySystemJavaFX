package application.dao;

import application.model.Genre;
import java.util.ArrayList;
import java.util.List;

public class GenreDAO {
    private List<Genre> genres;

    public GenreDAO() {
        genres = new ArrayList<>();
    }

    public void addGenre(Genre genre) {
        genres.add(genre);
    }

    public List<Genre> getAllGenres() {
        return genres;
    }
}
