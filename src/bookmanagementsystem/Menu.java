/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookmanagementsystem;

/**
 *
 * @author niran
 */
public class Menu {
    //declaration of global variables
    private int bookID;
    private String category, genre, yearPublished, language;
    
    public Menu(int bookID, String category, String genre, String language, String yearPublished) {
        this.bookID = bookID;
        this.category = category;
        this.genre = genre;
        this.language = language;
        this.yearPublished = yearPublished;
    }
    //getters method
    public int getBookID() {
        return this.bookID;
    }

    public String getGenre() {
        return this.genre;
    }

    public String getCategory() {
        return this.category;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getYearPublished() {
        return this.yearPublished;
    }

}
