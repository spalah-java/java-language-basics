package ua.spalah.spring.all.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
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
        if (cat.getId() == null) {
            cat = catService.save(cat);
        } else {
            cat = catService.update(cat);
        }
        return "redirect:/cat?id=" + cat.getId();
    }

    @RequestMapping(path = "/json/{id}", method = RequestMethod.GET)
    public @ResponseBody Cat restFind(@PathVariable("id") long id) {
        return catService.findById(id);
    }

    @RequestMapping(path = "/json", method = RequestMethod.POST)
    public @ResponseBody Long restSave(@RequestBody Cat cat) {
        return catService.save(cat).getId();
    }

    @RequestMapping(path = "/json", method = RequestMethod.PATCH)
    @ResponseStatus(value = HttpStatus.OK)
    public void restUpdate(@RequestBody Cat cat) {
        catService.update(cat);
    }
}
