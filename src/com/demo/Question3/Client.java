package com.demo.Question3;

import com.demo.Question3.Strategies.Discount;
import com.demo.Question3.Strategies.discountComputerBook;
import com.demo.Question3.Strategies.discountLanguageBook;
import com.demo.Question3.Strategies.discountNovelBook;

public class Client {

    public static void main(String[] args) {
        Book book = new Book();
        double originalPrice = 251.6;

        book.setPrice(originalPrice);
        System.out.println("Original Price: " + originalPrice);


        Discount discount;
        discount = new discountComputerBook();
        book.setDiscount(discount);
        book.calculatePrice();

        discount = new discountLanguageBook();
        book.setDiscount(discount);
        book.calculatePrice();


        discount = new discountNovelBook();
        book.setDiscount(discount);
        book.calculatePrice();
    }
}