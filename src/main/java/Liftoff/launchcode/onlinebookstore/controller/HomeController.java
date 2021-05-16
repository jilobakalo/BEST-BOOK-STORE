package Liftoff.launchcode.onlinebookstore.controller;

import Liftoff.launchcode.onlinebookstore.model.Book;
import Liftoff.launchcode.onlinebookstore.model.data.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class HomeController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "index";
    }

//    @GetMapping("add")
//    public String displayAddJobForm(Model model) {
//        model.addAttribute(new Book());
//        return "add";
//    }
//
//    @PostMapping("add")
//    public String processAddJobForm(@ModelAttribute @Valid Book newJob,
//                                    Errors errors) {
//
//        if (errors.hasErrors()) {
//            return "add";
//        }
//
//       bookRepository.save(newJob);
//        return "redirect:";
//    }
//
//    @GetMapping("view/{jobId}")
//    public String displayViewJob(Model model, @PathVariable int jobId) {
//
//        Optional optJob = bookRepository.findById(jobId);
//        if (!optJob.isEmpty()) {
//           Book book= (Book) optJob.get();
//            model.addAttribute("book", book);
//            return "view";
//        } else {
//            return "redirect:/";
//        }
//    }


}