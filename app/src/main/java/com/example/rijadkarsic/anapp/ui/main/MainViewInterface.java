package com.example.rijadkarsic.anapp.ui.main;

import com.example.rijadkarsic.anapp.models.MovieResponse;

public interface MainViewInterface {

    void showToast(String s);
    void displayMovies(MovieResponse movieResponse);
    void displayError(String s);
}
