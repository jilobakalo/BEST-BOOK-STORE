package Liftoff.launchcode.onlinebookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
    @GetMapping("book")
    public String displaybooks(Model model){
        return "book/book";
    }
}
