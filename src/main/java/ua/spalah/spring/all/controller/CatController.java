package ua.spalah.spring.all.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.spalah.spring.all.models.Cat;
import ua.spalah.spring.all.services.CatService;

@Controller
@RequestMapping("/cat")
public class CatController {

    @Autowired
    private CatService catService;

    @RequestMapping(method = RequestMethod.GET)
    public String find(@RequestParam(name = "id", required = false) Long id, Model model) {
        if (id != null) {
            model.addAttribute("cat", catService.findById(id));
            return "cat/one";
        } else {
            model.addAttribute("cats", catService.findAll());
            return "cat/many";
        }
    }

    @RequestMapping(path = "/edit", method = RequestMethod.GET)
    public String getEditForm(@RequestParam(name = "id", required = false) Long id, Model model) {
        Cat cat;
        if (id != null) {
            cat = catService.findById(id);
        } else {
            cat = new Cat();
        }
        model.addAttribute("cat", cat);
        return "cat/edit";
    }

    @RequestMapping(path = "/edit", method = RequestMethod.POST)
    public String edit(@ModelAttribute Cat cat) {
        if (cat.getId() != null) {
            cat = catService.update(cat);
        } else {
            cat = catService.save(cat);
        }
        return "redirect:/cat?id=" + cat.getId();
    }
}
