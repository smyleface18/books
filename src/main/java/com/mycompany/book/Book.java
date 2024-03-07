/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.book;
import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    int loanTime;
    String user;
    String loanDate; // la fecha que salio
    String returnDate;  

    public Book(String title, String author, String genre, String datePub, String avalible, String quantity, int loanTime, String user, String loanDate, String returnDate) {
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
                
                //el siguiente codigo se trabaja con fechas
                
                SimpleDateFormat fechaf = new SimpleDateFormat("dd/mm/yyyy");
                
               Date fecha = new Date();
              Calendar c1 = Calendar.getInstance();
              
              String fecha_H = String.valueOf(c1.get(Calendar.DATE))+"/"+String.valueOf(c1.get(Calendar.MONTH)+1)+"/"+String.valueOf(c1.get(Calendar.YEAR));
            try {

                Date fechaHoy = fechaf.parse(fecha_H);
               
                long sumaFecha = fechaHoy.getTime() + (this.loanTime*24*60*60*1000); //convierto loanTime en milisegundos
                 Instant instant = Instant.ofEpochMilli(sumaFecha);
                 Date myDate = Date.from(instant);
                 this.loanDate = fecha_H;
                 this.returnDate = fechaf.format(myDate);;

                
            } catch (ParseException ex) {
                Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            }
              
              
        }
        
        else{
            System.out.println("El libro no esta disponible");
        }
        
    }
    
    public void returnBook(){
         this.avalible = "DISPOBIBLE";
         this.user = "";
         this.loanDate = "";
         this.returnDate ="";

    }
    
    public void printBook(){
        System.out.println(this.title+" | "+this.author+" | "+this.genre+" | "+this.datePub + " | "+this.avalible+" | Cantidad: "+this.quantity+" | "+this.loanTime+" |  User:"+this.user+" | "+this.loanDate+" | "+this.returnDate);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDatePub() {
        return datePub;
    }

    public void setDatePub(String datePub) {
        this.datePub = datePub;
    }

    public String getAvalible() {
        return avalible;
    }

    public void setAvalible(String avalible) {
        this.avalible = avalible;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public int getLoanTime() {
        return loanTime;
    }

    public void setLoanTime(int loanTime) {
        this.loanTime = loanTime;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
    
    
    
    
}
