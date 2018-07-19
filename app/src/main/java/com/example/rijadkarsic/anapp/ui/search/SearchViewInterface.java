package com.example.rijadkarsic.anapp.ui.search;

import com.example.rijadkarsic.anapp.models.MovieResponse;

public interface SearchViewInterface {

    void showToast(String str);
    void displayResult(MovieResponse movieResponse);
    void displayError(String s);
}
