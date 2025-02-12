package com.niit.project.RecommendedMovieService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class RecommendedMovies {

    @Id
    private String movieName;
    private String playtime;
    private String genre;
    private String language;
    private int rating;
    private int releaseYear;

    public RecommendedMovies() {
    }

    public RecommendedMovies( int releaseYear, int rating, String movieName, String playtime, String genre, String language) {
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.movieName = movieName;
        this.playtime = playtime;
        this.genre = genre;
        this.language = language;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getPlaytime() {
        return playtime;
    }

    public void setPlaytime(String playtime) {
        this.playtime = playtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Movies{" +
                " releaseYear=" + releaseYear +
                ", rating=" + rating +
                ", movieName='" + movieName + '\'' +
                ", playtime='" + playtime + '\'' +
                ", genre='" + genre + '\'' +
                ", language='" + language + '\'' +
                '}';
    }

}
