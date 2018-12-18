package ru.mybatistmpl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.mybatistmpl.db.persistence.TemplateMapper;
import ru.mybatistmpl.template.Generation;
import ru.mybatistmpl.template.Masking;

import java.util.List;

@RestController
public class TemplateController {

    @Autowired
    private TemplateMapper templateMapper;

    @RequestMapping(path = "/generation", method = RequestMethod.GET)
    public List<Generation> getGenerationTableValues() {
        List<Generation> generations = templateMapper.getAllFromGeneration();
        return generations;
    }

    @RequestMapping(path = "/masking", method = RequestMethod.GET)
    public List<Masking> getMaskingTableValues() {
        List<Masking> maskings = templateMapper.getAllFromMasking();
        return maskings;
    }
}