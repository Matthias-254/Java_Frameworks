package be.ehb.matthias_lannoo.controller;

import be.ehb.matthias_lannoo.model.dao.NewsDAO;
import be.ehb.matthias_lannoo.model.dao.ReporterDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsController {

    private final NewsDAO newsDAO;
    private final ReporterDAO reporterDAO;

    @Autowired
    public NewsController(NewsDAO newsDAO, ReporterDAO reporterDAO) {
        this.newsDAO = newsDAO;
        this.reporterDAO = reporterDAO;
    }

    @GetMapping({"/", "/index"})
    public String getIndex(){
        return "index";
    }

    @GetMapping("/new")
    public String getNew(){
        return "new";
    }

    @GetMapping("/about")
    public String getAbout(){
        return "about";
    }
}
