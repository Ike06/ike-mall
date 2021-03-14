package com.ike.demo.controller;

import com.ike.demo.bo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class Books {
    @GetMapping("/books")
    public ModelAndView books(){
        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new Book();
        book1.setId(1);
        book1.setName("三国演义");
        book1.setAuthor("罗贯中");
        book1.setPubliccataionDate(new Date());

        Book book2 = new Book();
        book2.setId(2);
        book2.setName("西游记");
        book2.setAuthor("吴承恩");
        book1.setPubliccataionDate(new Date());

        Book book3 = new Book();
        book3.setId(3);
        book3.setName("红楼梦");
        book3.setAuthor("曹雪芹");
        book1.setPubliccataionDate(new Date());

        books.add(book1);
        books.add(book2);
        books.add(book3);
        ModelAndView mav = new ModelAndView();
        mav.addObject("books",books);
        mav.setViewName("books");
        return mav;
    }

    @GetMapping("/book")
    @ResponseBody
    public Book book(){
        Book book = new Book();
        book.setId(1);
        book.setName("三国演义");
        book.setAuthor("罗贯中");
        book.setPubliccataionDate(new Date());
        return book;
    }
}
