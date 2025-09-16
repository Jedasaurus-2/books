
package com.svgs;

import javafx.beans.property.SimpleStringProperty;

public class Book {
    private SimpleStringProperty title;
    private SimpleStringProperty author;
    private SimpleStringProperty year;
    private SimpleStringProperty genre;
    private SimpleStringProperty rating;

    Book(String title, String author, String year, String genre, String rating) {
        this.title = new SimpleStringProperty(title);
        this.author = new SimpleStringProperty(author);
        this.year = new SimpleStringProperty(year);
        this.genre = new SimpleStringProperty(genre);
        this.rating = new SimpleStringProperty(rating);
    }

    public SimpleStringProperty getTitleProperty() {
        return title;
    }

    public SimpleStringProperty getAuthorProperty() {
        return author;
    }

    public SimpleStringProperty getYearProperty() {
        return year;
    }

    public SimpleStringProperty getGenreProperty() {
        return genre;
    }

    public SimpleStringProperty getRatingProperty() {
        return rating;
    }

}
