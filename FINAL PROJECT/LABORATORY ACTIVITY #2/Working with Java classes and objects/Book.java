/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mybooklist;

/**
 *
 * @author Admin
 */
public class Book {
    //1. Properties (or Fields)
    private String title;
    private String author;
    private int yearPublished;
    private int currentPage;

    //2. Constructor
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.currentPage = 0; // default when a new book is created
    }

    //3. Methods (Behaviors)
    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + yearPublished + ", Current Page: " + currentPage);
    }

    // Method to change the current page
    public void changePage(int newPage) {
        this.currentPage = newPage;
    }

    // Method to change the author’s name
    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    // Method to get the year published (used later in main)
    public int getYearPublished() {
        return yearPublished;
    }

    // Method to get the title (for displaying titles only)
    public String getTitle() {
        return title;
    }
}

