package com.cinzia.booking.controllers;

import com.cinzia.booking.models.Study;
import com.cinzia.booking.repositories.StudyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.CustomAutowireConfigurer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/studies")
public class StudiesController {

    @Autowired
    private StudyRepository sRepository;

    @RequestMapping(value="", method = RequestMethod.GET)
    public String listStudies(Model model) {
        model.addAttribute("studies", sRepository.findAll());

        return "studies/list";


    }


    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable long id) {
        sRepository.delete(id);
        return new ModelAndView("redirect:/studies");
    }

    @RequestMapping(value="/new", method = RequestMethod.GET)
    public String newProject() {
        return "studies/new";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView create(@RequestParam("name") String sName) {
        sRepository.save(new Study(sName));
        return new ModelAndView("redirect:/studies");
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(@RequestParam("study_id") long id,
                               @RequestParam("name") String message) {
        Study study = sRepository.findOne(id);
        study.setMessage(message);
        sRepository.save(study);
        return new ModelAndView("redirect:/studies");
    }

    @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
    public String edit(@PathVariable long id,
                       Model model) {
        Study study = sRepository.findOne(id);
        model.addAttribute("study", study);
        return "studies/edit";
    }
}
