package com.ubproject.theater;

public class Movie {

    String movieId;
    String about_movie;
    String banner_image_url;
    String cover_image_url;
    String languages;
    String movie_duration;
    String movie_name;
    String no_of_ratings;
    String release_date;

    public Movie(String movieId, String about_movie, String banner_image_url, String cover_image_url, String languages, String movie_duration, String movie_name, String no_of_ratings, String release_date ) {
        this.movieId = movieId;
        this.about_movie = about_movie;
        this.banner_image_url = banner_image_url;
        this.cover_image_url = cover_image_url;
        this.languages = languages;
        this.movie_duration = movie_duration;
        this.movie_name = movie_name;
        this.no_of_ratings = no_of_ratings;
        this.release_date = release_date;

    }

    public String getId() {
        return movieId;
    }

    public String getAbout_movie() {
        return about_movie;
    }

    public String getBanner_image_url() {
        return banner_image_url;
    }
    public String getCover_image_url() {
        return cover_image_url;
    }
    public String getLanguages() {
        return languages;
    }
    public String getMovie_duration() {
        return movie_duration;
    }
    public String getMovie_name() {
        return movie_name;
    }
    public String getNo_of_ratings() {
        return no_of_ratings;
    }
    public String getRelease_date() {
        return release_date;
    }


}