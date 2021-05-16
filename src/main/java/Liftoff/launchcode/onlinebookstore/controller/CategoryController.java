package Liftoff.launchcode.onlinebookstore.controller;

import Liftoff.launchcode.onlinebookstore.model.Category;
import Liftoff.launchcode.onlinebookstore.model.data.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("Category")
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    public String displayCategory(Model model){
        model.addAttribute("title","Categories");
        model.addAttribute("categories",categoryRepository.findAll());
        return "book/book";
    }
    @GetMapping("/add")
    public String displayAddForm(Model model){
        model.addAttribute(new Category());
        model.addAttribute("title","Categories");
        return "";
    }

    @PostMapping("/add")
    public String addCategory(Model model,
                              @ModelAttribute @Valid Category category,
                              Error errors){
        return "";
    }
}
