
package com.svgs;

import javafx.beans.property.SimpleStringProperty;

public class Book {
    private SimpleStringProperty title;
    private SimpleStringProperty author;
    private SimpleStringProperty year;
    private SimpleStringProperty genre;
    private SimpleStringProperty rating;

    Book(String title, String author, String year, String genre, String rating) {
        this.title.setValue(title);
        this.author.setValue(author);
        this.year.setValue(year);
        this.genre.setValue(genre);
        this.rating.setValue(rating);
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

    public SimpleStringProperty getratingProperty() {
        return rating;
    }

}
