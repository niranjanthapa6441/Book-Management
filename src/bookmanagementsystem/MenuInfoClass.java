/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookmanagementsystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author niran
 */
public class MenuInfoClass extends Menu {

    private String bookName, author;
    int rating;
    double price;
    public MenuInfoClass(int bookID, String category, String genre, String language, String yearPublished, double price, int rating) {
        super(bookID, category, genre, language, yearPublished);
        this.price = price;
        this.rating = rating;
        bookName = " ";
        author = " "; 
    }
    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }
    //method to write the values in .txt file
    public static void saveRecords(int bookID, String bookName, String authorName, double price, String category, String genre, String language, String yearPublished, int rating, String filePath) {
        try {
            //enables the .txt file to write
            FileWriter fw = new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(fw);
            try (PrintWriter pw = new PrintWriter(bw)) {
                pw.println(bookID + "," + bookName + "," + authorName + "," + price + "," + category + "," + genre + "," + language + "," + yearPublished + "," + rating);
                pw.flush();
            }
        } catch (IOException E) {
            JOptionPane.showMessageDialog(null, "records are not stored");
        }
    }
}
