/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.book;
import java.util.Scanner;

/**
 *
 * @author SCIS2PC08
 */
public class Book {

    String title;
    String author;
    String genre;
    String datePub;
    String avalible; // El estado del libro
    String quantity;
    String loanTime;
    String user;
    String loanDate; // la fecha que salio
    String returnDate;  

    public Book(String title, String author, String genre, String datePub, String avalible, String quantity, String loanTime, String user, String loanDate, String returnDate) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.datePub = datePub;
        this.avalible = avalible;
        this.quantity = quantity;
        this.loanTime = loanTime;
        this.user = user;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }
    
    public void lendBook(){
        if(this.avalible.equalsIgnoreCase("DISPONIBLE")){
                this.avalible = "NO DISPONIBLE";
                System.out.println("Ingresa el nombre de usuario");
                Scanner read = new Scanner (System.in);
                this.user = read.nextLine();
        }
        
        else{
            System.out.println("El libro no esta disponible");
        }
        
    }
    
    public void returnBook(){
         this.avalible = "DISPOBIBLE";
         this.user = "";
    }
    
    public void printBook(){
        System.out.println(this.title+" | "+this.author+" | "+this.genre+" | "+this.datePub + " | "+this.avalible+" | "+this.quantity+" | "+this.loanTime+" | "+this.user+" | "+this.loanDate+" | "+this.returnDate);
    }
    
    
    
}
