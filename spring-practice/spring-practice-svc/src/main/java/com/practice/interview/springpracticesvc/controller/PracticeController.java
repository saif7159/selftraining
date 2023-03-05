package com.practice.interview.springpracticesvc.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.interview.springpracticesvc.model.Book;
import com.practice.interview.springpracticesvc.model.BookBase;
import com.practice.interview.springpracticesvc.model.ClientResponseBody;

@RestController
@RequestMapping("api")
public class PracticeController {
    @GetMapping("ping/{string}")
    public ResponseEntity<String> ping(@PathVariable String string) {
        return new ResponseEntity<>("I am working", HttpStatus.OK);
    }

    @PostMapping("book/buy")
    public ClientResponseBody prepareBookOrder(@RequestBody Book book) {
        switch (BookBase.valueOf(book.getBookName())) {
            case BROTHER_KARAMAZOV:
                book.setIsbn(BookBase.BROTHER_KARAMAZOV.getIsbn());
                book.setPrice(BookBase.BROTHER_KARAMAZOV.getPrice());
                break;
            case CRIME_PUNISHMENT:
                book.setIsbn(BookBase.CRIME_PUNISHMENT.getIsbn());
                book.setPrice(BookBase.CRIME_PUNISHMENT.getPrice());
                break;
        }
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream("test.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(book);
            objectOutputStream.flush();
            fileOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            return new ClientResponseBody(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Serialization Failure");
        }
        return new ClientResponseBody(HttpStatus.OK.value(), "Data Pushed Successfully");
    }
}
