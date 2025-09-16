package com.svgs;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class BookController {

    @FXML
    private Button addBookButton;

    @FXML
    private TableColumn<Book, String> authorCol;

    @FXML
    private TextField authorField;

    @FXML
    private TableView<Book> bookTable;

    @FXML
    private Button deleteBookButton;

    @FXML
    private ComboBox<String> genreBox;

    @FXML
    private TableColumn<Book, String> genreCol;

    @FXML
    private RadioButton rating1;

    @FXML
    private RadioButton rating2;

    @FXML
    private RadioButton rating3;

    @FXML
    private RadioButton rating4;

    @FXML
    private RadioButton rating5;

    @FXML
    private TableColumn<Book, String> ratingCol;

    @FXML
    private ToggleGroup ratingGroup;

    @FXML
    private TableColumn<Book, String> titleCol;

    @FXML
    private TextField titleField;

    @FXML
    private TableColumn<Book, String> yearCol;

    @FXML
    private TextField yearField;//

    private ObservableList<Book> books;

    @FXML
    void initialize() {
        ObservableList<String> genres = FXCollections.observableArrayList();
        genres.addAll("Romance", "Mystery", "Horror");
        genreBox.setItems(genres);
        bookTable.getItems();
        books = bookTable.getItems();
        books.add(new Book("#1 Book", "That one guy in that one house", "1955", "Science Fiction", "5"));
        titleCol.setCellValueFactory(cellData -> cellData.getValue().getTitleProperty());
        authorCol.setCellValueFactory(cellData -> cellData.getValue().getAuthorProperty());
        yearCol.setCellValueFactory(cellData -> cellData.getValue().getYearProperty());
        genreCol.setCellValueFactory(cellData -> cellData.getValue().getGenreProperty());
        ratingCol.setCellValueFactory(cellData -> cellData.getValue().getRatingProperty());
    }

    @FXML
    void handleAddBook(ActionEvent event) {

    }

    @FXML
    void handleDeleteBook(ActionEvent event) {

    }

}
