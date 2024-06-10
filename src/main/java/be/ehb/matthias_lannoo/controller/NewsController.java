package be.ehb.matthias_lannoo.controller;

import be.ehb.matthias_lannoo.model.dao.NewsDAO;
import be.ehb.matthias_lannoo.model.tables.News;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NewsController {

    private final NewsDAO newsDAO;

    @Autowired
    public NewsController(NewsDAO newsDAO) {
        this.newsDAO = newsDAO;
    }

    @ModelAttribute("TopNews")
    public Iterable<News> topNews(){
        return newsDAO.findTop10ByOrderByIdDesc();
    }

    @ModelAttribute("NewsForForm")
    public News newsForForm(){
        return new News();
    }

    @GetMapping({"/", "/index"})
    public String getIndex(){
        return "index";
    }

    @GetMapping("/new")
    public String getNew(){
        return "new";
    }

    @PostMapping
    public String postForm(@ModelAttribute("NewsForForm")@Valid News toSave, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return"/new";
        }
        newsDAO.save(toSave);
        return "redirect:/index";
    }

    @GetMapping("/about")
    public String getAbout(){
        return "about";
    }
}
