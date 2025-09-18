package ru.netology;

public class FilmManager {
    private int numberOfFilm;
    private Film[] filmsRepozit = new Film[0];

    public FilmManager() {
        this.numberOfFilm = 5;
    }

    public FilmManager(int numberOfLastMovies) {
        this.numberOfFilm = numberOfLastMovies;
    }

    public void saveFilm(Film movie) {

        Film[] tmp = new Film[filmsRepozit.length + 1];
        for (int i = 0; i < filmsRepozit.length; i++) {
            tmp[i] = filmsRepozit[i];
        }
        tmp[tmp.length - 1] = movie;
        filmsRepozit = tmp;
    }


    public Film[] findAll() {
        return filmsRepozit;
    }

    public Film[] findLast() {
        Film[] tmp = new Film[filmsRepozit.length <= numberOfFilm ? filmsRepozit.length : numberOfFilm];
        int count = filmsRepozit.length - 1;
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = filmsRepozit[count];
            count--;
        }
        return tmp;

    }


}