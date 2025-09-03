package thymeleaf.webapp.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.RequiredArgsConstructor;
import thymeleaf.webapp.sample.service.BooksService;

@Controller
@RequiredArgsConstructor
public class BooksController {

    private final BooksService booksService;

    @GetMapping(path = "books")
    public String books() {
        return "books";
    }
}
