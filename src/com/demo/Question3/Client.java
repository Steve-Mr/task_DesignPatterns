package com.demo.Question3;

import com.demo.Question3.Strategies.Discount;
import com.demo.Question3.Strategies.discountComputerBook;
import com.demo.Question3.Strategies.discountLanguageBook;
import com.demo.Util.XMLUtil;

/**
 * 有一个网上书店，
 * 该系统中所有的计算机类图书(ComputerBook)每本都有15%的折扣，
 * 所有的语言类图书(LanguageBook)每本都有5元的折扣，
 * 文艺小说类图书(NovelBok)每满100元有20元的折扣。
 * 现使用策略模式来设计该系统。
 * */
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


        discount = (Discount) XMLUtil.getBean("src/com/demo/Question3/config.xml");
        book.setDiscount(discount);
        book.calculatePrice();
    }
}
