package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class filmManagerTest {
    Film movie1 = new Film(1, "The Fast and the Furious");
    Film movie2 = new Film(2, "The Fast and the Furious 2");
    Film movie3 = new Film(3, "The Fast and the Furious 3");
    Film movie4 = new Film(4, "The Fast and the Furious 4");
    Film movie5 = new Film(5, "The Fast and the Furious 5");
    Film movie6 = new Film(6, "The Fast and the Furious 6");
    FilmManager manager = new FilmManager(3);

    @BeforeEach
    public void setup() {
        manager.saveFilm(movie1);
        manager.saveFilm(movie2);
        manager.saveFilm(movie3);
        manager.saveFilm(movie4);
        manager.saveFilm(movie5);
        manager.saveFilm(movie6);
    }

    @Test
    void shouldSaveMovie() {
        manager.saveFilm(movie1);
        manager.saveFilm(movie2);
        manager.saveFilm(movie3);

        Film[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie1, movie2, movie3};

        Assertions.assertArrayEquals(expected, manager.findAll());
    }


    @Test
    void shouldFindAll() {
        Film[] expected = {movie1, movie2, movie3, movie4, movie5, movie6};

        Assertions.assertArrayEquals(expected, manager.findAll());

    }

    @Test
    void findLast3() {
        Film[] expected = {movie6, movie5, movie4};

        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    void findLast5() {
        ru.netology.FilmManager defaultManager = new ru.netology.FilmManager();

        defaultManager.saveFilm(movie1);
        defaultManager.saveFilm(movie2);
        defaultManager.saveFilm(movie3);


        Film[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, defaultManager.findLast());
    }
}


